/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identificacao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cristian
 */
public class EmpresaTest {
    
    public EmpresaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of set_nome_Empresa method, of class Empresa.
     */
    @org.junit.jupiter.api.Test
    public void testSet_nome_Empresa() {
        System.out.println("set_nome_Empresa");
        String nome_Empresa = "";
        Empresa instance = new Empresa();
        instance.set_nome_Empresa(nome_Empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecao method, of class Empresa.
     */
    @org.junit.jupiter.api.Test
    public void testSetSecao() {
        System.out.println("setSecao");
        String sesecaoo = "";
        Empresa instance = new Empresa();
        instance.setSecao(sesecaoo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_nome_Empresa method, of class Empresa.
     */
    @org.junit.jupiter.api.Test
    public void testGet_nome_Empresa() {
        System.out.println("get_nome_Empresa");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.get_nome_Empresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecao method, of class Empresa.
     */
    @org.junit.jupiter.api.Test
    public void testGetSecao() {
        System.out.println("getSecao");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getSecao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
