package org.example;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

    @DisplayName("A")
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);

    }

    @DisplayName("G")
    @Test
    void validaFluxoY(){
        Assertions.assertTrue(true);

    }
    @DisplayName("U")
    @Test
    void validaFluxoU(){
        Assertions.assertTrue(true);

    }
}
