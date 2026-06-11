
package com.mycompany.javalabcode.employeesalary;

public class salary {
    double basicsal;
    public salary(double sal){
        this.basicsal=sal;
    }
    public double calc(){
        return basicsal+(0.2*basicsal);
    }
}
