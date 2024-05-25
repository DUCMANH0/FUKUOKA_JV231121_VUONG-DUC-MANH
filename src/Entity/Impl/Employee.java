package Entity.Impl;

import Entity.IEmployee;
import java.util.Date;
import java.util.Scanner;

public class Employee implements IEmployee {
 private int employeeId = 0;
 private String employeeName;
 private String email;
 private String phoneNumber;
 private String address;

 private enum gender{MALE,FEMALE,ORTHER};
 private Date birthday;
 private float basicSalary;
 private float allowanceSalary;
 private float rate;
 private  int departmentId;

 public Employee() {
 }

 public Employee(int employeeId, String employeeName, String email, String phoneNumber,
     String address, Date birthday, float basicSalary, float allowanceSalary, float rate,
     int departmentId) {
  this.employeeId = employeeId;
  this.employeeName = employeeName;
  this.email = email;
  this.phoneNumber = phoneNumber;
  this.address = address;
  this.birthday = birthday;
  this.basicSalary = basicSalary;
  this.allowanceSalary = allowanceSalary;
  this.rate = rate;
  this.departmentId = departmentId;
 }

 public int getEmployeeId() {
  return employeeId;
 }

 public void setEmployeeId(int employeeId) {
  this.employeeId = employeeId;
 }

 public String getEmployeeName() {
  return employeeName;
 }

 public void setEmployeeName(String employeeName) {
  this.employeeName = employeeName;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public Date getBirthday() {
  return birthday;
 }

 public void setBirthday(Date birthday) {
  this.birthday = birthday;
 }

 public float getBasicSalary() {
  return basicSalary;
 }

 public void setBasicSalary(float basicSalary) {
  this.basicSalary = basicSalary;
 }

 public float getAllowanceSalary() {
  return allowanceSalary;
 }

 public void setAllowanceSalary(float allowanceSalary) {
  this.allowanceSalary = allowanceSalary;
 }

 public float getRate() {
  return rate;
 }

 public void setRate(float rate) {
  this.rate = rate;
 }

 public int getDepartmentId() {
  return departmentId;
 }

 public void setDepartmentId(int departmentId) {
  this.departmentId = departmentId;
 }


 @Override
 public void ịnputData(Scanner sc) {
  inputEmployeeId();
  inputEmployeeName(sc);
 }
 public void inputEmployeeId(){
  employeeId++;
 }
 public void inputEmployeeName(Scanner sc){
  System.out.println("Nhập vào tên nhân viên:");
  this.employeeName = sc.nextLine();
 }
 public void inputEmail(Scanner sc){
  System.out.println("Nhập vào email:");
  this.email = sc.nextLine();
 }
 

 @Override
 public void displayData() {

 }

 @Override
 public void calTotalSalary() {

 //totalSalary = basicSalary * rate * allowanceSalary;
 }


}
