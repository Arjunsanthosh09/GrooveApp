
package com.mycompany.javalabcode;

import java.io.File;
import java.io.*;
import java.util.*;

public class FIlereading {
    public static void main(String []arg){
        File obj = new File(
    "src/main/java/com/mycompany/javalabcode/Hai.txt"
);
        try{
            Scanner sc=new Scanner(obj);
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found ....");
            System.out.println(e);
        }    }
}
