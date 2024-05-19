package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
        }


    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else{
            System.out.println("Tarefa não encontrada");
        }
    }

    public int contarTarefas(){
        return  tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasFeitas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isTarefaConcluida()) {
                tarefasFeitas.add(t);
            }
        }
        return tarefasFeitas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (!t.isTarefaConcluida()){
                tarefasNaoConcluidas.add(t);
            }
        }
        return  tarefasNaoConcluidas;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarC = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao));{
                tarefaParaMarcarC = t;
                break;
            }
        }
        if(tarefaParaMarcarC != null){
            if(tarefaParaMarcarC.isTarefaConcluida()){
                tarefaParaMarcarC.setTarefaConcluida(false);
            }
        }else{
            System.out.println("Tarefa não encontra na lista");
        }

    }

    public  void limparListaTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println("A lista está vazia.");
        }else{
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Estudar Java");
        tarefas.adicionarTarefa("Estudar Python");
        tarefas.adicionarTarefa("Estudar Java");
        tarefas.adicionarTarefa("Estudar Rust");
        tarefas.adicionarTarefa("Estudar POO");
        tarefas.adicionarTarefa("Estudar JavaScript");

        tarefas.exibirTarefas();

        tarefas.removerTarefa("Estudar Python");
        tarefas.exibirTarefas();

        System.out.println("Total de tarefas na lista: " + tarefas.contarTarefas());

        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.marcarTarefaConcluida("Estudar JavaScript");
        tarefas.marcarTarefaConcluida("Estudar Rust");

        System.out.println(tarefas.obterTarefasConcluidas());

        tarefas.marcarTarefaPendente("Estudar Java");
        tarefas.exibirTarefas();
        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();
    }



}
