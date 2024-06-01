package org.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public  static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");

    }

    public static void finalizarConxao(){
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(People people){
        //insere pessoa no banco de dados
        LOGGER.info("Inseriu dados");

    }

    public static void removeDados(People people){
        //remove pessoa no banco de dados
        LOGGER.info("Removeu dados");

    }
}
