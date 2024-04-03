public class Amigo {
    private long telefone;
    private String nome;
    private LocalDate dataNascimento;

    public Amigo(String nome, long telefone, LocalDate dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}