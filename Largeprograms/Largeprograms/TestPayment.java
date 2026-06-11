package com.mycompany.javalabcode;
import java.util.*;
interface payment{
    void pay(double amount);
}
class paypal implements payment{
    @Override
    public void pay(double amount){
        double gst=amount*0.015;
        double total=amount+gst;
        
        System.out.println("....Payment Through paypal....");
        System.out.println("GST : "+gst);
        System.out.println("Total Amount : "+total);
        
    }
}
class netBanking implements payment{
    @Override
    public void pay(double amount){
        double gst=amount*0.02;
        double total=amount+gst;
        System.out.println("....Payment Through NetBanking....");
        System.out.println("GST : "+gst);
        System.out.println("Total Amount : "+total);
        
    }
}
class CreditCard implements payment{
    @Override
    public void pay(double amount){
        double gst=amount*0.03;
        double total=amount+gst;
        System.out.println("....Payment Through Credit Card....");
        System.out.println("GST : "+gst);
        System.out.println("Total Amount : "+total);
        
    }
}
public class TestPayment {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        paypal p=new paypal();
        CreditCard c=new CreditCard();
        netBanking n=new netBanking();
        System.out.println("1. Paypal \n2. NetBanking \n 3.Credit Card\n");
        System.out.println("Enter the Payament method : ");
        int choice=sc.nextInt();
        System.out.println("Enter the amount you want to pay");
        double amount =sc.nextDouble();
        switch(choice){
            case 1:
                p.pay(amount);
                break;
            case 2:
                n.pay(amount);
                break;
            case 3:
                c.pay(amount);
                break;
            default:
                System.out.println("Invalid option....!");
        }
    }
}
