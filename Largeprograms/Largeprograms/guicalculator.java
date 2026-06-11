
package com.mycompany.practice;



import javax.swing.*;
import java.awt.event.*;
public class guicalculator extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JButton add,sub,div,mult;
    JTextField t1,t2,result;
    public guicalculator() {
    setSize(600,600);
    setTitle("Calculator");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(null);  
    l1 = new JLabel("Enter First number:");
    l1.setBounds(50, 100, 150, 30);
    add(l1);
    
    t1=new JTextField();
    t1.setBounds(200, 100, 150, 30);
    add(t1);

    l2 = new JLabel("Enter Second number:");
    l2.setBounds(50, 200, 150, 30);
    add(l2);
    
    t2=new JTextField();
    t2.setBounds(200, 200, 150, 30);
    add(t2);
    
    add=new JButton("add");
    sub=new JButton("Substract");
    div=new JButton("Division");
    mult=new JButton("Multiplication");
    
    add.setBounds(50, 300, 150, 30);
    sub.setBounds(100, 300, 150, 30);
    
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String []arg){
        guicalculator g1=new guicalculator();
    }
}
