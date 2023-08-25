package com.company;

import javax.swing.*;
import java.awt.*;

public class View {
    private Controller controller;
    //private JTextField resultField;
    //private JTextField secondField;
    private JTextField textField;


    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void create() {
        JFrame frame = new JFrame();
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.getContentPane().setBackground(Color.ORANGE);

        textField = new JTextField();
        textField.setBounds(20, 20, 160, 50);
        frame.add(textField);

        /*
        secondField = new JTextField();
        secondField.setBounds(120, 20, 100, 50);
        frame.add(secondField);

        resultField = new JTextField();
        resultField.setBounds(240, 20, 100, 50);
        frame.add(resultField);

        JButton addButton = new JButton("+");
        addButton.setBounds(20, 100, 100, 50);
        frame.add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.handleAddButtonClick();
            }
        });*/

        JButton addButton = new JButton("+");
        addButton.setBounds(80, 100, 100, 50);
        addButton.addActionListener(e -> controller.handleButtonClick('+'));
        frame.add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(80, 170, 100, 50);
        subtractButton.addActionListener(e -> controller.handleButtonClick('-'));
        frame.add(subtractButton);

        JButton multiplyButton = new JButton("x");
        multiplyButton.setBounds(80, 240, 100, 50);
        multiplyButton.addActionListener(e -> controller.handleButtonClick('*'));
        frame.add(multiplyButton);

        JButton equalsButton = new JButton("=");
        equalsButton.setBounds(80, 310, 100, 50);
        equalsButton.addActionListener(e -> controller.handleEqualsButtonClick());
        frame.add(equalsButton);

        frame.setVisible(true);
    }

    public int getNumber() {
        return Integer.parseInt(textField.getText());
    }

    public void setResult(int result) {
        textField.setText(String.valueOf(result));
    }

    public void clearField() {
        textField.setText("");
    }

    public void moveCursor() {
        textField.requestFocus();
        textField.setCaretPosition(0);
    }

    /*
    public void setResult(int result) {
        resultField.setText(String.valueOf(result));
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstField.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondField.getText());
    }

    public String getResultFieldText() {
        return resultField.getText();
    }*/
}
