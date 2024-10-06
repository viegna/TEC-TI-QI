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
   
   /**
    * @author Thiago Cury
    * @version 1.0 beta
    * @since 07/04/2014
    */
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException{

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {    
            String sql;
            
            sql = "insert into produto(idproduto,nome,valorcusto,quantidade)"
                 +"values(null, '"+pVO.getNome()+"', "+pVO.getValorCusto()+", "+pVO.getQuantidade()+")";
              
            stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar produto! "+e.getMessage());
        } finally{
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
    
}//fecha classe
