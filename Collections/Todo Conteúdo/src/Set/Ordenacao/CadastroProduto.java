package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributo

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome,preco,quantidade));
    }

    public  Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return  produtosPorNome;
    }

    public  Set<Produto>  exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto produto = new CadastroProduto();

        produto.adicionarProduto(1L,"Produto 5", 20D, 5);
        produto.adicionarProduto(2L, "Notebook", 1500d, 5);
        produto.adicionarProduto(3L, "Mouse", 30d, 20);
        produto.adicionarProduto(4L, "Teclado", 50d, 15);


        System.out.println(produto.produtoSet);
        System.out.println(produto.exibirProdutosPorNome());
        System.out.println(produto.exibirProdutosPorPreco());

    }

}
