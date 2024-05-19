package Set.Ordenacao;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class GerenciadorAlunos {

    private  Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula){
        Alunos alunosParaRemover = null;
        if(!alunosSet.isEmpty()){
            for(Alunos a:alunosSet){
                if(a.getMatricula() == matricula){
                    alunosParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunosParaRemover);
        }else{
            throw new RuntimeException("O conjunto está vazio");
        }
        if(alunosParaRemover == null){
            System.out.println("Matríula não encontrada.");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()){
            System.out.println(alunosPorNome);
            }else{
            System.out.println("O conjunto está vazio.");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorNota());
            if(!alunosSet.isEmpty()){
                alunosPorNota.addAll(alunosSet);
                System.out.println(alunosPorNota);
            }else{
                System.out.println("O conjunto está vazio.");
            }
        }

        public void exibirAlunos(){
            System.out.println(alunosSet);
        }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);

        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
