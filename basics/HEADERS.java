package basics;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import java.awt.*;
import javax.swing.*;
public class HEADERS extends JFrame{
    private static final String FILE_PATH = "C:\\Users\\Vignesh\\java\\src\\basics\\blavl.txt";
    public static void main(String[] args) {
        JFrame f = new JFrame("TABLE");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(0,2));
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH)))
        {
            String headerline = reader.readLine();
            String[] headers = headerline.split(",");
            for(String h: headers)
            {
                JLabel label = new JLabel(h);
                panel.add(label);
            }
            String line;
            while((line= reader.readLine())!=null)
            {
                String[] data = line.split(",");
                for (String element : data )
                {
                    JLabel label = new JLabel(element);
                    panel.add(label);
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        f.add(panel);
        f.setSize(400,300);
        f.setVisible(true);
    }
}
