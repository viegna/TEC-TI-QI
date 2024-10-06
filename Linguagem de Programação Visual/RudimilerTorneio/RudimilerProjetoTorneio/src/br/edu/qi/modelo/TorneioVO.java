/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 15:16
 * @version 1.0 beta
 */
public class TorneioVO {
    
    private long idtorneio;
    private String nomeDoTorneio;
    private String nomeDoJogo;
    private String tipoDeJogo;
    private int times;
    private int participantes;
    private int rodadas;

    public TorneioVO() {
    }//fecha construtor vazio.

    /**
     * 
     * @param idtorneio retorna a id do torneio.
     * @param nomeDoTorneio retorna o nome do torneio.
     * @param nomeDoJogo retorna o nome do jogo do torneio.
     * @param tipoDeJogo retorna o tipo de jogo. Digital ou fisíco.
     * @param times retorna o(s) time(s);
     * @param participantes retorna o numero de participantes do torneio;
     * @param rodadas retorna o numero de rodas do torneio.
     */
    public TorneioVO(long idtorneio,String nomeDoTorneio, String nomeDoJogo, String tipoDeJogo, int times, int participantes, int rodadas) {
        this.idtorneio = idtorneio;
        this.nomeDoTorneio = nomeDoTorneio;
        this.nomeDoJogo = nomeDoJogo;
        this.tipoDeJogo = tipoDeJogo;
        this.times = times;
        this.participantes = participantes;
        this.rodadas = rodadas;
    }//fecha construtor cheio.

    public String getNomeDoTorneio() {
        return nomeDoTorneio;
    }

    public void setNomeDoTorneio(String nomeDoTorneio) {
        this.nomeDoTorneio = nomeDoTorneio;
    }

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    public String getTipoDeJogo() {
        return tipoDeJogo;
    }

    public void setTipoDeJogo(String tipoDeJogo) {
        this.tipoDeJogo = tipoDeJogo;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }

    public long getIdtorneio() {
        return idtorneio;
    }

    public void setIdtorneio(long idtorneio) {
        this.idtorneio = idtorneio;
    }
    
    

    @Override
    public String toString() {
        return "\nNomeDoTorneio: " + nomeDoTorneio + 
               "\nNomeDoJogo: " + nomeDoJogo + 
               "\nTipoDeJogo: " + tipoDeJogo + 
               "\nTime: " + times + 
               "\nParticipantes: " + participantes + 
               "\nRodadas: " + rodadas;
    }//fecha toString 
}//fecha classe TorneioVO
