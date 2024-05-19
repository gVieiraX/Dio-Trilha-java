package List.Ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numberList;

    public OrdenacaoNumeros() {
        this.numberList = new ArrayList<>();
    }

    public  void adicionarNumero(int numero){
        this.numberList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAsc = new ArrayList<>(this.numberList);
        if(!numberList.isEmpty()){
            Collections.sort(numerosAsc);
            return  numerosAsc;
        }else{
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDesc = new ArrayList<>(this.numberList);
        if(!numberList.isEmpty()){
            numerosDesc.sort(Collections.reverseOrder());
            return  numerosDesc;
        } else {
            throw new RuntimeException("A lista está vazia!");

        }
    }

    public void exibirNumeros(){
        if (!numberList.isEmpty()){
            System.out.println(this.numberList);
        }else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numero = new OrdenacaoNumeros();

        numero.adicionarNumero(2);
        numero.adicionarNumero(5);
        numero.adicionarNumero(4);
        numero.adicionarNumero(1);
        numero.adicionarNumero(99);

        numero.exibirNumeros();

        System.out.println(numero.ordenarAscendente());

        System.out.println(numero.ordenarDescendente());

    }

}
