package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionaisTeste {

    @Test
    @EnabledOnJre(JRE.JAVA_22)
    void validarAlgoNoUsuario(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
