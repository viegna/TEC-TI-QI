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
 * @since 03/07/2019 - 13:58
 * @version 1.0.1
 */
public class PerifericoTest {
    
    private static final Periferico PERIFERICO = new Periferico();
    
    public PerifericoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        PERIFERICO.setCor("Azul");
        PERIFERICO.setModelo("v027 Azul 014");
        PERIFERICO.setQuantidade(3);
        PERIFERICO.setValor(28.14);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(PERIFERICO.toString());
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getModelo method, of class Periferico.
     */
    @Test
    public void testGetModelo() {
    }

    /**
     * Test of setModelo method, of class Periferico.
     */
    @Test
    public void testSetModelo() {
    }

    /**
     * Test of getCor method, of class Periferico.
     */
    @Test
    public void testGetCor() {
    }

    /**
     * Test of setCor method, of class Periferico.
     */
    @Test
    public void testSetCor() {
    }

    /**
     * Test of getValor method, of class Periferico.
     */
    @Test
    public void testGetValor() {
    }

    /**
     * Test of setValor method, of class Periferico.
     */
    @Test
    public void testSetValor() {
    }

    /**
     * Test of getQuantidade method, of class Periferico.
     */
    @Test
    public void testGetQuantidade() {
    }

    /**
     * Test of setQuantidade method, of class Periferico.
     */
    @Test
    public void testSetQuantidade() {
    }
    
    /**
     * Test of toString method, of class Periferico.
     */
    @Test
    public void testCalcularValorTotal() {
        assertEquals(84.42, PERIFERICO.calcularValorTotal() , 0.0);
        PERIFERICO.setValor(120);
        PERIFERICO.setQuantidade(3);
        assertEquals(360, PERIFERICO.calcularValorTotal(), 0.0);
        PERIFERICO.setValor(10);
        PERIFERICO.setQuantidade(3);
        assertEquals(30, PERIFERICO.calcularValorTotal(), 0.0);
    }

    /**
     * Test of toString method, of class Periferico.
     */
    @Test
    public void testToString() {
    }
    
}
