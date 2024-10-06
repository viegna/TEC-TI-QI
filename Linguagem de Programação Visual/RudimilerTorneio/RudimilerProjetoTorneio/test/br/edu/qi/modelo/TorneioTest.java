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
 * @since 06/06/2019 - 16:10
 * @version 1.0 beta
 */
public class TorneioTest {
    private static final TorneioVO TORNEIO = new TorneioVO();
    
    public TorneioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        TORNEIO.setNomeDoJogo("Dota 2");
        TORNEIO.setNomeDoTorneio("Torneio anual de Dota 2");
        TORNEIO.setParticipantes(30);
        TORNEIO.setRodadas(6);
        TORNEIO.setTime("ILoveBadBoys");
        TORNEIO.setTipoDeJogo("Digital");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNomeDoTorneio method, of class TorneioVO.
     */
    @Test
    public void testGetNomeDoTorneio() {
    }

    /**
     * Test of setNomeDoTorneio method, of class TorneioVO.
     */
    @Test
    public void testSetNomeDoTorneio() {
    }

    /**
     * Test of getNomeDoJogo method, of class TorneioVO.
     */
    @Test
    public void testGetNomeDoJogo() {
    }

    /**
     * Test of setNomeDoJogo method, of class TorneioVO.
     */
    @Test
    public void testSetNomeDoJogo() {
    }

    /**
     * Test of getTipoDeJogo method, of class TorneioVO.
     */
    @Test
    public void testGetTipoDeJogo() {
    }

    /**
     * Test of setTipoDeJogo method, of class TorneioVO.
     */
    @Test
    public void testSetTipoDeJogo() {
    }

    /**
     * Test of getTime method, of class TorneioVO.
     */
    @Test
    public void testGetTime() {
    }

    /**
     * Test of setTime method, of class TorneioVO.
     */
    @Test
    public void testSetTime() {
    }

    /**
     * Test of getParticipantes method, of class TorneioVO.
     */
    @Test
    public void testGetParticipantes() {
    }

    /**
     * Test of setParticipantes method, of class TorneioVO.
     */
    @Test
    public void testSetParticipantes() {
    }

    /**
     * Test of getRodadas method, of class TorneioVO.
     */
    @Test
    public void testGetRodadas() {
    }

    /**
     * Test of setRodadas method, of class TorneioVO.
     */
    @Test
    public void testSetRodadas() {
    }

    /**
     * Test of toString method, of class TorneioVO.
     */
    @Test
    public void testToString() {
    }
    
}
