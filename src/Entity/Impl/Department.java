package Entity.Impl;

import Entity.IDepartment;
import java.util.Scanner;

public class Department implements IDepartment {
  private int departmentId = 0;
  private  String departmentName;

  public Department() {
  }

  public Department(int departmentId, String departmentName) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
  }

  public int getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  @Override
  public void ịnputData(Scanner sc) {
    inputDepartmentId();
    inputDepartmentName(sc);
  }
  public void inputDepartmentName(Scanner sc){
    System.out.println("Nhập vào tên phòng ban;");
    this.departmentName = sc.nextLine();
  }

  public void inputDepartmentId(){
    departmentId++;
  }

  @Override
  public void displayData() {
    System.out.println("MÃ PHÒNG BAN:"+departmentId);
    System.out.println("TÊN PHÒNG BAN:"+departmentName);
  }
}
