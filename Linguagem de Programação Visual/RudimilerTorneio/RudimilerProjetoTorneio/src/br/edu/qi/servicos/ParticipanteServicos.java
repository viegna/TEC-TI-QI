/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.servicos;

import br.edu.qi.dao.DAOFactory;
import br.edu.qi.dao.ParticipanteDAO;
import br.edu.qi.modelo.ParticipanteVO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 17:18
 * @version 1.0 beta
 */
public class ParticipanteServicos {

    public void cadastrarParticipantes(ParticipanteVO participanteVO) throws SQLException{
        
        ParticipanteDAO participanteDAO = DAOFactory.getParticipanteDAO();
        participanteDAO.cadastrarParticipante(participanteVO);
        
    }//fecha cadastrarParticipante
    
    public ArrayList<ParticipanteVO> buscarParticipantes() throws SQLException {
        ParticipanteDAO participanteDAO = DAOFactory.getParticipanteDAO();
        return participanteDAO.buscarParticipante();
    }//fecha buscarParticipantes
    
    public void deletarParticipante(long id) throws SQLException {
        ParticipanteDAO participanteDAO = DAOFactory.getParticipanteDAO();
        participanteDAO.deletarParticipante(id);
    }//fecha deletarParticipantes
    
    public void alterarParticipante(ParticipanteVO participanteVO) throws SQLException {
        ParticipanteDAO participanteDAO = DAOFactory.getParticipanteDAO();
        participanteDAO.alterarParticipante(participanteVO);
    }//fecha alterarParticipante
     
     public ArrayList<ParticipanteVO> filtrarParticipante(String pesquisa, String filtro) throws SQLException{
         ParticipanteDAO participanteDAO = DAOFactory.getParticipanteDAO();
         return participanteDAO.filtrar(pesquisa, filtro);
     }//fecha filtrarParticipante
     
}//fecha ParticipanteServicos
