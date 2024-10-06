/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

/**
 *
 * @author Diogenes W.  
 * @since 19/06/2019 - 13:46
 * @version 1.1.1 Beta Ruffles
 */
public class Pessoa {
    
    private String nome;
    private double peso;
    private int idade;

    public Pessoa() {
    }

    /**
     * 
     * @param nome recebe nome do usuario
     * @param peso recebe o peso do usuario
     * @param idade  recebe a idade do usuario
     */
    public Pessoa(String nome, double peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * 
     * @return retorna a quantidade de meses pela idade do usuario *12
     */
    public int calcularIdadeMeses() {
        return idade * 12;
    }

    @Override
    public String toString() {
        return    "\nNome: " + nome 
                + "\nPeso: " + peso 
                + "\nIdade: " + idade
                + "\nQuantidade de Meses: " + calcularIdadeMeses()
                ;
    }//fecha toString
}//fecha classe
