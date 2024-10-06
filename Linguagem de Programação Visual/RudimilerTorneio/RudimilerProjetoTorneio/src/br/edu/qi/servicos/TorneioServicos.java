/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.servicos;

import br.edu.qi.dao.DAOFactory;
import br.edu.qi.dao.ParticipanteDAO;
import br.edu.qi.modelo.TorneioVO;
import br.edu.qi.dao.TorneioDAO;
import br.edu.qi.modelo.ParticipanteVO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 16:30
 * @version 1.0 beta
 */
public class TorneioServicos {
    
    public void cadastrarTorneio(TorneioVO torneioVO) throws SQLException {
        
        TorneioDAO torneioDAO = DAOFactory.getTorneioDAO();
        torneioDAO.cadastrarTorneio(torneioVO);
    }//fecha cadastrarTorneio
    
    public ArrayList<TorneioVO> buscarTorneio() throws SQLException {
        TorneioDAO torneioDAO = DAOFactory.getTorneioDAO();
        return torneioDAO.buscarTorneio();
    }//fecha buscarProdutos
    
    public void deletarTorneio(long id) throws SQLException {
        TorneioDAO torneioDAO = DAOFactory.getTorneioDAO();
        torneioDAO.deletarTorneio(id);
    }//fecha deletarParticipantes
    
    public void alterarTorneio(TorneioVO torneioVO) throws SQLException {
        TorneioDAO torneioDAO = DAOFactory.getTorneioDAO();
        torneioDAO.alterarTorneio(torneioVO);
    }//fecha alterarParticipante
    
}//fecha TorneioServicos
