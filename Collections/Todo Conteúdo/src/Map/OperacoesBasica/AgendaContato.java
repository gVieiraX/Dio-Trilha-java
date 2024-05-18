package Map.OperacoesBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public  void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato contato = new AgendaContato();

        // Adicionar contatos
        contato.adicionarContato("Camila", 123456);
        contato.adicionarContato("João", 1111111);
        contato.adicionarContato("Carlos", 1111111);
        contato.adicionarContato("Ana", 654987);
        contato.adicionarContato("Maria", 1111111);
        contato.adicionarContato("Camila", 44444);

        contato.exibirContatos();

        contato.removerContato("Carlos");
        contato.exibirContatos();
        System.out.println(contato.pesquisarPorNome("Maria"));

        System.out.println("O número é " + contato.pesquisarPorNome("Ana"));

    }

}
