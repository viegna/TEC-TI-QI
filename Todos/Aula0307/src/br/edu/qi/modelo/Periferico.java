/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Diogenes Wilgner
 * @since 03/07/2019 - 13:54
 * @version 1.0.1
 */
public class Periferico {
    
    private String modelo;
    private String cor;
    private double valor;
    private int quantidade;

    public Periferico() {
    }

    /**
     * 
     * @param modelo recebe o modelo do periferico
     * @param cor recebe a cor do periferico
     * @param valor recebe o valor do periferico
     * @param quantidade recebe a quantidade de perifericos comprados
     */
    public Periferico(String modelo, String cor, double valor, int quantidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    /**
     * 
     * @return Retorna o valor total (valor multiplicado pela quantidade)do cadastro
     * @throws ArithmeticException 
     */
    public double calcularValorTotal() throws ArithmeticException {
        double resposta = 0;
        
        try {
            resposta = valor * quantidade;
        } catch (ArithmeticException arithmeticException) {
            throw new ArithmeticException("Erro de cálculo!");
        }
        return resposta;
    }

    @Override
    public String toString() {
        return    "\nModelo: " + modelo 
                + "\nCor: " + cor 
                + "\nValor: " + valor 
                + "\nQuantidade: " + quantidade
                + "\nValor Total: " + calcularValorTotal()
                ;
    }//fecha toString
}//fecha classe
