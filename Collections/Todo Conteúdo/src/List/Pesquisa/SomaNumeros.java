package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeroList;


    public  SomaNumeros(){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public  int calcularSoma(){
        int soma = 0;
        for(Integer numero : numeroList)
            soma += numero;
        return  soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(15);
        numeros.adicionarNumero(02);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(99);
        numeros.adicionarNumero(244);
        numeros.adicionarNumero(-223);

        System.out.println("Números adicionados:");
        numeros.exibirNumeros();

        System.out.println("Soma dos números = " + numeros.calcularSoma());

        System.out.println("Maior número = " + numeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + numeros.encontrarMenorNumero());
    }


}
