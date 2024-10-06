/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diogenes Wilgner 
 * @version 1.0
 * @since 09/07/2019 - 17:24
 */
public class ConexaoBanco {

    //Atributos estáticos com os dados do Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/ubereatspf";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    //Método que efetua a conexão com o MySQL
    public static Connection getConexao() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao conectar! " + sQLException.getMessage());
        }//fecha catch
        return connection;
    }//fecha metodo
    
}//fecha classe

