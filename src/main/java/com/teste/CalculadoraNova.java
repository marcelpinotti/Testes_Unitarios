package com.teste;

public class CalculadoraNova {                              //  Aplicando Metodologia TDD

    public int somarDoisValores (int valorA, int valorB){   //3º PASSO: Escrever o código (neste exemplo criar a classe CalculadoraNova.

        return valorA + valorB;                             //5º PASSO: Refatorar o cógigo para solucionar erros.
    }

    public int somarVariosValores(int... valores){          //5º OU 3º PASSOS: Refatorando o código ou Escrevendo um novo método
            int soma = 0;                                   // no ciclo do TDD.
            for (int valor : valores) {
                soma += valor;
            }
            return soma;
    }

}
