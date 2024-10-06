/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.servicos;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 16:50
 * @version 1.0 beta
 */
public class ServicosFactory {
    
    private static final TorneioServicos TORNEIOSERVICOS = new TorneioServicos();
    public static TorneioServicos getTorneioServicos() {
        
        return TORNEIOSERVICOS;
    }//fecha TorneioServicos
    
    private static final ParticipanteServicos PARTICIPANTESERVICOS = new ParticipanteServicos();
    public static ParticipanteServicos getParticipanteServicos() {
        
        return PARTICIPANTESERVICOS;
    }//fecha ParticipanteSericos
    
    
}//fecha SercosFactory
