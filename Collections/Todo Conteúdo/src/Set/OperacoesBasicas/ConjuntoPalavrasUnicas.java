package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavraSet.isEmpty()){
            if(palavraSet.contains(palavra)){
                palavraSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto.");
            }
            } else{
                System.out.println("Conjunto vazio.");
            }
        }

    public boolean verificarPalavra(String palavra){
        return palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavraSet.isEmpty()){
          System.out.println(palavraSet);
        }else{
            System.out.println("Conjunto vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Java");
        palavras.adicionarPalavra("Python");
        palavras.adicionarPalavra("JavaScript");
        palavras.adicionarPalavra("Python");
        palavras.adicionarPalavra("C++");
        palavras.adicionarPalavra("Ruby");

        palavras.exibirPalavrasUnicas();

        palavras.removerPalavra("Python");
        palavras.exibirPalavrasUnicas();

        palavras.removerPalavra("Swift");

        System.out.println("A linguagem 'Rust' está no conjunto? " + palavras.verificarPalavra("Rust"));
        System.out.println("A linguagem 'Python' está no conjunto? " + palavras.verificarPalavra("Python"));

        palavras.exibirPalavrasUnicas();
    }

}



