package com.example.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    // should return the square of two numbers
    @Test
    public void testSquare(){
        App app = new App();
        assertEquals(app.square(2), 4);
        assertEquals(app.square(3), 9);
        assertEquals(app.square(4), 16);
    }
    // should return the number of 'a' in a word
    @Test
    public void testCountA(){
        App app = new App();
        assertEquals(app.countA("a"), 1);
        assertTrue(app.countA("a")==1);
        assertTrue(app.countA("A")==1);
        assertTrue(app.countA("aa")==2);
        assertTrue(app.countA("AA")==2);
        assertTrue(app.countA("aAa")==3);
        assertTrue(app.countA("AaA")==3);
    }

    // return 0 if word == null && word.isEmpty
    @Test
    public void testCountA_null(){
        App app = new App();
        assertTrue(app.countA(null)==0);
        assertTrue(app.countA("")==0);
    }
}
