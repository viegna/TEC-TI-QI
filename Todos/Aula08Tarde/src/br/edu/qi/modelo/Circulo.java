/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Diogenes Wilgner 
 * @version 1.0 
 * @since 27/06/2019 13:46
 */
public class Circulo {
    
    private double raio;

    public Circulo() {
    }

    /**
     * 
     * @param raio recebe o valor do raio do circulo
     */
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * 
     * @return retorna o valor do perimetro
     */
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    /**
     * 
     * @return retorna a area do perimetro
     */
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
    
    
    @Override
    public String toString() {
        return    "\nRaio: " + raio
                + "\nPerimetro do Circulo: " + calcularPerimetro()
                + "\nÁrea do Circulo: " + calcularArea();
    }//fecha toString
}//fecha classe
