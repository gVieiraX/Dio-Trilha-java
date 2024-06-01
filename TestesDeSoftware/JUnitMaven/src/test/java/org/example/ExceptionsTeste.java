package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarValorTransferencia(){
      Conta origem =  new Conta ("2334",0);
      Conta destino =  new Conta ("2442",100);

      TransferenciaConta transferenciaConta = new TransferenciaConta();

        Assertions.assertDoesNotThrow(()->transferenciaConta.transfere(origem, destino,20));
    }
}
