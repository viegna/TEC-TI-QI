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
 * @author Diogenes W.
 * @since 25/06/2019 - 15:45
 * @version 1.0
 */
public class RetanguloTest {
    
    private static final Retangulo RETANGULO = new Retangulo();
    
    public RetanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("entrou em set up class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("entrou em tear down class");
    }
    
    @Before
    public void setUp() {
        System.out.println("entrou em set up");
        RETANGULO.setAltura(10);
        RETANGULO.setBase(12);       
    }
    
    @After
    public void tearDown() {
        System.out.println("entrou em tear down");
        System.out.println(RETANGULO.toString());
    }

    /**
     * Test of getBase method, of class Retangulo.
     */
    @Test
    public void testGetBase() {
        System.out.println("entrou em test get base");
    }

    /**
     * Test of setBase method, of class Retangulo.
     */
    @Test
    public void testSetBase() {
        System.out.println("entrou em test set base");
    }

    /**
     * Test of getAltura method, of class Retangulo.
     */
    @Test
    public void testGetAltura() {
        System.out.println("entrou em test get altura");
    }

    /**
     * Test of setAltura method, of class Retangulo.
     */
    @Test
    public void testSetAltura() {
        System.out.println("entrou em test set altura");
    }
    /**
     * 
     */
    @Test
    public void testCalcularArea() {
        assertEquals(120,RETANGULO.calcularArea(), 0.0);
        RETANGULO.setBase(10);
        assertEquals(100,RETANGULO.calcularArea(), 0.0);
    }
    
    /**
     * 
     */
    @Test 
    public  void testCalcularPerimetro() {
        assertEquals(44,RETANGULO.calcularPerimetro(), 0.0);
        RETANGULO.setBase(10);
        assertEquals(40,RETANGULO.calcularPerimetro(), 0.0);
         
    }

    /**
     * Test of toString method, of class Retangulo.
     */
    @Test
    public void testToString() {
        System.out.println("test tostring");
    }
}//fecha classe
