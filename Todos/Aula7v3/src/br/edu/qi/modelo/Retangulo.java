/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Diogenes W.
 * @since  25/06/2019 15:42
 * @version 1.0
 */
public class Retangulo {
    
    private double base;
    private double altura;

    public Retangulo() {
    }

    /**
     * 
     * @param base recebe a base do retangulo
     * @param altura recebe a altura do retangulo
     */
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * 
     * @return  retorna a area do retangulo
     */
    public double calcularArea(){
        return altura * base;
    }
    
    /**
     * 
     * @return retorna o perimetro do retangulo
     */
    public double calcularPerimetro(){
        return 2 * (base + altura);
        
    }
    
    public String verificarTipo(String tipo ) {
        if(tipo.equalsIgnoreCase("Area")) {
            return    "\nBase: " + base 
                    + "\nAltura: " + altura
                    + "\nA área é: " + calcularArea();
            
        }else if(tipo.equalsIgnoreCase("Perimetro")) {
            
            return    "\nBase: " + base 
                    + "\nAltura: " + altura 
                    + "\nO perimetro é: " + calcularPerimetro();
        }
        return toString();
    }

    @Override
    public String toString() {
        return    "\nBase: " + base 
                + "\nAltura: " + altura
                + "\nPerímetro: " + calcularPerimetro()
                + "\nÁrea: " + calcularArea();
    }//fecha tostrint
}//fecha classe
