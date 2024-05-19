package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item>itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item>  itemParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valorT = 0d;
        if(!itemList.isEmpty()){
            for (Item item : itemList){
                double valorI = item.getPreco()* item.getQuantidade();
                valorT += valorI;
            }
            return  valorT;
        } else{
            throw  new RuntimeException(" A lista está vazia.");
        }
    }

    public void exibirItens(){
        System.out.println(itemList);
    }


    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }


}
