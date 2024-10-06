/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

/**
 *
 * @author Diogenes W.  
 * @version 1.0.1 Beta Springles
 * @since 24/06/2019 - 13:43
 */
public class Pessoa {
    
    private String nome;
    private String sexo;

    public Pessoa() {
    }

    /**
     * 
     * @param nome retorna o nome do usuário.
     * @param sexo retorna o sexo do usuário.
     */
    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    /**
     * 
     * @return retorna o genero do usuario com base no sexo.
     */
    public String verificarSexo() {
        if(sexo.equalsIgnoreCase("Masculino")) {
            return "Você é homem.";
        }
        return "Você é mulher.";
    }

    @Override
    public String toString() {
        return    "\nNome: " + nome 
                + "\nSexo: " + sexo
                + "\nVerificação do sexo: " + verificarSexo();
    }//fecha toString
}//fecha classe
