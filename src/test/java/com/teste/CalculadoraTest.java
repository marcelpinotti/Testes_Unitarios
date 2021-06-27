package com.teste;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Test
    public void somar() {

        Calculadora calc = new Calculadora();

        int soma = calc.somar ("1+1+3");
        assertEquals(5, soma);
    }

    @Test
    public void testeCalculadoraComMock(){

        Calculadora calcMock = mock(Calculadora.class);

        when(calcMock.somar("1+3+4")).thenReturn(8);

        int resultado = calcMock.somar("1+3+4");

        assertEquals(8, resultado);
    }
}