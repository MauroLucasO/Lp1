//3.Classe Livro:
//Atributos: titulo, autor, ano_publicacao, numero_paginas, genero
//Métodos: abrir, fechar, marcar_pagina, avancar_pagina, retroceder_pagina
//•	abrir(): Exibe uma mensagem indicando que o livro foi aberto.
//•	fechar(): Exibe uma mensagem indicando que o livro foi fechado.
//•	marcar_pagina(pagina): Marca a página atual do livro.
//•	avancar_pagina(): Avança uma página, se não estiver na última página.
//•	retroceder_pagina(): Retrocede uma página, se não estiver na primeira página.

package atividades.Lista2.atividade8;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private String genero;
    private int paginaAtual;
    private boolean estadoLivro;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String genero, int paginaAtual, boolean estadoLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.paginaAtual = paginaAtual;
        this.estadoLivro = estadoLivro;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao < 1)
            throw new IllegalArgumentException("Ano de publicacao invalido");
        this.anoPublicacao = anoPublicacao;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas < 1)
            throw new IllegalArgumentException("Numero de pagina invalida");
        this.numeroPaginas = numeroPaginas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(int paginaAtual) {
        if(!estadoLivro)
            throw new IllegalArgumentException("Livro fechado impossivel marcar");
        if(!verificaPagina(paginaAtual))
            throw new IllegalArgumentException("Pagina atual invalida");
        this.paginaAtual = paginaAtual;
    }
    public boolean isEstadoLivro() {
        return estadoLivro;
    }
    public void setEstadoLivro(boolean estadoLivro) {
        this.estadoLivro = estadoLivro;
    }
    public boolean verificaPagina(int valor){
        if(valor > 0 && valor <= this.numeroPaginas)
            return true;
        return false;
    }
    public String abrir(){
        this.estadoLivro = true;
        return "Livro Aberto";
    }
    public String fechar(){
        this.estadoLivro = false;
        return "Livro Fechado";
    }
    public void marcarPagina(int pagina) {
        if(!estadoLivro)
            throw new IllegalArgumentException("Livro fechado impossivel marcar pagina");
        if (!verificaPagina(pagina))
            throw new IllegalArgumentException("Pagina inexistente para marcar");
        this.paginaAtual = pagina;
    }
    public void avancarPagina() {
        if(!estadoLivro)
            throw new IllegalArgumentException("Livro fechado impossivel avancar pagina");
        if(this.paginaAtual == numeroPaginas)
            throw new IllegalArgumentException("Esta e a última página, nao pode avancar");
        this.paginaAtual++;
    }
    public void retrocederPagina() {
        if(!estadoLivro)
            throw new IllegalArgumentException("Livro fechado impossivel retroceder pagina");
        if(this.paginaAtual == 1)
            throw new IllegalArgumentException("Esta e a primeira página, nao pode retroceder");
        this.paginaAtual--;
    }
}