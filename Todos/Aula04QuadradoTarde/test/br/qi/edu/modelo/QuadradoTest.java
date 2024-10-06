/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.qi.edu.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogenes
 * @author Eduarda
 * @since 18/06/2019 - 15:50
 * @version 1.0.1 Beta Lasanha
 */
public class QuadradoTest {
    
    private static final Quadrado QUADRADO = new Quadrado();
    
    public QuadradoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrou no setUpClass");
        
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Entrou no tearDownClass");
        
    }
    
    @Before
    public void setUp() {
        System.out.println("Entrou no setUp");
        QUADRADO.setValorLado(40.0);
    }
    
    @After
    public void tearDown() {
        System.out.println("Entrou no tearDown");
    }

    /**
     * Test of getValorLado method, of class Quadrado.
     */
    @Test
    public void testGetValorLado() {
        System.out.println("Entrou no testGetValorLado");
    }

    /**
     * Test of setValorLado method, of class Quadrado.
     */
    @Test
    public void testSetValorLado() {
        System.out.println("Entrou no testSetValorLado");
    }
    /**
     * Test of calcularArea method, of class Quadrado.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("Entrou no testCalcularArea");
        assertEquals(1600, QUADRADO.calcularArea(), 0.0);
        QUADRADO.setValorLado(10);
        assertEquals(100, QUADRADO.calcularArea(), 0.0);
    }
    
    /**
     * Test of calcularPerimetro method, of class Quadrado.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("Entrou no testCalcularPerimetro");
        assertEquals(160, QUADRADO.calcularPerimetro(),0.0);
        QUADRADO.setValorLado(10);
        assertEquals(40, QUADRADO.calcularPerimetro(), 0.0);
    }
    /**
     * Test of toString method, of class Quadrado.
     */
    @Test
    public void testToString() {
        System.out.println("Entrou no testToString");
        System.out.println(QUADRADO.toString());
    }
    
}
