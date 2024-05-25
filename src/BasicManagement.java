import Entity.Impl.Department;
import Entity.Impl.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicManagement {
  public static List<Department> listDepartment = new ArrayList<>();
  public static List<Employee> listEmployee = new ArrayList<>();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("*********************************MENU*******************************");
      System.out.println("1. Quản lý phòng ban");
      System.out.println("2. Quản lý nhân viên");
      System.out.println("3. Thoát chương trình");
      System.out.println("Xin mời bạn chọn");
      int choice = Integer.parseInt(sc.nextLine());
      switch (choice){
        case 1:
          BasicManagement.displayMenuDepartment(sc);
          break;
        case 2:
          BasicManagement.displayMenuEmployee(sc);
          break;
        default:
          System.out.println("Vui lòng chọn từ 1-3");
      }
    }while (true);
  }

  public static void displayMenuDepartment(Scanner sc){
    boolean back = true;
    do {
      System.out.println("**********************DEPARTMENT-MENU************************");
      System.out.println("1. Thêm mới phòng ban");
      System.out.println("2. Hiển thị thông tin tất cả phòng ban");
      System.out.println("3. Sửa tên phòng ban");
      System.out.println("4. Xóa phòng ban");
      System.out.println("5. Tìm kiếm phòng ban");
      System.out.println("6. Quay lại");
      System.out.println("Xin mời bạn chọn:");
      int choice = Integer.parseInt(sc.nextLine());
      switch (choice){
        case 1:
          System.out.println("Nhập vào phòng ban cần thêm mới:");
          Department department = new Department();
          department.ịnputData(sc);
          listDepartment.add(department);
          break;
        case 2:

        case 3:
          System.out.println("Nhập vào mã phòng ban cần cập nhật");
          int departmentUpdateId = sc.nextInt();
          int indexUpdate = getIndexByDepartmentId(departmentUpdateId);
          if (indexUpdate >= 0){
            listDepartment.get(indexUpdate).inputDepartmentName(sc);
            System.out.println("Cập nhật xong thông tin phòng ban");
          }else{
            System.err.println("Không tìm thấy mã danh mục "+departmentUpdateId);
          }
          break;
        case 4:
          System.out.println("Nhập vào vào tên phòng ban muốn xoá");
          String departmentNameRemove = sc.nextLine();
          removeDepartmentByDepartmentName(departmentNameRemove);
          break;
        case 5:
          System.out.println("Nhập vào tên phòng ban cần tìm:");
          String departmentName = sc.nextLine();
          int cntDepartment = 0;
          for (Department department1 :listDepartment){
            if (department1.getDepartmentName().toLowerCase().contains(departmentName.toLowerCase())){
              department1.displayData();
              cntDepartment++;
            }
          }
          System.out.println("tìm thấy "+cntDepartment+" phòng ban có tên chứa "+departmentName);
          break;
        case 6:
          back = true;
          break;
      }
    }while (back);
  }
  public static int getIndexByDepartmentId(int id){
    for (int i = 0;i < listDepartment.size();i++){
      if (listDepartment.get(i).getDepartmentId()==id){
        return i;
      }
    }
    return -1;
  }

  public static int removeDepartmentByDepartmentName(String departmentName) {
    for (int i = 0; i < listDepartment.size(); i++) {
      if (listDepartment.get(i).getDepartmentName().equals(departmentName)) {
        listDepartment.remove(i);
        System.out.println("đã xoá thành công");
      } else {
        System.err.println("không tìm thấy tên danh mục");
      }
    }
    return 0;
  }
  public static void displayMenuEmployee(Scanner sc){
    boolean back = true;
    System.out.println("*************************EMPLOYEE-MENU**************************");
    System.out.println("1. Thêm mới nhân viên");
    System.out.println("2. Hiển thị thông tin tất cả nhân viên");
    System.out.println("3. Xem chi tiết thông tin nhân viên");
    System.out.println("4. Thay đổi thông tin nhân viên");
    System.out.println("5. Xóa nhân viên");
    System.out.println("6. Hiển thị danh sách nhân viên theo phòng ban");
    System.out.println("7. Sắp xếp danh sách nhân viên");
    System.out.println("8. Quay lại");
    System.out.println("Xin mời bạn chọn:");
    int choice = Integer.parseInt(sc.nextLine());
    switch (choice){
      case 1:
        System.out.println("Nhập vào phòng ban cần thêm mới:");
        Department department = new Department();
        department.ịnputData(sc);
        listDepartment.add(department);
        break;
      case 2:

      case 3:
        System.out.println("Nhập vào mã phòng ban cần cập nhật");
        int departmentUpdateId = sc.nextInt();
        int indexUpdate = getIndexByDepartmentId(departmentUpdateId);
        if (indexUpdate >= 0){
          listDepartment.get(indexUpdate).inputDepartmentName(sc);
          System.out.println("Cập nhật xong thông tin phòng ban");
        }else{
          System.err.println("Không tìm thấy mã danh mục "+departmentUpdateId);
        }
        break;
      case 4:
        System.out.println("Nhập vào vào tên phòng ban muốn xoá");
        String departmentNameRemove = sc.nextLine();
        removeDepartmentByDepartmentName(departmentNameRemove);
        break;
      case 5:
        System.out.println("Nhập vào tên phòng ban cần tìm:");
        String departmentName = sc.nextLine();
        int cntDepartment = 0;
        for (Department department1 :listDepartment){
          if (department1.getDepartmentName().toLowerCase().contains(departmentName.toLowerCase())){
            department1.displayData();
            cntDepartment++;
          }
        }
        System.out.println("tìm thấy "+cntDepartment+" phòng ban có tên chứa "+departmentName);
        break;
      case 6:
        back = true;
        break;
    }while (back);
  }
}
