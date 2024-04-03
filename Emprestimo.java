public class Emprestimo {
    private Amigo amigo;
    private DVD dvd;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Amigo amigo, DVD dvd, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.amigo = amigo;
        this.dvd = dvd;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public DVD getDVD() {
        return dvd;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}