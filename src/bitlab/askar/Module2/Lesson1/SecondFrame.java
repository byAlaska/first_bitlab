package bitlab.askar.Module2.Lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondFrame extends JPanel {

    MainFrame parent;

    public SecondFrame(MainFrame mainFrame) {

        setSize(500,500);

        this.parent = mainFrame;

        JButton backButton = new JButton("Back");
        backButton.setSize(100,100);
        backButton.setLocation(100,100);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                parent.menu.setVisible(true);
            }
        });
        add(backButton);

    }
}
