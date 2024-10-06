/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Diogenes W.
 * @since 17/06/2019 -16:12
 * @version 1.0.1 Beta Folhado
 */
public class Conversor {
    
    private int idade;

    public Conversor() {
    }
    
    
    /**
     * 
     * @param idade Recebe o ano que a pessoa nasceu
     */
    public Conversor(int ano) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * 
     * @return retorna a idade de nascimento da pessoa multiplicado por 12
     */
    public int calcularIdadeEmMeses(){
        return idade * 12;
    }
    
    /**
     * 
     * @return retorna a idade de nascimento da pessoa multiplicado por 48
     */
    public int calcularIdadeEmSemanas(){
        return idade * 48;
    }
    
    /**
     * 
     * @return retorna o ano de nascimento multiplicado por 365
     */
    public int calcularIdadeEmDias(){
        return idade * 365;
    }
    
    @Override
    public String toString() {
        return   "\nAnos :" + idade
                +"\nAnos em Meses: " + calcularIdadeEmMeses()
                +"\nAnos em Semanas: " + calcularIdadeEmSemanas()
                +"\nAnos em dias: " + calcularIdadeEmDias();
    }//fecha toString
}//fecha classe
