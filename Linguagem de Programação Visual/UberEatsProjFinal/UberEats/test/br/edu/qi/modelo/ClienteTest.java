/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogenes Wilgner
 * @since 06/07/2019 - 16:11
 * @version 1.0 beta batata
 */
public class ClienteTest {
    
    private static final Cliente CLIENTE = new Cliente();
    
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        CLIENTE.setCPF("12345678910");
        CLIENTE.setCidade("almirante");
        CLIENTE.setEstado("RS");
        CLIENTE.setNome("zezin");
        CLIENTE.setNumero(12);
        CLIENTE.setRua("rua dos pedestres");
        CLIENTE.setTipoDePagamento("Dinheiro");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(CLIENTE.toString());
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Cliente.
     */
    @Test
    public void testGetNome() {
    }

    /**
     * Test of setNome method, of class Cliente.
     */
    @Test
    public void testSetNome() {
    }

    /**
     * Test of getCPF method, of class Cliente.
     */
    @Test
    public void testGetCPF() {
    }

    /**
     * Test of setCPF method, of class Cliente.
     */
    @Test
    public void testSetCPF() {
    }

    /**
     * Test of getCidade method, of class Cliente.
     */
    @Test
    public void testGetCidade() {
    }

    /**
     * Test of setCidade method, of class Cliente.
     */
    @Test
    public void testSetCidade() {
    }

    /**
     * Test of getEstado method, of class Cliente.
     */
    @Test
    public void testGetEstado() {
    }

    /**
     * Test of setEstado method, of class Cliente.
     */
    @Test
    public void testSetEstado() {
    }

    /**
     * Test of getNumero method, of class Cliente.
     */
    @Test
    public void testGetNumero() {
    }

    /**
     * Test of setNumero method, of class Cliente.
     */
    @Test
    public void testSetNumero() {
    }

    /**
     * Test of getRua method, of class Cliente.
     */
    @Test
    public void testGetRua() {
    }

    /**
     * Test of setRua method, of class Cliente.
     */
    @Test
    public void testSetRua() {
    }

    /**
     * Test of getTipoDePagamento method, of class Cliente.
     */
    @Test
    public void testGetTipoDePagamento() {
    }

    /**
     * Test of setTipoDePagamento method, of class Cliente.
     */
    @Test
    public void testSetTipoDePagamento() {
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
    }
    
}
