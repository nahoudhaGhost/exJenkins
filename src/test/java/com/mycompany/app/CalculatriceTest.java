package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import com.master.calculpp.Calculatrice;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatriceTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void additionTest() {
        Calculatrice c = new Calculatrice();
        int x = c.addition(7, 8);
        assertEquals(x, 15);
    }

    @Test
    public void multiplicationTest() {
        Calculatrice c = new Calculatrice();
        int y = c.multiplication(4, 6);
        assertEquals(y, 24);
    }

    @Test
    public void soustractionTest() {
        Calculatrice c = new Calculatrice();
        int z = c.soustraction(8, 5);
        assertEquals(z, 3);
    }

    @Test
    public void divisionTest() {
        Calculatrice c = new Calculatrice();
        int w = c.division(9, 3);
        assertEquals(w, 3);
    }

    @Test
    public void moduloTest() {
        Calculatrice c = new Calculatrice();
        int v = c.modulo(15, 4);
        assertEquals(v, 3);
    }

}