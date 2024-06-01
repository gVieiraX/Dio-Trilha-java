package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade(){
        Pessoa pessoa = new Pessoa("Gabriel", LocalDate.of(2002,1,1));
        Assertions.assertEquals(22,pessoa.getIdade());
    }
}
