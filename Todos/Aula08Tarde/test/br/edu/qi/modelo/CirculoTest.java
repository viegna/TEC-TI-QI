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
 * @version 1.0
 * @since 27/06/2019 13:56
 */
public class CirculoTest {
    
    private static final Circulo CIRCULO = new Circulo();
    
    public CirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrou em setUpclass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp");
        CIRCULO.setRaio(12);
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    /**
     * Test of getRaio method, of class Circulo.
     */
    @Test
    public void testGetRaio() {
        System.out.println("testGetRaio");
    }

    /**
     * Test of setRaio method, of class Circulo.
     */
    @Test
    public void testSetRaio() {
        System.out.println("testSetRaio");
    }
    
    /**
     * Test of calcularPerimetro method, of class Circulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("Calcular Perimetro ");
        assertEquals(75.39, CIRCULO.calcularPerimetro(), 0.01);
        CIRCULO.setRaio(23.5);
        assertEquals(147.65, CIRCULO.calcularPerimetro(), 0.01);
        
    }
    
    /**
     * Test of calcularArea method, of class Circulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("\nCalcular Area:");
        assertEquals(452.38, CIRCULO.calcularArea(), 0.01);
        CIRCULO.setRaio(37);
        assertEquals(4300.84, CIRCULO.calcularArea(), 0.01);
    }
    

    /**
     * Test of toString method, of class Circulo.
     */
    @Test
    public void testToString() {
        System.out.println("testToString");
        System.out.println(CIRCULO.toString());
    }
    
}//fecha classe
