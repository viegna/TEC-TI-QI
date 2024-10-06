/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;

import br.edu.qi.modelo.ParticipanteVO;
import br.edu.qi.persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 17:05
 * @version 1.0 beta
 */
public class ParticipanteDAO {
    
    public void cadastrarParticipante(ParticipanteVO participanteVO) throws SQLException{
        
            Connection connection = ConexaoBanco.getConnection();
            Statement statement = connection.createStatement();
    
        try {
            String sql;
            
            sql = "inserir into participante(idparticipante,nome,time,endereco,cpf,numero,idade)" 
                + "values(null, '" + participanteVO.getNome() + "', '" + participanteVO.getTime() + "', '" + participanteVO.getEndereco() 
                + "', '" + participanteVO.getCPF() + "', " + participanteVO.getNumero() + ", " + participanteVO.getIdade() + ");";
            statement.execute(sql);
            
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao cadastrar participante!");
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha cadastrarParticipante
    
    public ArrayList<ParticipanteVO> buscarParticipante() throws SQLException {

        Connection connection = ConexaoBanco.getConnection();
        Statement statement = connection.createStatement();

        try {
            String sql;
      
            sql = "select * from produto";

            ResultSet resultSet = statement.executeQuery(sql);

            ArrayList<ParticipanteVO> participantes = new ArrayList<>();

            while (resultSet.next()) {

                ParticipanteVO participante = new ParticipanteVO();

                participante.setIdParticipante(resultSet.getLong("idparticipante"));
                participante.setNome(resultSet.getString("nome"));
                participante.setEndereco(resultSet.getString("endereco"));
                participante.setTime(resultSet.getString("time"));
                participante.setCPF(resultSet.getString("cpf"));
                participante.setNumero(resultSet.getInt("numero"));
                participante.setIdade(resultSet.getInt("idade"));

                participantes.add(participante);
            }//fecha while

            return participantes;

        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao buscar participante! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha buscarParticipante
    
     public ArrayList<ParticipanteVO> filtrar(String pesquisa,
            String filtro) throws SQLException {

        Connection connection = ConexaoBanco.getConnection();
        Statement statement = connection.createStatement();
        try {
            String query = "";
            
            if (filtro.equalsIgnoreCase("código participante")) {
                query = "where idparticipante = " + pesquisa;
            }else if(filtro.equalsIgnoreCase("nome")) {
                query = "where nome like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("time")) {
                query = "where time like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("idade")) {
                query = "where idade like '%" + pesquisa + "%'";
            }//fecha if

            String sql = "select * from produto " + query;
            
                ResultSet resultSet = statement.executeQuery(sql);
                
                ArrayList<ParticipanteVO> participantes = new ArrayList<>();
                while (resultSet.next()) {
                    
                    ParticipanteVO participante = new ParticipanteVO();
                    
                    participante.setIdParticipante(resultSet.getLong("idparticipante"));
                    participante.setNome(resultSet.getString("nome"));
                    participante.setTime(resultSet.getString("time"));
                    participante.setIdade(resultSet.getInt("idade"));
                    
                    participantes.add(participante);
                }	
                return participantes;
        }catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos!" + e.getMessage());
        }finally {
            statement.close();
            connection.close();
        }
        }//fecha filtrarParticipantes

    
    public void alterarParticipante(ParticipanteVO participanteVO) throws SQLException{
        Connection connection = ConexaoBanco.getConnection();
        Statement statement = connection.createStatement();
        
        try {
            
            String sql;
            
            sql = "update participante set "
            +"nome='" +participanteVO.getNome()+ "',"
            +"endereco='" +participanteVO.getEndereco()+ "',"
            +"time='" +participanteVO.getTime()+ "',"
            +"cpf='" +participanteVO.getCPF()+ "',"
            +"numero=" +participanteVO.getNumero()+ ","
            +"idade=" +participanteVO.getNome()+ " where idparticipante = " + participanteVO.getIdParticipante()+";";
            
            statement.executeUpdate(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao alterar o funcionário!" + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha alterarPartcipante
    
    public void deletarParticipante(long id) throws SQLException {
        
        Connection connection = ConexaoBanco.getConnection();
        Statement statement = connection.createStatement();
        
        try {
            
            String sql;
            
            sql = "delete from participante where idparticipante="+id;
            statement.execute(sql);
        } catch (SQLException sqleException) {
            connection.close();
            statement.close();
        } finally {
        }//fecha finally
        
    }//fecha deletarParticipante
    
}//fecha ParticipanteDAO
