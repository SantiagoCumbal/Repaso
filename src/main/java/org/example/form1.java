package org.example;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel MainPanel;
    private JTextField TCedula;
    private JTextField TB2;
    private JTextField TB1;
    private JTextField TNombre;
    private JButton aceptarButton;
    String url = "jdbc:mysql://localhost:3306/estudiantes24A";
    String usuario = "root";
    String password = "12345";
    String sql = "INSERT INTO estudiantes (cedula, nombre, b1, b2) VALUES (?, ?, ?, ?)";
    public form1() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estudiantes new2 = new Estudiantes();
                new2.setCedula(TCedula.getText());
                new2.setNombre(TNombre.getText());
                new2.setB1(Float.parseFloat(TB1.getText()));
                new2.setB2(Float.parseFloat(TB2.getText()));

                try (Connection connection = DriverManager.getConnection(url, usuario, password)) {
                    System.out.println("Conectado a la base de datos");
                    PreparedStatement cadenaPreparada = connection.prepareStatement(sql);
                    cadenaPreparada.setString(1,new2.getCedula());
                    cadenaPreparada.setString(2,new2.getNombre());
                    cadenaPreparada.setDouble(3,new2.getB1());
                    cadenaPreparada.setDouble(4,new2.getB2());
                    cadenaPreparada.executeUpdate();
                    System.out.println("Los datos fueron registrados correctamente");


                } catch (SQLException e1) {
                    System.out.println(e1.getMessage());
                }
            }
        });
    }
}
