/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Diogenes W.
 * @since 24/06/2019 - 15:43
 * @version 1.0 Beta
 */
public class Produto {
    
    private String nome;
    private String pagamento;
    private int quantidade;
    private double valor;
    private double acrescimoCredito = 1.02;
    private double acrescimoDebito = 1.03;
    private double acrescimoCheque = 2;
    private double acrescimoDinheiro = 1;
    

    public Produto() {
    }

    /**
     * 
     * @param nome Recebe o nome do usuario
     * @param pagamento recebe o metodo de pagamento do usuario
     * @param quantidade recebe a quantidade de serviços comprados pelo usuaio
     * @param valor recebe o valor do serviço cobrado ao usuario
     */
    public Produto(String nome, String pagamento, int quantidade, double valor) {
        this.nome = nome;
        this.pagamento = pagamento;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * 
     * @return  retorna o valor total multiplicando a qtd  com o valor
     */
    public double valorTotal() {
        if(pagamento.equalsIgnoreCase("Débito")) {
            return (quantidade * valor) * acrescimoDebito;
        } else if(pagamento.equalsIgnoreCase("Crédito")) {
            return (quantidade * valor) * acrescimoCredito;
        } else if(pagamento.equalsIgnoreCase("Cheque")) {
            return (quantidade * valor) * acrescimoCheque;
        }
        return quantidade * valor * acrescimoDinheiro; //seria no dinheiro, ma oee
    }
    
    
    
    @Override
    public String toString() {
        return    "\nNome: " + nome 
                + "\nPagamento: " + pagamento 
                + "\nQuantidade: " + quantidade 
                + "\nValor: " + valor
                + "\nValor Total: " + valorTotal();
    }//fecha toString
}//fecha classe
