package org.example;

import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;
import org.example.strategy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Singleton

    public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstance();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstance();
    System.out.println(eager);

    SingletonLazyHolder lzHolder = SingletonLazyHolder.getInstance();
    System.out.println(lzHolder);

    //Strategy
        System.out.println("-----------------------------");
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(normal);
        robo.mover();
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
