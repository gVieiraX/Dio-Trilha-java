package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstance();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstance();
    System.out.println(eager);

    SingletonLazyHolder lzHolder = SingletonLazyHolder.getInstance();
        System.out.println(lzHolder);
        }
    }
