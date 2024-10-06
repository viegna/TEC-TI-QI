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
 * @author Diogenes Wilgner da Silva
 * @since 10/07/2019 - 15:48
 * @version 1.0
 */
public class MotoristaTest {
    
    private static final Motorista MOTORISTA = new Motorista();
    
    public MotoristaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        MOTORISTA.setNome("11");
        MOTORISTA.setChassi("17541");
        MOTORISTA.setCnh("94511");
        MOTORISTA.setCpf("01145326412");
        MOTORISTA.setPlaca("333311");
        MOTORISTA.setVeiculo("333311");
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(MOTORISTA.toString());
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdmotorista method, of class Motorista.
     */
    @Test
    public void testGetIdmotorista() {
    }

    /**
     * Test of setIdmotorista method, of class Motorista.
     */
    @Test
    public void testSetIdmotorista() {
    }

    /**
     * Test of getNome method, of class Motorista.
     */
    @Test
    public void testGetNome() {
    }

    /**
     * Test of setNome method, of class Motorista.
     */
    @Test
    public void testSetNome() {
    }

    /**
     * Test of getCpf method, of class Motorista.
     */
    @Test
    public void testGetCpf() {
    }

    /**
     * Test of setCpf method, of class Motorista.
     */
    @Test
    public void testSetCpf() {
    }

    /**
     * Test of getCnh method, of class Motorista.
     */
    @Test
    public void testGetCnh() {
    }

    /**
     * Test of setCnh method, of class Motorista.
     */
    @Test
    public void testSetCnh() {
    }

    /**
     * Test of getVeiculo method, of class Motorista.
     */
    @Test
    public void testGetVeiculo() {
    }

    /**
     * Test of setVeiculo method, of class Motorista.
     */
    @Test
    public void testSetVeiculo() {
    }

    /**
     * Test of getPlaca method, of class Motorista.
     */
    @Test
    public void testGetPlaca() {
    }

    /**
     * Test of setPlaca method, of class Motorista.
     */
    @Test
    public void testSetPlaca() {
    }

    /**
     * Test of getChassi method, of class Motorista.
     */
    @Test
    public void testGetChassi() {
    }

    /**
     * Test of setChassi method, of class Motorista.
     */
    @Test
    public void testSetChassi() {
    }

    /**
     * Test of toString method, of class Motorista.
     */
    @Test
    public void testToString() {
    }
    
}
