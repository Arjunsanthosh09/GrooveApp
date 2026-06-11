package com.mycompany.javalabcode;
import java.util.*;

abstract class shape{
    abstract void area();
}
class rectangle extends shape{
   int len,breadth;
   rectangle(int len,int br){
       this.len=len;
       this.breadth=br;
   }
   @Override
   public void area(){
       System.out.println("-----Rectangle-------");
       System.out.println("Area of the rectangle is :" +(len*breadth));
   }
}
class circle extends shape{
    double r;
    circle(double r){
        this.r=r;
    }
    @Override
   public void area(){
        System.out.println("-----Circle-------");
       System.out.println("Area of the circle is :" +(3.14*r*r));
   }
}
public class Shapeclient {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int b=sc.nextInt();
        System.out.println("Enter the radius of the cicle: ");
        double r=sc.nextDouble();
        circle c=new circle(r);
        rectangle re=new rectangle(l,b);
        c.area();
        re.area();
        sc.close();
    }
}
