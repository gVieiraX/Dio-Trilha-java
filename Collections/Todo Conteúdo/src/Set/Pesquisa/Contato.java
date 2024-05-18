package Set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int number;

    public Contato(String nome, int number) {
        this.nome = nome;
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return number == contato.number && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "{"+ nome + " , " + number + "}";

    }
}
