/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Diogenes Wilgner
 * @version 1.0 Beta Xis Carne
 * @since 26/06/2019 - 13:46
 */
public class Aluno {
    
    private String nome;
    private String sobrenome;
    private double nota1;
    private double nota2;
    private double peso1;
    private double peso2;
    private int totalAulas;
    private int presencas;
    private String sexo;

    public Aluno() {
    }

    /**
     * 
     * @param nome  recebe o nome do aluno
     * @param sobrenome  recebe o sobrenome do aluno
     * @param nota1  recebe a primeira nota do aluno
     * @param nota2  recebe a segunda nota do aluno
     * @param peso1  recebe o primeiro peso do aluno
     * @param peso2  recebe o primeiro peso do aluno
     * @param totalAulas  recebe o total de aulas
     * @param presencas recebe as presenças do aluno
     * @param sexo recebe o sexo do aluno
     */
    public Aluno(String nome, String sobrenome, double nota1, double nota2, double peso1, double peso2, int totalAulas, int presencas, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.totalAulas = totalAulas;
        this.presencas = presencas;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas) {
        this.totalAulas = totalAulas;
    }

    public int getPresencas() {
        return presencas;
    }

    public void setPresencas(int presencas) {
        this.presencas = presencas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    /**
     * 
     * @return Retorna a média aritmética das notas 1 e 2
     */
    public double calcularMediaAritmetica() {
        return (nota1 + nota2) / 2;
    }
    
    /**
     * 
     * @return  Retorna a frequencia do aluno
     */
    public double verificarFrequencia() {
        return presencas * 100 / totalAulas ;
    }
    
    /**
     * 
     * @return  o método retorna aprovado se: média for maior ou igual a 6 e frequência maior ou igual a 75.
                o método retorna reprovado por média se: média for menor que 6 e frequência maior ou igual a 75.
                o método retorna reprovado por frequência se: média for maior ou igual a 6 e frequência menor que 75.
                o método retorna reprovado por média ou frequência se: média for menor que 6 e frequência menor que 75.
     */
    public String verificarSituacao() {
        if(calcularMediaAritmetica() >= 6 && verificarFrequencia() >= 75) {
            return "Aprovado";
        } else if(calcularMediaAritmetica() < 6 && verificarFrequencia() >= 75) {
            return "Reprovado por Média";
        } else if(calcularMediaAritmetica() >= 6 && verificarFrequencia() < 75) {
            return "Reprovado por Frequência";
        } else if(calcularMediaAritmetica() < 6 && verificarFrequencia() < 75) {
            return "Reprovado por Média ou Frequência";
        }
        return "Nota incorreta";
    }
    
    /**
     * 
     * @return  o método retorna A se: aluno tiver nota entre 9 e 10;
                o método retorna B se: aluno tiver nota entre 8 e 8.9;
                o método retorna C se: aluno tiver nota entre 6 e 7.9;
                o método retorna D se: aluno tiver nota entre 0 e 5.9.
     */
    public String verificarConceito() {
        if(calcularMediaAritmetica() >= 9 && calcularMediaAritmetica() <= 10) {
            return "A";
        } else if(calcularMediaAritmetica() >= 8 && calcularMediaAritmetica() <= 8.9) {
            return "B";
        } else if(calcularMediaAritmetica() >= 6 && calcularMediaAritmetica() <= 7.9) {
            return "C";
        } else if(calcularMediaAritmetica() >= 0 && calcularMediaAritmetica() <= 5.9) {
            return "D";
        }
        return "Nota Incorreta";
    }
    
    /**
     * 
     * @return Retorna a média ponderada do aluno
     */
    public double calcularMediaPonderada() {
        return ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
    }

    @Override
    public String toString() {
        return    "\nNome: " + nome 
                + "\nSobrenome: " + sobrenome 
                + "\nPrimeira nota: " + nota1 
                + "\nSegunda nota: " + nota2 
                + "\nPrimeiro peso: " + peso1 
                + "\nSegundo peso: " + peso2 
                + "\nTotal de Aulas: " + totalAulas 
                + "\nPresenças: " + presencas 
                + "\nSexo: " + sexo
                + "\nMédia Aritmética: " + calcularMediaAritmetica()
                + "\nVerificar Frequencia: " + verificarFrequencia() + "%"
                + "\nSituação do Aluno: " + verificarSituacao()
                + "\nConceito do Aluno: " + verificarConceito()
                + "\nMédia Ponderada: " + calcularMediaPonderada();
    }//fecha toString
}//fecha classe
