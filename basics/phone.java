package basics;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.util.*;



public class phone extends JFrame{
    private JTextField nameField, passwordField, emailField, contactField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JCheckBox javaCheckbox, pythonCheckbox, cppCheckbox;
    private JComboBox<String> cityComboBox;
    private JLabel resultLabel;
    public phone(){
        setTitle("Job Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
// Create components
        nameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emailField = new JTextField(20);
        contactField = new JTextField(20);
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        javaCheckbox = new JCheckBox("Java");
        pythonCheckbox = new JCheckBox("Python");
        cppCheckbox = new JCheckBox("C++");
        String[] cities = {"Select City", "New York", "London", "Tokyo"};
        cityComboBox = new JComboBox<>(cities);
        JButton submitButton = new JButton("Submit");
        resultLabel = new JLabel();
// Set layout
        setLayout(new GridLayout(8, 2));
// Add components to the frame
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Contact Number:"));
        add(contactField);
        add(new JLabel("Gender:"));
        add(maleRadioButton);
        add(new JLabel(""));
        add(femaleRadioButton);
        add(new JLabel("Languages Known:"));
        add(javaCheckbox);
        add(pythonCheckbox);
        add(cppCheckbox);
        add(new JLabel("City:"));
        add(cityComboBox);
        add(new JLabel(""));
        add(submitButton);
        add(new JLabel(""));
        add(resultLabel);
// Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultLabel.setText("Registration Successful");
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new phone().setVisible(true);
            }
        });
    }
}
