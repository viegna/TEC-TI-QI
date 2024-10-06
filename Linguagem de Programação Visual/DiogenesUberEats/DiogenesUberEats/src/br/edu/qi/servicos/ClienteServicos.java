/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.servicos;

import br.edu.qi.dao.ClienteDAO;
import br.edu.qi.dao.DAOFactory;
import br.edu.qi.modelo.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Diogenes Wilgner da Silva
 * @since 09/07/2019 - 17:20
 * @version 1.0
 */
public class ClienteServicos {

    /**
     *
     * @param cliente objeto da UI
     * @throws SQLException retorna exception no banco de dados
     */
    public void cadastrarCliente(Cliente cliente) throws SQLException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        clienteDAO.cadastrarCliente(cliente);
    }//fecha método

    /**
     *
     * @param cliente objeto da UI
     * @throws SQLException retorna exception no banco de dados
     */
    public void alterarCliente(Cliente cliente) throws SQLException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        clienteDAO.alterarCliente(cliente);
    }//fecha método

    /**
     *
     * @param cliente objeto da UI
     * @throws SQLException retorna exception no banco de dados
     */
    public void deletarCliente(long id) throws SQLException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        clienteDAO.deletarCliente(id);
    }//fecha método

    /**
     *
     * @return - retorna a busca do cliente
     * @throws SQLException retorna exception no banco de dados
     */
    public ArrayList<Cliente> buscarCliente()
            throws SQLException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        return clienteDAO.buscarClientes();
    }//fecha buscarCliente

    /**
     *
     * @param pesquisa - recebe a pesquisa do usuario
     * @param filtro - recebe o filtro selecionado pelo usuario
     * @return
     * @throws SQLException
     */
    public ArrayList<Cliente> filtrar(String pesquisa, String filtro)
            throws SQLException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        return clienteDAO.filtrar(pesquisa, filtro);
    }//fecha filtrar cliente
}//fecha classe

