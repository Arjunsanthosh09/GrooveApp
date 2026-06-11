
package com.mycompany.javalabcode;
import java.util.*;
class person{
    public int id;
    public int age;
    String name;
    person(int id , String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        
    }  
}
class Faculityinherited extends person{
    String department;
    Double salary;
    Faculityinherited(int id,String name,int age,String depart,Double salary){
        super(id,name,age);
        this.department=depart;
        this.salary=salary;
    }
    public void display(){
        System.out.println("--- Details of the Teacher ----");
        super.display();
        System.out.println("Department : "+department);
        System.out.println("Salary : "+salary);
    }
}

public class faculity {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id :");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name :");
        String name=sc.nextLine();
        System.out.println("Enter the age :");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the department :");
        String dept=sc.nextLine();
        System.out.println("Enter the salary :");
        Double salary = sc.nextDouble();
        Faculityinherited f=new Faculityinherited(id,name,age,dept,salary);
        f.display();
        sc.close();
    }
}

