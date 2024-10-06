/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.qi.edu.modelo;

/**
 *
 * @author Diogenes W. 
 * @author Eduarda
 * @since 18/06/2019 - 14:53
 * @version 1.0.1 Beta Lasanha
 */
public class Quadrado {
    
    private double valorLado;

    public Quadrado() {
    }
    
    /**
     * 
     * @param valorLado Recebe o valor de cada lado do quadrado.
     */
    public Quadrado(int valorLado) {
        this.valorLado = valorLado;
    }

    public double getValorLado() {
        return valorLado;
    }

    public void setValorLado(double valorLado) {
        this.valorLado = valorLado;
    }
    
    /**
     * 
     * @return retorna valorLado^2 como o valor da area.
     */
    public double calcularArea() {
        return valorLado * valorLado;
    }
    
    /**
     * 
     * @return retorna valorLado * 4 como valor do perimetro. 
     */
    public double calcularPerimetro() {
        return valorLado * 4;
        
    }    
    @Override
    public String toString() {
        return    "\nValor do Lado: " + valorLado
                + "\nValor da Área: " + calcularArea()
                + "\nValor do Perímetro: " + calcularPerimetro();
    }//fecha toString
}//fecha classe
