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

    public void alterarCliente(Cliente cliente) throws SQLException {
        ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
        clienteDAO.alterarCliente(cliente);
    }//fecha método

    public void deletarCliente(long id) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.deletarProduto(id);
    }//fecha método

    public ArrayList<ProdutoVO> buscarProdutos()
            throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.buscarProdutos();
    }//fecha buscarProdutos

    public ArrayList<ProdutoVO> filtrar(String pesquisa, String filtro
     throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.filtrar(pesquisa, filtro);
    }//fecha buscarProdutos
}//fecha classe

