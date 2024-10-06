/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.persistencia;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 16:10
 * @version 1.0 beta
 */
public class ConexaoBanco {

    private static String URL = "jdbc:mysql://localhost:3306/XXXX";
    private static String USUARIO = "root";
    private static String SENHA = "root";
    
    //Conexão com o MySQL
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao conectar! " + sQLException.getMessage());
        }//fecha catch
        return connection;
    }//fecha Connection
}//fecha ConexaoBanco
