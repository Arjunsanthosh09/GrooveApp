
package com.mycompany.javalabcode;
import java.io.*;
import java.util.*;
public class Filewriteexample {
    public static void main(String []arg){
        try{
            FileWriter fc=new FileWriter("src/main/java/com/mycompany/javalabcode/Hai.txt");
            fc.write("This is an simple example of how writing to a file in java");
            fc.close();
            System.out.println("Writted succesfully to the file");
            
            File obj=new File("src/main/java/com/mycompany/javalabcode/Hai.txt");
            Scanner sc=new Scanner(obj);
            System.out.println("Content of the file now is ");
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
        }catch(IOException e){
            System.out.println("Error occured "+e);
        }   
    }
}
