/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.calculadora.Calculadora;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author domtaxx
 */
public class CalculadoraTestNGTest {
    
    public CalculadoraTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testSuma(){
        int a = 6;
        int b = 9;
        int res = a+b;
        int expRes;
        Calculadora calc = new Calculadora();
        expRes = calc.sumar(a, b);
        assertEquals(res, expRes);
    }
}
