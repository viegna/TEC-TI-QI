/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicos;

import dao.DAOFactory;
import dao.ProdutoDAO;
import java.sql.SQLException;
import modelo.ProdutoVO;

/**
 * @author Thiago Cury
 * @since 07/04/2014 - 11:46
 * @version 1.0 beta
 */
public class ProdutoServicos {
    
    //falta método
     public void cadastrarProduto(ProdutoVO produtoVO) throws SQLException {
         ProdutoDAO produtoDAO = DAOFactory.getProdutoDAO();
        produtoDAO.cadastrarProduto(produtoVO);
    }
    
}//fecha classe
