package myswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * Created by Maringa on 07.05.2017.
 */

public class MyApplication extends JFrame {
    public MyApplication(String title) throws HeadlessException {
        super(title);
        this.setLocation(100, 100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void createControlsRun() {
        JPanel myPanel = new JPanel();
        myPanel.setBackground(Color.GRAY);

        JLabel myLable = new JLabel("Run a program: ");

        List<String> actions = new ArrayList<>();
        actions.add("calc");
        actions.add("notepad");
        JComboBox myComboBox = new JComboBox(actions.toArray());

        JButton myBotton = new JButton("Run");


        myPanel.add(myLable);
        myPanel.add(myComboBox);
        myPanel.add(myBotton);

        myPanel.setLayout(new FlowLayout(0,10,10));
        this.add(myPanel);
        this.pack();

        myBotton.addActionListener(e -> {
            Runtime run = Runtime.getRuntime();
            try {
                Process process = Runtime.getRuntime().exec((String)myComboBox.getSelectedItem());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}
