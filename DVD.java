public class DVD {
    private String titulo;
    private String descricao;
    private Genero genero;
    private LocalDate dataLancamento;
    private int classificacao;
    private boolean emprestado;
    private Emprestimo emprestimoAtual;

    public DVD(String titulo, String descricao, Genero genero, LocalDate dataLancamento, int classificacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
        this.classificacao = classificacao;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Genero getGenero() {
        return genero;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Emprestimo getEmprestimoAtual() {
        return emprestimoAtual;
    }

    public void setEmprestimoAtual(Emprestimo emprestimoAtual) {
        this.emprestimoAtual = emprestimoAtual;
    }
}