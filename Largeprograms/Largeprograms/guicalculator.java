import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GuiCalculator extends JFrame implements ActionListener {
    JTextField display;
    JButton[] buttons;
    String[] text = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", "C", "=", "+"
    };
    double num1, num2, result;
    String operator;
    public GuiCalculator() {
        setTitle("Calculator");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));
        buttons = new JButton[text.length];
        for (int i = 0; i < text.length; i++) {
            buttons[i] = new JButton(text[i]);
        }
        for (JButton btn : buttons) {
            btn.addActionListener(this);
            panel.add(btn);
        }
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.matches("[0-9]")) {
            display.setText(display.getText() + cmd);
        }
        else if (cmd.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            display.setText("");
        }
        else if (cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        display.setText("Cannot divide by zero");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
        }
        else if (cmd.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = "";
        }
    }
    public static void main(String[] args) {
        new GuiCalculator();
    }
}
