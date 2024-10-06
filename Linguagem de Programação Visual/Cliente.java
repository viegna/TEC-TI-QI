/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Diogenes Wilgner da Silva Oliveira
 * @version 1.0 beta batata
 * @since 05/07/2019 - 15:46
 */
public class Cliente {
    private String nome;
    private String CPF;
    private String cidade;
    private String estado;
    private int numero;
    private String rua;
    private String TipoDePagamento;

    public Cliente() {
    }

    /**
     * 
     * @param nome recebe o nome do cliente
     * @param CPF recebe o cpf do cliente
     * @param cidade recebe a cidade do cliente 
     * @param estado recebe o estado do cliente
     * @param numero recebe o numero da casa do cliente
     * @param rua recebe o nome da rua de onde o cliente se localiza
     * @param TipoDePagamento recebe o tipo de pagamento que o cliente ira fazer
     */
    public Cliente(String nome, String CPF, String cidade, String estado, int numero, String rua, String TipoDePagamento) {
        this.nome = nome;
        this.CPF = CPF;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.rua = rua;
        this.TipoDePagamento = TipoDePagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getTipoDePagamento() {
        return TipoDePagamento;
    }

    public void setTipoDePagamento(String TipoDePagamento) {
        this.TipoDePagamento = TipoDePagamento;
    }

    @Override
    public String toString() {
        return    "\nNome: " + nome 
                + "\nCPF: " + CPF 
                + "\nCidade: " + cidade
                + "\nEstado: " + estado 
                + "\nNumero: " + numero 
                + "\nRua: " + rua 
                + "\nTipo De Pagamento: " + TipoDePagamento
                ;
    }//toString
}//fecha classe
