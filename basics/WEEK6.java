package basics;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;






public class WEEK6 extends JFrame implements ActionListener {
    JLabel label1, label2;
    JTextField textField;
    JButton calculateButton;
    JTextArea resultArea;

    public WEEK6() {
        label1 = new JLabel("Enter any integer value: ");
        textField = new JTextField(5);
        calculateButton = new JButton("Calculate");
        label2 = new JLabel("Factorial of given integer number is ");
        resultArea = new JTextArea(10, 30);

        setLayout(new FlowLayout());

        add(label1);
        add(textField);
        add(calculateButton);
        add(label2);
        add(resultArea);

        calculateButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            int fact = fact(Integer.parseInt(textField.getText()));
            resultArea.setText("Value: " + fact);
        }
    }

    int fact(int f) {
        if (f == 0)
            return 1;
        else
            return f * fact(f - 1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WEEK6::new);
    }


}
