package Map.Ordenacao;

public class Evento {
    private String nome;
    private  String nomeAtracao;

    public Evento(String nome, String nomeAtracao) {
        this.nome = nome;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return nome + " , " +  nomeAtracao;

    }
}
