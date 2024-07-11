package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class form4 {
    private JButton buscarButton;
    private JTextField ingreseLaCedulaDelTextField;
    private JTextField TB2;
    private JTextField TC;
    private JTextField TB1;
    private JTextField TN;
    public JPanel MainPanel;
    String url = "jdbc:mysql://localhost:3306/estudiantes24A";
    String usuario = "root";
    String password = "12345";
    public form4() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (Connection connection = DriverManager.getConnection(url, usuario, password)) {
                    System.out.println("Conectado a la base de datos");
                    String query = "select * from Estudiantes where cedula = '" + ingreseLaCedulaDelTextField.getText() + "'";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        System.out.print(resultSet.getString("cedula"));
                        TN.setText(resultSet.getString("nombre"));
                        TC.setText(resultSet.getString("cedula"));
                        TB1.setText(resultSet.getString("b1"));
                        TB2.setText(resultSet.getString("b2"));

                    }
                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                }

            }
        });
    }
}
