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
 * @since 24/06/2019 - 15:49
 * @version 1.0 Beta
 */
public class ProdutoTest {
    
    private static final Produto PRODUTO = new Produto();
    
    public ProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrou no set up class");
        PRODUTO.setNome("zézin");
        PRODUTO.setPagamento("Débito");
        PRODUTO.setQuantidade(2);
        PRODUTO.setValor(10.0);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(" tear down class");
    }
    
    @Before
    public void setUp() {
        System.out.println("set up");
        System.out.println(PRODUTO.toString());
    }
    
    @After
    public void tearDown() {
        System.out.println("tear down ");
    }

    /**
     * Test of getNome method, of class Produto.
     */
    @Test
    public void testGetNome() {
        System.out.println("test get nome");
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("test set nome");
    }

    /**
     * Test of getPagamento method, of class Produto.
     */
    @Test
    public void testGetPagamento() {
        System.out.println("test get pagamento");
    }

    /**
     * Test of setPagamento method, of class Produto.
     */
    @Test
    public void testSetPagamento() {
        System.out.println(" test set pagamento");
    }

    /**
     * Test of getQuantidade method, of class Produto.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("test get quantidade");
    }

    /**
     * Test of setQuantidade method, of class Produto.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("test set quantidade");
    }

    /**
     * Test of getValor method, of class Produto.
     */
    @Test
    public void testGetValor() {
        System.out.println("test get valor");
    }

    /**
     * Test of setValor method, of class Produto.
     */
    @Test
    public void testSetValor() {
        System.out.println("test set valor");
    }

    /**
     * Test of valorTotal method, of class Produto.
     */
    @Test
    public void testValorTotal() {
        System.out.println("test valor total");
        assertEquals(20.0, PRODUTO.valorTotal(), 0.0);
        PRODUTO.setValor(30);
        assertEquals(60, PRODUTO.valorTotal(), 0.0);
    }

    /**
     * Test of toString method, of class Produto.
     */
    @Test
    public void testToString() {
        System.out.println("test o string");
    }
    
}
