package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public  void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite ){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }


    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        convidados.adicionarConvidado("Gabriel", 124);
        convidados.adicionarConvidado("Gustavo", 442);
        convidados.adicionarConvidado("Pedro", 442);
        convidados.adicionarConvidado("Maria", 125);

        System.out.println("Existem " + convidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        convidados.removerConvidadoPorCodigoConvite(124);

        convidados.exibirConvidados();

        System.out.println("Existem " + convidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");


    }
}
