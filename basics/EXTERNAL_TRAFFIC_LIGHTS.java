package basics;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class EXTERNAL_TRAFFIC_LIGHTS extends JFrame{
    public static void main(String[] args)
    {
        JFrame f= new JFrame("TRAFFIC LIGHTSTIMULATOR");
                f.setLayout(new GridLayout(3,4));
        JCheckBox red= new JCheckBox("RED");
        red.setBackground(Color.RED);
        JCheckBox yellow=new JCheckBox("Yellow");
        yellow.setBackground(Color.YELLOW);
        JCheckBox green = new JCheckBox("Green");
        green.setBackground(Color.GREEN);
        JTextField answer= new JTextField("");
        red.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(red.isSelected())
                {
                    answer.setText("STOP");
                    green.setSelected(false);
                    green.setSelected(false);
                }
            }


        });
        yellow.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(yellow.isSelected())
                {
                    answer.setText("Ready");
                    red.setSelected(false);
                    green.setSelected(false);
                }
            }

        });
        green.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        if(green.isSelected())
                                        {
                                            answer.setText("go");
                                            red.setSelected(false);
                                            green.setSelected(false);
                                        }
                                    }
                                }
        );
        f.add(red);
        f.add(yellow);
        f.add(green);
        f.add(answer);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation( EXIT_ON_CLOSE);
    }


}
