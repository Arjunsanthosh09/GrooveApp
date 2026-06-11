
package com.mycompany.javalabcode.employeeinfo;

public class employeedetails {
    public int id;
    public String name;
    public String department;
    public employeedetails(int id , String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }
    public void display(){
        System.out.println("Employee Details :\n Id: "+id+"\nName : "+name+" Department : "+department);
    }
    
}
