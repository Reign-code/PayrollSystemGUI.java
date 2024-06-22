package com.company.payroll;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayrollSystem extends JFrame {
    private JTextField nameField, addressField, deductionsField, taxField, overtimeField, attendanceField, payDateField;
    private JButton submitButton, clearButton;
    private JTextArea displayArea;

    public PayrollSystem() {
        setTitle("Employee Payroll System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2));

        // Initialize components
        nameField = new JTextField();
        addressField = new JTextField();
        deductionsField = new JTextField();
        taxField = new JTextField();
        overtimeField = new JTextField();
        attendanceField = new JTextField();
        payDateField = new JTextField();

        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        // Add components to the frame
        add(new JLabel("Employee Name:"));
        add(nameField);
        add(new JLabel("Address:"));
        add(addressField);
        add(new JLabel("Deductions:"));
        add(deductionsField);
        add(new JLabel("Tax:"));
        add(taxField);
        add(new JLabel("Overtime:"));
        add(overtimeField);
        add(new JLabel("Attendance:"));
        add(attendanceField);
        add(new JLabel("Pay Date:"));
        add(payDateField);

        add(submitButton);
        add(clearButton);
        add(new JLabel("Display:"));
        add(new JScrollPane(displayArea));

        // Set button actions
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressField.getText();
                String deductions = deductionsField.getText();
                String tax = taxField.getText();
                String overtime = overtimeField.getText();
                String attendance = attendanceField.getText();
                String payDate = payDateField.getText();

                String displayText = String.format("Employee Name: %s%nAddress: %s%nDeductions: %s%nTax: %s%nOvertime: %s%nAttendance: %s%nPay Date: %s%n",
                        name, address, deductions, tax, overtime, attendance, payDate);
                
                displayArea.setText(displayText);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                addressField.setText("");
                deductionsField.setText("");
                taxField.setText("");
                overtimeField.setText("");
                attendanceField.setText("");
                payDateField.setText("");
                displayArea.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PayrollSystem().setVisible(true);
            }
        });
    }
}
