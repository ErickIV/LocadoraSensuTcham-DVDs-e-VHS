public class Amigo {
    private long telefone;
    private String nome;
    private static String endereco;
    private LocalDate dataNascimento;

    public Amigo(String nome, long telefone, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
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

    public static String getEndereco() {
        return endereco;
    }
}