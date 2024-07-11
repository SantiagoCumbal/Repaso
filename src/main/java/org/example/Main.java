package org.example;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //EJERCICIO 1
        //Objeto
        Scanner x = new Scanner(System.in);
        Estudiantes new1 = new Estudiantes();

        //Ingreso SQL
        String url = "jdbc:mysql://localhost:3306/estudiantes24A";
        String usuario = "root";
        String password = "12345";
        String sql = "INSERT INTO estudiantes (cedula, nombre, b1, b2) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, usuario, password)) {
            System.out.println("Conectado a la base de datos");
            System.out.println("Ingrese la cedula del estudiante: ");
            new1.setCedula(x.nextLine());
            System.out.println("Ingrese el nombre del estudiante: ");
            new1.setNombre(x.nextLine());
            System.out.println("Ingrese la nota B1 del estudiante: ");
            new1.setB1(x.nextFloat());
            System.out.println("Ingrese la nota B2 del estudiante: ");
            new1.setB2(x.nextFloat());
            PreparedStatement cadenaPreparada = connection.prepareStatement(sql);
            cadenaPreparada.setString(1,new1.getCedula());
            cadenaPreparada.setString(2,new1.getNombre());
            cadenaPreparada.setDouble(3,new1.getB1());
            cadenaPreparada.setDouble(4,new1.getB2());
            cadenaPreparada.executeUpdate();
            System.out.println("Los datos fueron registrados correctamente");

        } catch (SQLException e1) {
            System.out.println(e1.getMessage());
        }*/
        /*
        //Ejercicio 2
        JFrame fr = new JFrame("Aplicación");
        fr.setContentPane(new form1().MainPanel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(700, 700);
        fr.setVisible(true);
         */

        //Ejercicio 3
        JFrame fr = new JFrame("Aplicación");
        fr.setContentPane(new form2().MainPanel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(600, 300);
        fr.setVisible(true);
    }
}