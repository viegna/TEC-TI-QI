/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;

import br.edu.qi.modelo.ParticipanteVO;
import br.edu.qi.modelo.TorneioVO;
import br.edu.qi.persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 16:15
 * @version 1.0 beta
 */
public class TorneioDAO {
    
    public void cadastrarTorneio(TorneioVO torneioVO) throws SQLException{
        
    Connection connection = ConexaoBanco.getConnection();
    Statement statement = connection.createStatement();
    
        try {
            String sql;
            
            sql = "inserir into torneio(idtorneio,nomedotorneio,nomedojogo,tipodejogo,time,participante,rodadas)" 
                + "values(null, '" 
                + torneioVO.getNomeDoTorneio()+ "','" 
                + torneioVO.getNomeDoJogo() + "','" 
                + torneioVO.getTipoDeJogo() + "','" 
                + torneioVO.getTimes() + "'," 
                + torneioVO.getParticipantes() + "," 
                + torneioVO.getRodadas() +");";
            statement.execute(sql);
            
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao criar torneio!");
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha cadastrarTorneio
    
    public ArrayList<TorneioVO> buscarTorneio() throws SQLException {

        Connection connection = ConexaoBanco.getConnection();
        Statement statement = connection.createStatement();

        try {
            String sql;
      
            sql = "select * from produto";

            ResultSet resultSet = statement.executeQuery(sql);

            ArrayList<TorneioVO> torneios = new ArrayList<>();

            while (resultSet.next()) {

                TorneioVO torneio = new TorneioVO();

                torneio.setIdtorneio(resultSet.getLong("idtorneio"));
                torneio.setNomeDoJogo(resultSet.getString("nomedojogo"));
                torneio.setNomeDoTorneio(resultSet.getString("nomedotorneio"));
                torneio.setParticipantes(resultSet.getInt("participante"));
                torneio.setRodadas(resultSet.getInt("rodadas"));
                torneio.setTimes(resultSet.getInt("time"));
                torneio.setTipoDeJogo(resultSet.getString("tipodejogo"));

                torneios.add(torneio);
            }//fecha while

            return torneios;

        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao buscar torneio! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha buscarTorneio
    
    
    public ArrayList<TorneioVO> filtrarTorneio(String pesquisa,
            String filtro) throws SQLException {

        Connection connection = ConexaoBanco.getConnection();
        Statement statement = connection.createStatement();
        try {
            String query = "";
            
            if (filtro.equalsIgnoreCase("código torneio")) {
                query = "where idparticipante = " + pesquisa;
            }else if(filtro.equalsIgnoreCase("nomedojogo")) {
                query = "where nomedojogo like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("nomedotorneio")) {
                query = "where nomedotorneio like '%" + pesquisa + "%'";
            }else if(filtro.equalsIgnoreCase("tipodejogo")) {
                query = "where tipodejogo like '%" + pesquisa + "%'";
            }//fecha if

            String sql = "select * from produto " + query;
            
                ResultSet resultSet = statement.executeQuery(sql);
                
                ArrayList<TorneioVO> torneios = new ArrayList<>();
                while (resultSet.next()) {
                    
                    TorneioVO torneio = new TorneioVO();
                    
                    torneio.setIdtorneio(resultSet.getLong("idtorneio"));
                    torneio.setNomeDoJogo(resultSet.getString("nomedojogo"));
                    torneio.setNomeDoTorneio(resultSet.getString("nomedotorneio"));
                    torneio.setTipoDeJogo(resultSet.getString("tipodejogo"));
                    
                    torneios.add(torneio);
                }	
                return torneios;
        }catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos!" + e.getMessage());
        }finally {
            statement.close();
            connection.close();
        }//fecha finally
        }//fecha filtrarTorneio
    
        public void alterarTorneio(TorneioVO torneioVO) throws SQLException{
        Connection connection = ConexaoBanco.getConnection();
        Statement statement = connection.createStatement();
        
        try {
            
            String sql;
            
            sql = "update torneio set "
            +"nomedojogo='" +torneioVO.getNomeDoJogo()+ "',"
            +"nomedotorneio='" +torneioVO.getNomeDoTorneio()+ "',"
            +"time='" +torneioVO.getTimes()+ "',"
            +"tipodejogo='" +torneioVO.getTipoDeJogo()+ "',"
            +"participante='" +torneioVO.getParticipantes()+ "',"
            +"rodadas='" +torneioVO.getRodadas()+ "',"
            + " where idparticipante = " + torneioVO.getIdtorneio()+";";
            
            statement.executeUpdate(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao alterar o funcionário!" + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }//fecha finally
    }//fecha alterarPartcipante
        
        public void deletarTorneio(long id) throws SQLException {
        
        Connection connection = ConexaoBanco.getConnection();
        Statement statement = connection.createStatement();
        
        try {
            
            String sql;
            
            sql = "delete from torneio where idparticipante="+id;
            statement.execute(sql);
        } catch (SQLException sqleException) {
            connection.close();
            statement.close();
        } finally {
        }//fecha finally
        
    }//fecha deletarParticipante
    
}//fecha classe TorneioDAO
