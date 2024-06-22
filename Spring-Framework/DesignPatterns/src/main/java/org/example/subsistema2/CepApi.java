package org.example.subsistema2;

public class CepApi {
public static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Timóteo";
    }
    public String recuperarEstado(String cep){
        return "Minas Gerais";
    }

}