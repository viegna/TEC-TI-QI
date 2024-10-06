/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.servicos;

/**
 *
 * @author Diogenes Wilgner
 * @since 09/07/2019 - 17:35
 * @version 1.0
 */
public class ServicosFactory {

    private static ClienteServicos clienteServicos = new ClienteServicos();

    public static ClienteServicos getClienteServicos() {

        return clienteServicos;
    }//fecha metodo

    private static MotoristaServicos motoristaServicos = new MotoristaServicos();

    public static MotoristaServicos getMotoristaServicos() {

        return motoristaServicos;
    }//fecha metodo
}//fecha classe
