/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

/**
 *
 * @author Diogenes Wilgner da Silva
 * @since 10/07/2019 - 14:22
 * @version 1.0
 */
public class Motorista {
    private int idMotorista;
    private String nome;
    private String cpf;
    private String cnh;
    private String veiculo;
    private String placa;
    private String chassi;

    public Motorista() {
    }
    
    /**
     * 
     * @param idMotorista - recebe o id do motorista
     * @param nome - recebe o nome do motorista
     * @param cpf - recebe o cpf do motorista
     * @param cnh - recebe o cnh do motorista
     * @param veiculo - recebe o carro do motorista
     * @param placa - recebe a placa do carro
     * @param chassi  - recebe o chassi do carro
     */
    public Motorista(int idMotorista, String nome, String cpf, String cnh, String veiculo, String placa, String chassi) {
        this.idMotorista = idMotorista;
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.veiculo = veiculo;
        this.placa = placa;
        this.chassi = chassi;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return    "\nNome Motorista: " + nome 
                + "\nCódigo do motorista: " + idMotorista
                + "\nCPF: " + cpf 
                + "\nCNH: " + cnh 
                + "\nVeiculo: " + veiculo 
                + "\nPlaca: " + placa 
                + "\nChassi: " + chassi;
    }//fecha tostring
}//fecha classe
