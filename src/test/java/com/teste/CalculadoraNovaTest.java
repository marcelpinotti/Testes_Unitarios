package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {

                                                                // Aplicando a Metodologia TDD

    @Test                                                       //  ADD TEST
    public void deveSomarDoisValores(){                         //1º PASSO: Criar o teste.
                                                                //  WATCH TEST FAIL
        CalculadoraNova calcNova = new CalculadoraNova();       //2º PASSO: Rodar o teste para gerar falha.
                                                                //  WRITE CODE
        int valorA = 3;                                         //3º PASSO: Escrever o código (neste exemplo criar a classe CalculadoraNova.
        int valorB = 2;                                         //  RUN TESTS
                                                                //4º PASSO: Após criar o código rodar novamente o teste.
        int soma = calcNova.somarDoisValores(valorA, valorB);   //  REFACTOR
                                                                //5º PASSO: Refatorar o cógigo para solucionar erros.
        assertEquals(5, soma);                          //  ADD TEST
    }                                                           //6º PASSO: Criar um novo teste....

    @Test
    public void deveSomarVariosValores() {
        int valorA = 1;
        int valorB = 2;
        int valorC = 3;

        CalculadoraNova NovaCalc = new CalculadoraNova();
        int soma = NovaCalc.somarVariosValores(valorA, valorB, valorC);

        assertEquals(6, soma);
    }
}
