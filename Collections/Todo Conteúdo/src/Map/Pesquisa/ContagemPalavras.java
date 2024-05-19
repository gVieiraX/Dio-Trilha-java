package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public int exibirContagemPalavras(){
        int contTotal = 0;
        for(int contatem : palavras.values()){
            contTotal += contatem;
        }
        return contTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : palavras.entrySet()){
            if(entry.getValue()> maiorContagem){
                maiorContagem = entry.getValue();
                palavraFrequente = entry.getKey();
            }
        }
        return palavraFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contPalavras = new ContagemPalavras();

        contPalavras.adicionarPalavra("Java", 2);
        contPalavras.adicionarPalavra("Python", 8);
        contPalavras.adicionarPalavra("JavaScript", 1);
        contPalavras.adicionarPalavra("C#", 6);

        System.out.println("Existem " + contPalavras.exibirContagemPalavras() + " palavras.");

        String linguagemMaisFrequente = contPalavras.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}



//adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
// removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
// exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
// encontrarPalavraMaisFrequente()