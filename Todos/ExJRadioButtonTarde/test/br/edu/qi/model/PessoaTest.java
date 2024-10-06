/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diogenes W.
 * @version 1.0.1 Beta Springles
 * @since 24/06/2019 - 13:58
 */
public class PessoaTest {
    
    private static final Pessoa PESSOA = new Pessoa();
    
    public PessoaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("set up class");
        PESSOA.setNome("Zézin");
        PESSOA.setSexo("Masculino");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tear down class");
    }
    
    @Before
    public void setUp() {
        System.out.println("set up");
    }
    
    @After
    public void tearDown() {
        System.out.println("tear down");
    }

    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("test get nome");
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println(" test set nome");
    }

    /**
     * Test of getSexo method, of class Pessoa.
     */
    @Test
    public void testGetSexo() {
        System.out.println("test get sexo");
    }

    /**
     * Test of setSexo method, of class Pessoa.
     */
    @Test
    public void testSetSexo() {
        System.out.println("test set sexo");
    }

    /**
     * Test of verificarSexo method, of class Pessoa.
     */
    @Test
    public void testVerificarSexo() {
        System.out.println("Verificar Sexo");
        assertEquals("Você é homem.", PESSOA.verificarSexo());
        PESSOA.setSexo("Feminino");
        assertEquals("Você é mulher.", PESSOA.verificarSexo());
    }

    /**
     * Test of toString method, of class Pessoa.
     */
    @Test
    public void testToString() {
        System.out.println("testToString");
        System.out.println(PESSOA.toString());
    }
    
}
