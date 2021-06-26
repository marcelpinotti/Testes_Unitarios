package com.teste;


import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[]  atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("teste", "teste");
    }

    @Test
    public void testAssertFalse(){
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNoteSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        assertNull(null);
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(168);
        assertSame(aNumber, aNumber);
    }
}
