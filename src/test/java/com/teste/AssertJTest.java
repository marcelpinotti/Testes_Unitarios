package com.teste;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {


    @Test
    public void checkEquality() {
        Pessoa pessoa = new Pessoa("Marcel", "Pinotti");
        Pessoa clonandoPessoa = pessoa;

        assertThat(pessoa).isEqualTo(clonandoPessoa);
    }

    //Criando nova referência, o que dará erro no teste.

    //@Test
    // --> public void newReferenceCheckEquality() {
    //      Pessoa NovaPessoa= new Pessoa("Marcel", "Pinotti");
    //      Pessoa clonandoNovaPessoa = new Pessoa("Marcel", "Pinotti");

    //      assertThat(NovaPessoa).isEqualTo(clonandoNovaPessoa);
    //    }

}
