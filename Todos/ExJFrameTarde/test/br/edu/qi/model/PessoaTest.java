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
 * @since  19/06/2019 - 13:59
 * @version 1.1.1 Beta Ruffles
 */
public class PessoaTest {
    
    private static final Pessoa PESSOA = new Pessoa();
    
    public PessoaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrou no setupClass");
        PESSOA.setNome("zé");
        PESSOA.setIdade(10);
        PESSOA.setPeso(10);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Entrou no tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Entrou no setUp");
        PESSOA.setNome("zé");
        PESSOA.setIdade(10);
        PESSOA.setPeso(10);
    }
    
    @After
    public void tearDown() {
        System.out.println("Entrou no tearDown");
        System.out.println(PESSOA.toString());
    }

    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("Entrou no testGetNome");
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("Entrou no testSetNome");
    }

    /**
     * Test of getPeso method, of class Pessoa.
     */
    @Test
    public void testGetPeso() {
        System.out.println("Entrou no testGetPeso");
    }

    /**
     * Test of setPeso method, of class Pessoa.
     */
    @Test
    public void testSetPeso() {
        System.out.println("Entrou no testSetPeso");
    }

    /**
     * Test of getIdade method, of class Pessoa.
     */
    @Test
    public void testGetIdade() {
        System.out.println("Entrou no testGetIdade");
    }

    /**
     * Test of setIdade method, of class Pessoa.
     */
    @Test
    public void testSetIdade() {
        System.out.println("Entrou no testSetIdade");
    }

    /**
     * Test of calcularIdadeMeses method, of class Pessoa.
     */
    @Test
    public void testCalcularIdadeMeses() {
        System.out.println("Entrou no testCalcularIdadeMeses");
        assertEquals(120, PESSOA.calcularIdadeMeses());
        PESSOA.setIdade(12);
        assertEquals(144, PESSOA.calcularIdadeMeses());
        PESSOA.setIdade(30);
        assertEquals(360, PESSOA.calcularIdadeMeses());
    }

    /**
     * Test of toString method, of class Pessoa.
     */
    @Test
    public void testToString() {
        System.out.println("Entrou no testToString");
    }
}//fecha classe
