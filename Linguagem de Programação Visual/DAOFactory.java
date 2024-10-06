/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;

/**
 *
 * @author Diogenes Wilgner da Silva Oliveira
 * @version 1.0
 * @since 09/07/2019 - 17:27
 */
public class DAOFactory {
    private static final ClienteDAO CLIENTEDAO
            = new ClienteDAO();

    public static ClienteDAO getClienteDAO() {
        return CLIENTEDAO;
    }
}//fecha classe
