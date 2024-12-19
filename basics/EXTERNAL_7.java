package basics;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class EXTERNAL_7 extends JFrame{
    public static void main(String[] args) {
        JFrame f = new JFrame("DIVISION CALUCULATOR");
        f.setLayout(new GridLayout(3,1));

        JTextField n1 = new JTextField("");
        JTextField n2 = new JTextField("");

        f.add(n1);
        f.add(n2);

        JButton div = new JButton("DIVIDE");
        f.add(div);

        JTextField result = new JTextField("");
        f.add(result);

        div.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try {
                    int num1 = Integer.parseInt(n1.getText());
                    int num2 = Integer.parseInt(n2.getText());
                    int r = num1/num2;
                    result.setText(String.valueOf(r));
                }catch (ArithmeticException ex)
                {
                    System.out.println("Can't be divided by zero");
                }catch (NumberFormatException ex)
                {
                    System.out.println("Enter numeric values only");
                }


            }

        });

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
