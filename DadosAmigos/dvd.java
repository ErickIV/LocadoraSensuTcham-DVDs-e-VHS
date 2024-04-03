public class DVD {
    private String titulo;
    private String genero;
    private String descricao;
    private String artistaPrincipal;
    private String diretor;
    private String sinopse;
    private int classificacaoEtaria;

    public DVD(String titulo, String genero, String descricao, String artistaPrincipal, String diretor, String sinopse, int classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.descricao = descricao;
        this.artistaPrincipal = artistaPrincipal;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + gener
    }
