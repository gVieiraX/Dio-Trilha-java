package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {


    @Test
    void validarLancamentos(){

        int[] primeiroLancamento = {10,20,30,40,50};
        int[] segundoLancamento = {10,20,30,40,50};

        assertArrayEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarObjetoNulo(){
        People pesssoa = null;

        assertNull(pesssoa);

        pesssoa = new People("Gabriel", LocalDate.now());
       assertNotNull(pesssoa);
    }

    @Test
    void validarNumerosDiferentes(){

        double value = 23.5;
        double othervalue = 23;

        assertNotEquals(value,othervalue);
    }
}
