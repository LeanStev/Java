package com.mycompany.practica.database1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class PracticaDataBase1 {

    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/animes","root","Admin");
            
            Statement sentencia = conexion.createStatement();
            ResultSet resultSet = sentencia.executeQuery("select * from animes");
            
            while(resultSet.next()){
                System.out.println("Mostrar nombres");
                System.out.println(resultSet.getString("nombre"));
            }
            
            resultSet.close();
            sentencia.close();
            
            
            conexion.close();
        }  
        catch(ClassNotFoundException | SQLException ex){
        System.out.println(ex.getMessage());
        }         
    }
}
