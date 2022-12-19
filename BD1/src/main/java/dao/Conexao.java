/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rober
 */
public class Conexao {

    public Connection getConnection;
    
    public Connection getConnection(){
        Connection conexao = DriverManager("jdbc:postgresql://localhost:5432/ConflitoBelico","postgres","meudeus123");
        return conexao;
    }

    private Connection DriverManager(String jdbcpostgresqllocalhost5432ConflitoBelico, String postgres, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
