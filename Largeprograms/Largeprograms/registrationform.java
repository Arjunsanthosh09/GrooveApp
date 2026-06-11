package com.mycompany.practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class registrationform extends Frame implements ActionListener{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2;
    Button b1;
    Choice year;
    List branch;
    Checkbox c1,c2,c3;
    TextArea address;
    registrationform(){
        setLayout(null);
        setSize(600,600);
        setTitle("Registration form");
        l1=new Label("Name :");
        l1.setBounds(50, 70, 100, 30);
        add(l1);
        t1=new TextField();
        t1.setBounds(180,70,180,30);
        add(t1);
        
        l2=new Label("Reg no :");
        l2.setBounds(50, 120, 100, 30);
        add(l2);
        t2=new TextField();
        t2.setBounds(180,120,180,30);
        add(t2);
        
        l3=new Label("Year :");
        l3.setBounds(50, 180, 100, 30);
        add(l3);
        year=new Choice();
        year.add("I St year");
        year.add("2 nd year");
        year.add("3 rd year");
        year.setBounds(180,180,180,30);
        add(year);

        l4=new Label("Branch :");
        l4.setBounds(50, 240, 100, 30);
        add(l4);
        
        branch =new List();
        branch.add("Mca");
        branch.add("Bca");
        branch.add("BBA");
        branch.add("Mba");
        branch.setBounds(180,240,280,80);
        add(branch);
        
        l5=new Label("Subject :");
        l5.setBounds(50, 350, 100, 30);
        add(l5);
        
        c1=new Checkbox("c");
        c1.setBounds(180,350,100,30);
        add(c1);
        c2=new Checkbox("Java");
        c2.setBounds(280,350,100,30);
        add(c2);

        c3=new Checkbox("Python");
        c3.setBounds(380,350,100,30);
        add(c3);
        
        l6=new Label("Address :");
        l6.setBounds(50, 400, 100, 30);
        add(l6);
        address =new TextArea();
        address.setBounds(180,400,280,80);
        add(address);
        
        b1=new Button("submit");
        b1.setBounds(180,500,50,30);
        add(b1);
  
        b1.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JOptionPane.showMessageDialog(null,"Form submitted");
        
    }
    public static void main(String []arg){
        registrationform r=new registrationform();
    }
    
}
