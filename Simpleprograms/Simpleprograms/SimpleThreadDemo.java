
package com.mycompany.practice;

class oddthread extends Thread{
    public void run(){
        try{
           for(int i=1;i<=10;i++){
            if(i%2==1){
                System.out.println(i+" is odd ");
                Thread.sleep(1000);
            }  
        }
 
        }catch(Exception e){
            System.out.println(e);
        }
     }
}
class eventhread extends Thread{
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    System.out.println(i+" is even");
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class threaddemo {
    public static void main(String []arg){
        oddthread t1=new oddthread();
        eventhread t2=new eventhread();
        t1.start();
        t2.start();
    }
}
