package finaljob;

public class Contato {
    String nome;
    long telefone;
    int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato(String nome, long telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

}
