
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
    
    add.setBounds(50, 300, 100, 30);
    sub.setBounds(160, 300, 100, 30);
    div.setBounds(280, 300, 100, 30);
    mult.setBounds(390, 300, 150, 30);
    
    add(add);
    add(sub);
    add(div);
    add(mult);
    
    l3=new JLabel("Result: ");
    l3.setBounds(50, 450, 150, 30);
    add(l3);
    result=new JTextField();
    result.setBounds(150, 450, 200, 30);
    add(result);
    
    add.addActionListener(this);
    sub.addActionListener(this);
    div.addActionListener(this);
    mult.addActionListener(this);
    
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            double num1=Double.parseDouble(t1.getText());
            double num2=Double.parseDouble(t2.getText());
            double res;
            if(e.getSource()==add){
                res=num1+num2;
                result.setText(String.valueOf(res));
            }else if(e.getSource()==sub){
                res=num1-num2;
                result.setText(String.valueOf(res));
            }else if(e.getSource()==div){
                try{
                    res=num1/num2;
                    result.setText(String.valueOf(res));
                }catch(ArithmeticException a){
                    System.out.println(e);
                    System.out.println("Cannot divided by zero...");
                }
                
            }
            else if(e.getSource()==mult){
                res=num1*num2;
                result.setText(String.valueOf(res));
            }
    
        }catch(NumberFormatException n){
            System.out.println(n);
        }
    }
    public static void main(String []arg){
        guicalculator g1=new guicalculator();
    }
}
