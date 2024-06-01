package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente(){
        People pessoa = new People("Jéssica", LocalDate.of(2002,1,1));
        Assertions.assertEquals(22,pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEMaiorDeIdade(){
        People biel = new People("Gabriel",LocalDate.of(2003,4,1));
        Assertions.assertTrue(biel.ehMaiorDeIdade());


        People vieira = new People("Vieira", LocalDate.now());
        Assertions.assertFalse(vieira.ehMaiorDeIdade());

    }


}
