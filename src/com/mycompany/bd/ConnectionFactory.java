/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private final String usuario = "root";
    private final String senha = "admin@12345";
    private final String host = "localhost";
    private final String porta = "3306";
    private final String bd = "db_placa";
    
 public Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC",
                    usuario,
                    senha
            );
            return c;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
