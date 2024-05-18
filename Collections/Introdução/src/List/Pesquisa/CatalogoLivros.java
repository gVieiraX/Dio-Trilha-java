package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo

    private List<Livro>livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public  void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return  livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return  livrosPorIntervaloAno;
    }

    public Livro  pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return  livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Livro 1","Autor 1", 2021);
        livros.adicionarLivro("Livro 1","Autor 2", 2020);
        livros.adicionarLivro("Livro 3","Autor 2", 2022);
        livros.adicionarLivro("Livro 4","Autor 4", 2023);
        livros.adicionarLivro("Livro 5","Autor 5", 1994);

        System.out.println(livros.pesquisarPorAutor("Autor 2"));
        System.out.println(livros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(livros.pesquisarPorTitulo("Livro 1"));

    }

}
