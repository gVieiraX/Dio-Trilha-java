package org.example;


import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDados {

    @BeforeAll
   static void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new People("Gabriel", LocalDate.of(2003,1,1)));
    }

    @AfterEach
    void removeDadosParaTeste(){
        BancoDeDados.removeDados(new People("Gabriel", LocalDate.of(2003,1,1)));
    }

    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConxao(){
        BancoDeDados.finalizarConxao();
    }
}
