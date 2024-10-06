/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.ProdutoVO;
import persistencia.ConexaoBanco;

/**
 * @author Thiago Cury
 * @since 07/04/2014 - 11:46
 * @version 1.0 beta
 */
public class ProdutoDAO {
   
   //falta método
      public void cadastrarProduto(ProdutoVO produtoVO) throws SQLException {
          Connection connection = ConexaoBanco.getConexao();
          Statement statement = connection.createStatement();
        try {
            String sql = "";
            
            sql = "insert into produto(idproduto,nome,valorcusto,quantidade)"
                + "values(null,'"+produtoVO.getNome()+"',"+produtoVO.getValorCusto()+","+produtoVO.getQuantidade()+")";
            
            statement.execute(sql);
            
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao cadastrar!"
                    +sQLException.getMessage());
        } finally {
           connection.close();
           statement.close();
        } 
    }
}//fecha classe
