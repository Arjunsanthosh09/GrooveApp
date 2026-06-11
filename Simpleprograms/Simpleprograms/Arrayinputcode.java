package com.mycompany.javalabcode;
import java.util.*;
public class Arrayinputcode {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int i;
        int []ar=new int[5];
        System.out.println("Enter the Elements into the array :");
        for(i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Array elements are :");
        for(i=0;i<ar.length;i++){
            System.out.println(ar[i]+"\t");
        }
        System.out.println("Enhanced for loop");
        for (int j : ar) {
           System.out.println(j+"\t"); 
        }
    }
}
