/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 15:43
 * @version 1.0 beta
 */
public class ParticipanteVO {
    
    private long idParticipante;
    private String nome;
    private String endereco;
    private String time;
    private String CPF;
    private int numero;
    private int idade;

    public ParticipanteVO() {
    }//fecha construtor vazio

    /**
     * 
     * @param idParticipante retorna a ID do participante.
     * @param nome retorna o nome do participante.
     * @param endereco retorna o endereço do participante.
     * @param time retorna o time do participante.
     * @param CPF retorna o CPF do participante.
     * @param numero retorna o número do participante.
     * @param idade retorna a idade do participante.
     */
    public ParticipanteVO(long idParticipante, String nome, String endereco, String time, String CPF, int numero, int idade) {
        this.idParticipante = idParticipante;
        this.nome = nome;
        this.endereco = endereco;
        this.time = time;
        this.CPF = CPF;
        this.numero = numero;
        this.idade = idade;
    }//fecha construtor cheio

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(long idtorneio) {
        this.idParticipante = idParticipante;
    }
    

    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nEndereco: " + endereco + 
               "\nTime: " + time + 
               "\nCPF: " + CPF + 
               "\nNúmero: " + numero +
               "\nIdade: " + idade;
    }//fecha toString
    
}//fecha classe ParticipanteVO
