package org.maven.prueba;


import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testSum() {
        assertEquals(15, App.sum(10, 5));
        assertEquals(0, App.sum(0, 0));
        assertEquals(-10, App.sum(-5, -5));
    }

    public void testRest() {
        assertEquals(5, App.rest(10, 5));
        assertEquals(0, App.rest(5, 5));
        assertEquals(-10, App.rest(-5, 5));
    }

    public void testMult() {
        assertEquals(50, App.mult(10, 5));
        assertEquals(0, App.mult(5, 0));
        assertEquals(-25, App.mult(5, -5));
    }

    public void testDiv() {
        assertEquals(2, App.div(10, 5));
        assertEquals(0, App.div(0, 5));
        assertEquals(-1, App.div(5, -5));
        assertFalse( App.div(5, -5) != -1);
        
        // Test para división por cero, debería lanzar una excepción ArithmeticException
        try {
            App.div(10, 0);
            // Si no la lanza es porque hay algo mal. Fail fuerza error
            fail("Se esperaba ArithmeticException");
        } catch (ArithmeticException e) {
            // Excepción esperada, no es necesario hacer nada aquí
        }
    }
}