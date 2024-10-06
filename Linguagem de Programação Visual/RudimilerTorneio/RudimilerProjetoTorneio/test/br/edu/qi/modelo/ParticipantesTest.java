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
 * @author Rudimiler P. Machado
 * @since 06/06/2019 - 16:06
 * @version 1.0 beta
 */
public class ParticipantesTest {
    
    private static final ParticipanteVO PARTICIPANTES = new ParticipanteVO();
    
    public ParticipantesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Passou pelo setUpClass");
        PARTICIPANTES.setNome("Arthuria");
        PARTICIPANTES.setIdade(12);
        PARTICIPANTES.setNumero(85559333);
        PARTICIPANTES.setCPF("ghfdshgfghdfhgs");
        PARTICIPANTES.setTime("ILoveBadBoys");
        PARTICIPANTES.setEndereco("Rua Pink");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Passou pelo tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Passou pelo setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("Passou pelo tearDown");
    }

    /**
     * Test of getNome method, of class ParticipanteVO.
     */
    @Test
    public void testGetNome() {
    }

    /**
     * Test of setNome method, of class ParticipanteVO.
     */
    @Test
    public void testSetNome() {
    }

    /**
     * Test of getEndereco method, of class ParticipanteVO.
     */
    @Test
    public void testGetEndereco() {
    }

    /**
     * Test of setEndereco method, of class ParticipanteVO.
     */
    @Test
    public void testSetEndereco() {
    }

    /**
     * Test of getTime method, of class ParticipanteVO.
     */
    @Test
    public void testGetTime() {
    }

    /**
     * Test of setTime method, of class ParticipanteVO.
     */
    @Test
    public void testSetTime() {
    }

    /**
     * Test of getCPF method, of class ParticipanteVO.
     */
    @Test
    public void testGetCPF() {
    }

    /**
     * Test of setCPF method, of class ParticipanteVO.
     */
    @Test
    public void testSetCPF() {
    }

    /**
     * Test of getNumero method, of class ParticipanteVO.
     */
    @Test
    public void testGetNumero() {
    }

    /**
     * Test of setNumero method, of class ParticipanteVO.
     */
    @Test
    public void testSetNumero() {
    }

    /**
     * Test of getIdade method, of class ParticipanteVO.
     */
    @Test
    public void testGetIdade() {
    }

    /**
     * Test of setIdade method, of class ParticipanteVO.
     */
    @Test
    public void testSetIdade() {
    }
    
    /**
     * Test of toString method, of class ParticipanteVO.
     */
    @Test
    public void testToString() {
    }
    
}
