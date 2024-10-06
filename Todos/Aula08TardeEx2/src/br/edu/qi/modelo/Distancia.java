/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Diogenes Wilgner
 * @since 27/06/2019 - 14:41
 * @version 1.0
 */
public class Distancia {
    
    private double valorX1;
    private double valorX2;
    private double valorY1;
    private double valorY2;

    public Distancia() {
    }

    /**
     * 
     * @param valorX1 recebe o valor do primeiro x
     * @param valorX2 recebe o valor do segundo x
     * @param valorY1 recebe o valor do primeiro y
     * @param valorY2 recebe o valor do segundo y
     */
    public Distancia(double valorX1, double valorX2, double valorY1, double valorY2) {
        this.valorX1 = valorX1;
        this.valorX2 = valorX2;
        this.valorY1 = valorY1;
        this.valorY2 = valorY2;
    }

    public double getValorX1() {
        return valorX1;
    }

    public void setValorX1(double valorX1) {
        this.valorX1 = valorX1;
    }

    public double getValorX2() {
        return valorX2;
    }

    public void setValorX2(double valorX2) {
        this.valorX2 = valorX2;
    }

    public double getValorY1() {
        return valorY1;
    }

    public void setValorY1(double valorY1) {
        this.valorY1 = valorY1;
    }

    public double getValorY2() {
        return valorY2;
    }

    public void setValorY2(double valorY2) {
        this.valorY2 = valorY2;
    }

    /**
     * 
     * @return retprma a ditancia entre x1 e y2 e y1 e y2
     */
    public double calcularDistancia() {
        return Math.sqrt(  Math.pow ((valorX2 - valorX1), 2) 
                         + Math.pow ((valorY2 - valorY1), 2) 
                        );
    }//fecha calcular distancia
    
    
    @Override
    public String toString() {
        return    "\nValor do primeiro X: " + valorX1 
                + "\nValor do segundo X: " + valorX2 
                + "\nValor do primeiro Y: " + valorY1 
                + "\nValor do segundo Y: " + valorY2
                + "\nCálculo da Distancia: " + calcularDistancia()
                ;
    }//fecha toString
}//fecha classe
