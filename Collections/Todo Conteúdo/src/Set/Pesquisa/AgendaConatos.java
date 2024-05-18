package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaConatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaConatos() {
        this.contatoSet = new HashSet<>();
    }


    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome,numero));
    }

    public  void exibirContatos() {
        System.out.println(contatoSet);
    }

    public  Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoesPorNomes = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoesPorNomes.add(c);
            }
        }
        return  contatoesPorNomes;
    }

    public  Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumber(novoNumero);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaConatos contato = new AgendaConatos();

        contato.adicionarContato("Biel", 3344);
        contato.adicionarContato("Pedro", 777);
        contato.adicionarContato("Biel", 55);
        contato.adicionarContato("Lu", 3362);

        contato.exibirContatos();
        System.out.println(contato.pesquisarPorNome("Lu"));
        contato.atualizarNumeroContato("Lu", 533);
        contato.exibirContatos();


    }

}
