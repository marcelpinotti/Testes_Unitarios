package com.teste;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.emptyOrNullString;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

public class MatcherTest {

    @Test
    public void givenBean_checkToString(){
        Pessoa pessoa = new Pessoa("Marcel", "Pinotti");
        String str=pessoa.toString();
        assertThat(pessoa, HasToString.hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExists() {
        Pessoa pessoa = new Pessoa("Marcel", "Pinotti");
        assertThat(pessoa, HasProperty.hasProperty("nome"));
    }

    @Test
    public void givenCollection_checkEmpty() {
        List<String> emptyList = new ArrayList<String>();
        assertThat(emptyList, Matchers.empty());
    }

    @Test
    public void givenAnInteger_checkGreater() {
        assertThat(1, Matchers.greaterThan(0));
    }

    @Test
    public void givenString_checkNull() {
        assertThat(((String) null), is(emptyOrNullString()));
    }
}
