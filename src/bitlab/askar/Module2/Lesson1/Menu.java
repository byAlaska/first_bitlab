package bitlab.askar.Module2.Lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {


    MainFrame parent;

    public Menu(MainFrame mainFrame) {

        setLayout(null);
        setSize(500,500);

        this.parent = mainFrame;


        JButton mainButton = new JButton("Main");
        mainButton.setSize(100,50);
        mainButton.setLocation(100,100);
        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                parent.setVisible(true);
            }
        });
        add(mainButton);


        JButton secondButton  = new JButton("Second");
        secondButton.setSize(100,50);
        secondButton.setLocation(100,300);
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                parent.secondFrame.setVisible(true);
            }
        });
        add(secondButton);

    }
}
