/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;

import br.edu.qi.modelo.Motorista;
import br.edu.qi.persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Diogenes Wilgner da Silva Oliveira
 * @since 10/07/2019 - 15:32
 * @version 1.0
 */
public class MotoristaDAO {

    public void cadastrarMotorista(Motorista motorista) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statementt = connection.createStatement();

        try {
            String sql;
            sql = "insert into motorista(nome,cpf,chassi,cnh,placa,veiculo)"
                    + "values("
                    + "'" + motorista.getNome() + "',"
                    + "'" + motorista.getCpf() + "',"
                    + "'" + motorista.getChassi() + "',"
                    + "'" + motorista.getCnh() + "',"
                    + "'" + motorista.getPlaca() + "',"
                    + "'" + motorista.getVeiculo() + "'"
                    + ");";

            statementt.execute(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao inserir motorista!");
        } finally {
            connection.close();
            statementt.close();
        }//fecha finally
    }//fecha método

    public ArrayList<Motorista> buscarMotoristas()
            throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql = "select * from motorista";
            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Motorista> motoristas = new ArrayList<>();
            while (resultSet.next()) {
                Motorista motorista = new Motorista();
                motorista.setIdMotorista(resultSet.getInt("idmotorista"));
                motorista.setNome(resultSet.getString("nome"));
                motorista.setCpf(resultSet.getString("cpf"));
                motorista.setChassi(resultSet.getString("chassi"));
                motorista.setCnh(resultSet.getString("cnh"));
                motorista.setPlaca(resultSet.getString("placa"));
                motorista.setVeiculo(resultSet.getString("veiculo"));

                motoristas.add(motorista);
            }
            return motoristas;
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao buscar motorista!" + sQLException.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }//fecha buscarmotorista

    public ArrayList<Motorista> filtrar(String pesquisa,
            String filtro) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();
        try {

            String query = "";
            if (filtro.equalsIgnoreCase("idmotorista")) {
                query = "where idmotorista = " + pesquisa;
            } else if (filtro.equalsIgnoreCase("nome")) {
                query = "where nome = " + pesquisa;
            } else if (filtro.equalsIgnoreCase("cpf")) {
                query = "where cpf like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("chassi")) {
                query = "where chassi like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("cnh")) {
                query = "where cnh like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("placa")) {
                query = "where placa like '%" + pesquisa + "%'";
            } else if (filtro.equalsIgnoreCase("veiculo")) {
                query = "where veiculo like '%" + pesquisa + "%'";
            }

            String sql = "select * from motorista " + query;

            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Motorista> motoristas = new ArrayList<>();
            while (resultSet.next()) {
                Motorista motorista = new Motorista();
                motorista.setIdMotorista(resultSet.getInt("idmotorista"));
                motorista.setNome(resultSet.getString("nome"));
                motorista.setCpf(resultSet.getString("cpf"));
                motorista.setChassi(resultSet.getString("chassi"));
                motorista.setCnh(resultSet.getString("cnh"));
                motorista.setPlaca(resultSet.getString("placa"));
                motorista.setVeiculo(resultSet.getString("veiculo"));
                motoristas.add(motorista);
            }
            return motoristas;

        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao buscar um motorista!" + sQLException.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }//fecha filtrar motorista

    public void deletarMotorista(long id) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();

        try {
            String sql;

            sql = "delete from motorista where idmotorista = " + id;

            statement.execute(sql);

        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao deletar motorista." + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha método

    public void alterarMotorista(Motorista motorista) throws SQLException {

        Connection connection = ConexaoBanco.getConexao();
        Statement statement = connection.createStatement();

        try {
            String sql;

            sql = "update motorista set 	"
                    + "nome='" + motorista.getNome() + "',"
                    + "cpf='" + motorista.getCpf() + "',"
                    + "chassi='" + motorista.getChassi() + "',"
                    + "cnh='" + motorista.getCnh() + "',"
                    + "placa=" + motorista.getPlaca() + ","
                    + "veiculo='" + motorista.getVeiculo() + "',"
                    + " where idmotorista = " + motorista.getIdMotorista();

            statement.executeUpdate(sql);

        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao alterar motorista! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha método
}//fecha classe
