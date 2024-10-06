/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class ConversorTest {
    
    private static final Conversor CONVERSOR = new Conversor();
    
    public ConversorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrou no setUpClass");
        CONVERSOR.setIdade(2);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Entrou no tearDownClass");
        System.out.println(CONVERSOR.toString());
    }
    
    @Before
    public void setUp() {
        System.out.println("Entrou no setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("Entrou no tearDown");
    }

    /**
     * Test of getIdade method, of class Conversor.
     */
    @Test
    public void testGetIdade() {
        System.out.println("Entrou no testGetIdade");
    }

    /**
     * Test of setIdade method, of class Conversor.
     */
    @Test
    public void testSetIdade() {
        System.out.println("testSetIdade");
    }

    /**
     * Test of calcularIdadeEmMeses method, of class Conversor.
     */
    @Test
    public void testCalcularIdadeEmMeses() {
        System.out.println("Entrou no testCalcularIdadeEmMeses");
        assertEquals(24, CONVERSOR.calcularIdadeEmMeses());
    }

    /**
     * Test of calcularIdadeEmSemanas method, of class Conversor.
     */
    @Test
    public void testCalcularIdadeEmSemanas() {
        System.out.println("Entrou no testCalcularIdadeEmSemanas");
        assertEquals(96, CONVERSOR.calcularIdadeEmSemanas());
    }

    /**
     * Test of calcularIdadeEmDias method, of class Conversor.
     */
    @Test
    public void testCalcularIdadeEmDias() {
        System.out.println("Entrou no testCalcularIdadeEmDias");
        assertEquals(730, CONVERSOR.calcularIdadeEmDias());
    }

    /**
     * Test of toString method, of class Conversor.
     */
    @Test
    public void testToString() {
        System.out.println("Entrou no testToString");
    }
    
}
