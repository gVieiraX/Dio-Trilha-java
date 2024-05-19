package Map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livros.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        for(Map.Entry<String,Livro> entry :  livros.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover){
            livros.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosOrdernarPreco = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosOrdernarPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdernadosPreco = new LinkedHashMap<>();
        for(Map.Entry<String,Livro> entry : livrosOrdernarPreco){
            livrosOrdernadosPreco.put(entry.getKey(),entry.getValue());
        }
        return  livrosOrdernadosPreco;
    }
    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }


    public Map<String, Livro> pesquisarLivrosPorAutor(){
        List<Map.Entry<String, Livro>> livrosOrdenarAutor = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosOrdenarAutor, new ComparatorPorAutor());

        Map<String,Livro> livrosOrdenadosAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livrosOrdenarAutor){
            livrosOrdenadosAutor.put(entry.getKey(),entry.getValue());
        }
        return  livrosOrdenadosAutor;
    }

    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if(!livros.isEmpty()){
            for(Livro livro : livros.values()){
                if (livro.getPreco()>precoMaisAlto){
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else{
            throw  new RuntimeException("Não nenhum livro.");
        }
        for (Map.Entry<String,Livro>entry : livros.entrySet()){
            if(entry.getValue().getPreco() == precoMaisAlto){
                Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> exibirLivroMaisBarato(){
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBarato = Double.MAX_VALUE;

        if(!livros.isEmpty()){
            for(Livro livro : livros.values()) {
                if (livro.getPreco() < precoMaisBarato) {
                    precoMaisBarato = livro.getPreco();
                }
            }
            } else {
                throw new RuntimeException("Não nenhum livro.");
            }
            for (Map.Entry<String,Livro> entry : livros.entrySet()){
                if (entry.getValue().getPreco() == precoMaisBarato) {
                    Livro livroComPrecoMaisBarato = livros.get(entry.getKey());
                    livrosMaisBaratos.add(livroComPrecoMaisBarato);
                }
        }
            return  livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livros = new LivrariaOnline();

        // Adiciona os livros à livraria online
        livros.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livros.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livros.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livros.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livros.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livros.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livros.exibirLivrosOrdenadosPorAutor());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livros.pesquisarLivrosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livros.pesquisarLivrosPorAutor();

        System.out.println("Livro mais caro: " + livros.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livros.exibirLivroMaisBarato());

        livros.removerLivro("1984");
        System.out.println(livros.livros);
    }

}
