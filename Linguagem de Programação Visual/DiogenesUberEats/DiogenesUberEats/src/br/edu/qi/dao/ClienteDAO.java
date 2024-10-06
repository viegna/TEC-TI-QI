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

    public ArrayList<Cliente> buscarClientes()
            throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql = "select * from cliente";
            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Cliente> clientes = new ArrayList<>();
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idcliente"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCPF(resultSet.getString("cpf"));
                cliente.setCidade(resultSet.getString("cidade"));
                cliente.setEstado(resultSet.getString("estado"));
                cliente.setRua(resultSet.getString("rua"));
                cliente.setTipoDePagamento(resultSet.getString("tipodepagamento"));
                cliente.setNumero(resultSet.getInt("numero"));
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao buscar clientes!" + sQLException.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }//fecha buscarClientes

    public ArrayList<Cliente> filtrar(String pesquisa,
            String filtro) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();
        try {

            String query = "";
            if (filtro.equalsIgnoreCase("idcliente")) {
                query = "where idcliente = " + pesquisa;
            } else if (filtro.equalsIgnoreCase("cpf")) {
                query = "where cpf = " + pesquisa;
            } else if (filtro.equalsIgnoreCase("nome")) {
                query = "where nome like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("cidade")) {
                query = "where cidade like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("estado")) {
                query = "where estado like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("numero")) {
                query = "where numero like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("rua")) {
                query = "where rua like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("tipodepagamento")) {
                query = "where tipodepagamento like '%" + pesquisa + "%'";
            }

            String sql = "select * from cliente " + query;

            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Cliente> clientes = new ArrayList<>();
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idcliente"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setCPF(resultSet.getString("cpf"));
                cliente.setCidade(resultSet.getString("cidade"));
                cliente.setEstado(resultSet.getString("estado"));
                cliente.setRua(resultSet.getString("rua"));//-----------------parei aq
                cliente.setTipoDePagamento(resultSet.getString("tipodepagamento"));
                cliente.setNumero(resultSet.getInt("numero"));
                clientes.add(cliente);
            }
            return clientes;

        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao buscar Clientes!" + sQLException.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }//fecha filtrars clientes

    public void deletarCliente(long id) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();

        try {
            String sql;

            sql = "delete from cliente where idcliente = " + id;

            statement.execute(sql);

        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao deletar cliente." + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha método

    public void alterarCliente(Cliente cliente) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();

        try {
            String sql;

            sql = "update cliente set 	"
                    + "nome='" + cliente.getNome() + "',"
                    + "cpf='" + cliente.getCPF() + "',"
                    + "cidade='" + cliente.getCidade() + "',"
                    + "estado='" + cliente.getEstado()+ "',"
                    + "numero=" + cliente.getNumero() + ","
                    + "rua='" + cliente.getRua() + "',"
                    + "tipodepagamento='" + cliente.getTipoDePagamento() + "'"
                    + " where idcliente = " + cliente.getIdCliente();

            statement.executeUpdate(sql);

        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao alterar cliente! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha método
}//fecha classe
