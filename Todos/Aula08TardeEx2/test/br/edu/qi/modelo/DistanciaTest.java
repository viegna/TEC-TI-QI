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
 * @since 27/06/2019 - 14:45
 * @version 1.0
 */
public class DistanciaTest {
    
    private static final Distancia DISTANCIA = new Distancia();
    
    public DistanciaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("set up class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("teardownclass");
        System.out.println(DISTANCIA.toString());
    }
    
    @Before
    public void setUp() {
        System.out.println("setup");
        DISTANCIA.setValorX1(1);
        DISTANCIA.setValorX2(4);
        DISTANCIA.setValorY1(5);
        DISTANCIA.setValorY2(1);
    }
    
    @After
    public void tearDown() {
        System.out.println("teardown");
    }

    /**
     * Test of getValorX1 method, of class Distancia.
     */
    @Test
    public void testGetValorX1() {
        System.out.println("getvalorx1");
    }

    /**
     * Test of setValorX1 method, of class Distancia.
     */
    @Test
    public void testSetValorX1() {
        System.out.println("setvalorx1");
    }

    /**
     * Test of getValorX2 method, of class Distancia.
     */
    @Test
    public void testGetValorX2() {
        System.out.println("getvalorx2");
    }

    /**
     * Test of setValorX2 method, of class Distancia.
     */
    @Test
    public void testSetValorX2() {
        System.out.println("setvalorx2");
    }

    /**
     * Test of getValorY1 method, of class Distancia.
     */
    @Test
    public void testGetValorY1() {
        System.out.println("getvalory1");
    }

    /**
     * Test of setValorY1 method, of class Distancia.
     */
    @Test
    public void testSetValorY1() {
        System.out.println("setvalory1");
    }

    /**
     * Test of getValorY2 method, of class Distancia.
     */
    @Test
    public void testGetValorY2() {
        System.out.println("getvalory2");
    }

    /**
     * Test of setValorY2 method, of class Distancia.
     */
    @Test
    public void testSetValorY2() {
        System.out.println("setvalory2");
    }
    
    /**
     * Test of calcularDistancia method, of class Distancia.
     */
    public void testCalcularDistancia() {
        System.out.println("testCalcularDistancia");
        assertEquals(5, DISTANCIA.calcularDistancia(), 0);
        DISTANCIA.setValorX1(10);
        DISTANCIA.setValorX2(10);
        DISTANCIA.setValorY1(10);
        DISTANCIA.setValorY2(10);
        assertEquals(0, DISTANCIA.calcularDistancia(), 0);
        assertEquals(10, DISTANCIA.getValorX1(), 0);
        assertEquals(10, DISTANCIA.getValorY1(), 0);
        assertEquals(10, DISTANCIA.getValorX2(), 0);
        assertEquals(10, DISTANCIA.getValorY2(), 0);
        
    }

    /**
     * Test of toString method, of class Distancia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
    }
    
}//fecha classe
