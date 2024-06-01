package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoNoUsuario(){
        Assumptions.assumeTrue("Gabriel".equals(System.getenv("USER")));
        Assertions.assertEquals(19, 5 + 5);
    }

}
