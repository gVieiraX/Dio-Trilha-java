package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class People {

    private  String nome;
    private LocalDate nascimento;

    public People(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade(){return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDate.now());}

    public  boolean ehMaiorDeIdade(){
        return  getIdade() >=19;
    }
}
