package com.mycompany.javalabcode;
import com.mycompany.javalabcode.employeeinfo.employeedetails;
import com.mycompany.javalabcode.employeesalary.salary;
public class Packagedemo {
    public static void main(String[] args) {
        employeedetails emp =new employeedetails(101,"Arjun","Computer");
        salary sal = new salary(25000);
        emp.display();
        System.out.println("Computed Salary: " +sal.calc());
    }
}