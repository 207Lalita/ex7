/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.List;
import model.Department;
import model.DepartmentTable;
import model.Employee;
import model.EmployeeTable;

/**
 *
 * @author ACER
 */
public class Ex7_Report {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       List<Employee> employee;
       employee = EmployeeTable.findAllEmployee();
       System.out.print("All employee (by ID)");
       System.out.println("----------------------------------------");
       employee.forEach(emp->{
           System.out.println("ID: " + emp.getDepartmentid());
           System.out.println("Name: " + emp.getName());
           System.out.println("ID: " + emp.getJob());
           System.out.println("ID: " + emp.getSalary());
           System.out.println("ID: " + emp.getDepartmentid());
           System.out.println("----------------------------------------");
       });
       
       List<Department> department = DepartmentTable.findAllDepartment();
       System.out.print("All employee (by Department)");
       System.out.println("----------------------------------------");
       department.forEach(dep->{
           System.out.println("Department ID: " + dep.getDepartmentid());
           System.out.println("Department Name: " + dep.getName());
           System.out.println("----------------------------------------");
           employee.forEach(emp->{
            if(emp.getDepartmentid().getDepartmentid().equals(dep.getDepartmentid()))
            {
                System.out.println("ID: " + emp.getEmployeeid());
                System.out.println("Name: " + emp.getName());
                System.out.println("ID: " + emp.getJob());
                System.out.println("ID: " + emp.getSalary());
                System.out.println("----------------------------------------");
            }
            });
        });
       
       
    }
    
}
