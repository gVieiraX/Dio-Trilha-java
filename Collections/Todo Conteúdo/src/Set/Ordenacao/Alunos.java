package Set.Ordenacao;


import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {
    // atributos
    private  String nome;
    private Long matricula;
    private  double media;

    public Alunos(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return Objects.equals(matricula, alunos.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return  + matricula + " " + nome + " " + media + " || ";
    }

    @Override
    public int compareTo(Alunos alunos) {
        return nome.compareTo(alunos.getNome());
    }
}

class ComparatorNota implements Comparator<Alunos>{
    @Override
    public int compare(Alunos o1, Alunos o2) {
        return Double.compare(o1.getMedia(),o2.getMedia());
    }
}


