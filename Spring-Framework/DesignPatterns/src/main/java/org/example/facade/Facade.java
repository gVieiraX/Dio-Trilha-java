package org.example.facade;

import org.example.subsistema1.CrmSerivce;
import org.example.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String  cidade = CepApi.getInstance().recuperarCidade(cep);
        String  estado = CepApi.getInstance().recuperarEstado(cep);

        CrmSerivce.gravarCliente(nome,cep,cidade,estado);
    }
}
