package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    public JPanel MainPanel;
    private JButton aceptarButton;
    private JButton aceptarButton1;

    public form2() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fr = new JFrame("Aplicación");
                fr.setContentPane(new form3().MainPanel);
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fr.setSize(600, 300);
                fr.setVisible(true);
            }
        });
        aceptarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fr = new JFrame("Aplicación");
                fr.setContentPane(new form4().MainPanel);
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fr.setSize(600, 300);
                fr.setVisible(true);
            }
        });
    }
}
