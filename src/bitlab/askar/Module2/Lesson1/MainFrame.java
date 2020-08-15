package bitlab.askar.Module2.Lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {


    Menu menu;
    SecondFrame secondFrame;

    Integer[] ages = new Integer[100];

    public MainFrame(){

        setLayout(null);
        setSize(500,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");


        menu = new Menu(this);
        menu.setVisible(true);
        add(menu);

        setVisible(false);

        secondFrame = new SecondFrame(this);
        secondFrame.setVisible(false);
        add(secondFrame);


        for (int i=1;i<=100;i++){
            ages[i-1] = i;
        }

        JLabel label = new JLabel("Text of label");
        label.setSize(150,30);
        label.setLocation(100,100);
        add(label);


        JTextField textField = new JTextField();
        textField.setSize(150,30);
        textField.setLocation(260,100);
        add(textField);


        JTextArea area = new JTextArea();
        area.setSize(200,200);
        area.setLocation(100,180);
        add(area);


        JComboBox comboBox = new JComboBox(ages);
        comboBox.setSize(70,30);
        comboBox.setLocation(420,100);
        add(comboBox);


        JButton button = new JButton("Press");
        button.setSize(100,30);
        button.setLocation(100,140);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                int choice = (Integer)comboBox.getSelectedItem();
                area.append(text + " " + choice + "\n");
                textField.setText("");
            }
        });
        add(button);

    }
}
