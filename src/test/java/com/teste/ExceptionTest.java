package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){

       new ArrayList<Object>().get(0);
    }

    // Causando um erro no teste, pois o mesmo stá esperando uma Exception que não ocorre.

    @Test(expected = IndexOutOfBoundsException.class)
    public void emptyUm(){

        List<String> nomes = new ArrayList<String>();
        nomes.add("Marcel");
        nomes.get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExpectExceptionMessage() throws IndexOutOfBoundsException{

        List<Object> list = new ArrayList<Object>();

        thrown.expect (IndexOutOfBoundsException.class);
        thrown.expectMessage ("Index 0 out of bounds for length 0");

        list.get(0);
    }


    @Test
    public void testExceptionMessage(){
        try {
            new ArrayList<Object>().get(0);
            fail ("Esperando que o IndexOutOfBoundsException seja lançada");
        } catch (IndexOutOfBoundsException ex) {
            assertThat(ex.getMessage(), is ("Index 0 out of bounds for length 0"));
        }
    }





}
