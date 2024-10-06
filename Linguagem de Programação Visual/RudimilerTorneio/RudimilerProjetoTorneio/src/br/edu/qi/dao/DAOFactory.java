/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 16:20
 * @version 1.0 beta
 */
public class DAOFactory {
    
    private static TorneioDAO torneioDAO = new TorneioDAO(); 
    
    public static TorneioDAO getTorneioDAO() {
        return torneioDAO;
    }//fecha método TorneioDAO
    
    private static  ParticipanteDAO participanteDAO = new ParticipanteDAO();
    
    public static ParticipanteDAO getParticipanteDAO() {
        return participanteDAO;
    }//fecha método ParticipanteDAO
    
}//fecha DAOFactory
