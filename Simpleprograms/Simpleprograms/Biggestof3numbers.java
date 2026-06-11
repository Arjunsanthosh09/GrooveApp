package com.mycompany.javalabcode;
import java.util.*;
public class Biggestof3numbers {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("enter three numbers :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is the largest");
        }else if(n2>n1 && n2>n3){
             System.out.println(n2+" is the largest");
        }else{
             System.out.println(n3+" is the largest");
        }
        sc.close();
    }
}
