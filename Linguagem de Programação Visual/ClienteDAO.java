/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;

import br.edu.qi.modelo.Cliente;
import br.edu.qi.persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Diogenes Wilgner
 * @since 09/07/2019 - 17:29
 * @version 1.0
 */
public class ClienteDAO {

    public void cadastrarCliente(Cliente cliente) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statementt = connection.createStatement();

        try {
            String sql;
            sql = "insert into cliente(nome,cpf,cidade,estado,numero,rua,tipodepagamento)"
                    + "values('" + cliente.getNome() + "'"
                    + ",'" + cliente.getCPF() + "'"
                    + ",'" + cliente.getCidade() + "'"
                    + ",'" + cliente.getEstado() + "'"
                    + "," + cliente.getNumero() + ""
                    + ",'" + cliente.getRua() + "'"
                    + ",'" + cliente.getTipoDePagamento() + "'" + ")";

            //Executando o sql
            statementt.execute(sql);
        } catch (SQLException exception) {
            throw new SQLException("Erro ao inserir cliente!");
        } finally {
            connection.close();
            statementt.close();
        }//fecha finally
    }//fecha método
    public ArrayList<ProdutoVO> buscarProdutos()
            throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql = "select * from produto";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ProdutoVO> produtos = new ArrayList<>();
            while (rs.next()) {
                ProdutoVO p = new ProdutoVO();
                p.setIdProduto(rs.getLong("idproduto"));
                p.setNome(rs.getString("nome"));
                p.setValorCusto(rs.getDouble("valorcusto"));o
                p.setQuantidade(rs.getInt("quantidade"));
                produtos.add(p);//nao pode esquecer
            }
            return produtos;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos!" + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }//fecha buscarProdutos

    public ArrayList<Cliente> filtrar(String pesquisa,
            String filtro) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();
        try {
            String query = "";
            if (filtro.equalsIgnoreCase("cpf")) {
                query = "where cpf = " + pesquisa;
            }else if(filtro.equalsIgnoreCase("nome")) {
                query = "where nome like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("cidade")) {
                query = "where cidade like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("estado")) {
                query = "where estado like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("numero")) {
                query = "where numero like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("rua")) {
                query = "where rua like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("tipodepagamento")) {
                query = "where tipodepagamento like '%" + pesquisa + "%'";
            }

            String sql = "select * from produto " + query;
            
                 ResultSet resultSet = statement.executeQuery(sql);
                ArrayList<Cliente> clientes = new ArrayList<>();
                while (resultSet.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setCPF(resultSet.getString("cpf"));
                    cliente.setCidade(resultSet.getString("cidade"));
                    cliente.setEstado(resultSet.getString("estado"));
                    cliente.setRua(resultSet.getString("rua"));//-----------------parei aq
                    
                    clientes.setQuantidade(resultSet.getInt("quantidade"));
                    clientes.add(cliente);//nao pode esquecer
                }
                return produtos;
            }catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos!" + e.getMessage());
        }finally {
            stat.close();
            con.close();
        }
        }//fecha filtrarProdutos

    

    public void deletarProduto(long id) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "delete from produto where idproduto = " + id;

            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar produto! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public void alterarProduto(ProdutoVO pVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "update produto set 	"
                    + "nome='" + pVO.getNome() + "',"
                    + "valorcusto=" + pVO.getValorCusto() + ","
                    + "quantidade=" + pVO.getQuantidade() + " where idproduto = " + pVO.getIdProduto();

            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar produto! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
}
