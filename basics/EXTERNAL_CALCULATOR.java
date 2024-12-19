package basics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class EXTERNAL_CALCULATOR {
    public static void main(String[] args) {
        JFrame f = new JFrame("CALCULATOR");
        f.setLayout(new GridLayout(4,4));
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton add = new JButton("+");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton sub = new JButton("-");
        JButton equal = new JButton("=");
        JTextField answer = new JTextField();
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        f.add(zero);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(equal);
        f.add(answer);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"1");
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"2");
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"3");
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"4");
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"5");
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"6");
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"7");
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"8");
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"9");
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"0");
            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"+");
            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"-");
            }
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"*");
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText()+"%");
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = answer.getText();
                String[] arr = s.split("[+*%-]");
                int a = Integer.parseInt(arr[0]);
                int b =Integer.parseInt(arr[1]);
                int c=0;
                if(s.contains("+"))
                {
                    c=a+b;
                }
                else if(s.contains("-"))
                {
                    c=a-b;
                }
                else if(s.contains("*"))
                {
                    c=a*b;
                }
                else if(s.contains("%"))
                {
                    c=a/b;
                }
                answer.setText(String.valueOf(c));
            }
        });
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
