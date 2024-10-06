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
 * @version 1.0 Beta Xis Carne
 * @since 26/06/2019 - 13:54
 */
public class AlunoTest {
    
    private static final Aluno ALUNO = new Aluno();
    
    public AlunoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrou em setUpClass\n");
        ALUNO.setNota1(10);
        ALUNO.setNota2(10);
        ALUNO.setSexo("Feminino");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Entrou em tearDownClass\n");
    }
    
    @Before
    public void setUp() {
        System.out.println("Entrou em setUp\n");
        ALUNO.setNota1(10);
        ALUNO.setNota2(10);
        ALUNO.setTotalAulas(19);
        ALUNO.setPresencas(18);
        ALUNO.setPeso1(10);
        ALUNO.setPeso2(8);
    }
    
    @After
    public void tearDown() {
        System.out.println("Entrou em tearDown\n");
        System.out.println(ALUNO.toString());
    }

    /**
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        System.out.println("Entrou em testGetNome\n");
    }

    /**
     * Test of setNome method, of class Aluno.
     */
    @Test
    public void testSetNome() {
        System.out.println("Entrou em testSetNome\n");
    }

    /**
     * Test of getSobrenome method, of class Aluno.
     */
    @Test
    public void testGetSobrenome() {
        System.out.println("Entrou em testGetSobrenome\n");
    }

    /**
     * Test of setSobrenome method, of class Aluno.
     */
    @Test
    public void testSetSobrenome() {
        System.out.println("Entrou em testSetSobrenome\n");
    }

    /**
     * Test of getNota1 method, of class Aluno.
     */
    @Test
    public void testGetNota1() {
        System.out.println("Entrou em testGetNota1\n");
    }

    /**
     * Test of setNota1 method, of class Aluno.
     */
    @Test
    public void testSetNota1() {
        System.out.println("Entrou em testSetNota1\n");
    }

    /**
     * Test of getNota2 method, of class Aluno.
     */
    @Test
    public void testGetNota2() {
        System.out.println("Entrou em testGetNota2\n");
    }

    /**
     * Test of setNota2 method, of class Aluno.
     */
    @Test
    public void testSetNota2() {
        System.out.println("Entrou em testSetNota2\n");
    }

    /**
     * Test of getPeso1 method, of class Aluno.
     */
    @Test
    public void testGetPeso1() {
        System.out.println("Entrou em testGetPeso1\n");
    }

    /**
     * Test of setPeso1 method, of class Aluno.
     */
    @Test
    public void testSetPeso1() {
        System.out.println("Entrou em testSetPeso1\n");
    }

    /**
     * Test of getPeso2 method, of class Aluno.
     */
    @Test
    public void testGetPeso2() {
        System.out.println("Entrou em testGetPeso2\n");
    }

    /**
     * Test of setPeso2 method, of class Aluno.
     */
    @Test
    public void testSetPeso2() {
        System.out.println("Entrou em testSetPeso2\n");
    }

    /**
     * Test of getTotalAulas method, of class Aluno.
     */
    @Test
    public void testGetTotalAulas() {
        System.out.println("Entrou em testGetTotalAulas\n");
    }

    /**
     * Test of setTotalAulas method, of class Aluno.
     */
    @Test
    public void testSetTotalAulas() {
        System.out.println("Entrou em testSetTotalAulas\n");
    }

    /**
     * Test of getPresencas method, of class Aluno.
     */
    @Test
    public void testGetPresencas() {
        System.out.println("Entrou em testGetPresencas\n");
    }

    /**
     * Test of setPresencas method, of class Aluno.
     */
    @Test
    public void testSetPresencas() {
        System.out.println("Entrou em testSetPresencas\n");
    }

    /**
     * Test of getSexo method, of class Aluno.
     */
    @Test
    public void testGetSexo() {
        System.out.println("Entrou em testGetSexo\n");
    }

    /**
     * Test of setSexo method, of class Aluno.
     */
    @Test
    public void testSetSexo() {
        System.out.println("Entrou em testSetSexo\n");
    }
    
    /**
     * Test of calcularMediaAritmetica method, of class Aluno.
     */
    @Test
    public void testCalcularMediaAritmetica() {
        
        System.out.println("Entrou em testCalcularMediaAritmetica\n");
        assertEquals(10, ALUNO.calcularMediaAritmetica(), 0);
        ALUNO.setNota1(8);
        ALUNO.setNota2(9);
        assertEquals(8.5, ALUNO.calcularMediaAritmetica(), 0);
        ALUNO.setNota1(7.8);
        ALUNO.setNota2(7.8);
        assertEquals(7.8, ALUNO.calcularMediaAritmetica(), 0);
        
    }
    
    /**
     * Test of testVerificarFrequencia method, of class Aluno.
     */
    @Test
    public void testVerificarFrequencia() {
        
        System.out.println(" Entrou em testVerificarFrequencia\n");
        assertEquals(94.0, ALUNO.verificarFrequencia(), 0.0);
        ALUNO.setTotalAulas(324);
        ALUNO.setPresencas(33);
        assertEquals(10.0, ALUNO.verificarFrequencia(), 0.0);
        ALUNO.setTotalAulas(12);
        ALUNO.setPresencas(6);
        assertEquals(50.0, ALUNO.verificarFrequencia(), 0.0);
        
    }
    
    /**
     * Test of testVerificarSituacao method, of class Aluno.
     */
    @Test
    public void testVerificarSituacao() {
        System.out.println("Entrou em testVerificarSituacao\n");
        //Media artimetica no setUp 10 - Aprovado
        ALUNO.setTotalAulas(100);
        ALUNO.setPresencas(100);
        assertEquals("Aprovado", ALUNO.verificarSituacao());
        //Reprovação por frequencia
        ALUNO.setNota1(9);
        ALUNO.setNota2(8);
        ALUNO.setTotalAulas(100);
        ALUNO.setPresencas(25);
        assertEquals("Reprovado por Frequência", ALUNO.verificarSituacao());
        //Reprovação por média
        ALUNO.setNota1(5);
        ALUNO.setNota2(5);
        ALUNO.setTotalAulas(100);
        ALUNO.setPresencas(80);
        assertEquals("Reprovado por Média", ALUNO.verificarSituacao());
        //Reprovação por Média ou frequencia
        ALUNO.setNota1(3.4);
        ALUNO.setNota2(1.8);
        ALUNO.setTotalAulas(100);
        ALUNO.setPresencas(21);
        assertEquals("Reprovado por Média ou Frequência", ALUNO.verificarSituacao());
    }
    
    /**
     * Test of testCalcularMediaPonderada method, of class Aluno.
     */
    @Test
    public void testCalcularMediaPonderada() {
        System.out.println("Entrou em testCalcularMediaPonderada\n");
        assertEquals(10, ALUNO.calcularMediaPonderada(), 0.0);
        ALUNO.setNota1(10);
        ALUNO.setNota2(6);
        ALUNO.setPeso1(6);
        ALUNO.setPeso2(10);
        assertEquals(7.5, ALUNO.calcularMediaPonderada(), 0.0);
        //
        ALUNO.setNota1(4.2);
        ALUNO.setNota2(6.5);
        ALUNO.setPeso1(4.8);
        ALUNO.setPeso2(7.6);
        assertEquals(5.609, ALUNO.calcularMediaPonderada(), 0.01);
        //
        ALUNO.setNota1(2.4);
        ALUNO.setNota2(5.6);
        ALUNO.setPeso1(8);
        ALUNO.setPeso2(4);
        assertEquals(3.46, ALUNO.calcularMediaPonderada(), 0.01);
        
    }
    
    /**
     * Test of testVerificarConceito method, of class Aluno.
     */
    @Test
    public void testVerificarConceito() {
        System.out.println("Entrou em testVerificarConceito");
        
        assertEquals("A", ALUNO.verificarConceito());
        
        ALUNO.setNota1(8.5);
        ALUNO.setNota2(8.5);
        assertEquals("B", ALUNO.verificarConceito());

        ALUNO.setNota1(6.5);
        ALUNO.setNota2(6.5);
        assertEquals("C", ALUNO.verificarConceito());

        ALUNO.setNota1(5);
        ALUNO.setNota2(5);
        assertEquals("D", ALUNO.verificarConceito());
    }

    /**
     * Test of toString method, of class Aluno.
     */
    @Test
    public void testToString() {
        System.out.println("Entrou em testToString\n");
        System.out.println(ALUNO.toString());
    }//fecha tostring
}//fecha classe
