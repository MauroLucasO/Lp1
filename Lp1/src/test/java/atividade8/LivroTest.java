package atividade8;

import atividades.Lista2.atividade8.Livro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    Livro livro;

    @BeforeEach
    public void setUp() {
        livro = new Livro("Titulo A", "Autor A", 1, 1, "Genero A",1, true);
    }
    @Test
    public void deveTestarExcecaoAnoPublicacaoInvalido() {
        try{
            livro.setAnoPublicacao(0);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Ano de publicacao invalido", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoNumeroPaginaInvalido() {
        try{
            livro.setNumeroPaginas(0);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Numero de pagina invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoColocarPaginaAtualComLivroFechado() {
        try{
            livro.fechar();
            livro.setPaginaAtual(2);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Livro fechado impossivel marcar", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoPaginaAtualInvalidoAbaixoUm() {
        try{
            livro.setPaginaAtual(0);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Pagina atual invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoPaginaAtualInvalidoAcimaNumeroPaginas() {
        try{
            livro.setPaginaAtual(2);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Pagina atual invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarColocarPaginaAtualValido() {
        livro.setNumeroPaginas(5);
        livro.setPaginaAtual(3);
        assertEquals(3, livro.getPaginaAtual());
    }
    @Test
    public void deveExibirMensagemLivroAberto(){
        assertEquals("Livro Aberto", livro.abrir());
    }
    @Test
    public void deveTrocarEstadoLivroQuandoAberto(){
        livro.fechar();
        livro.abrir();
        assertEquals(true, livro.isEstadoLivro());
    }
    @Test
    public void deveExibirMensagemLivroFechado(){
        assertEquals("Livro Fechado", livro.fechar());
    }
    @Test
    public void deveTrocarEstadoQuandoLivroFechado(){
        livro.fechar();
        assertEquals(false, livro.isEstadoLivro());
    }
    @Test
    public void deveTestarExcecaoMarcarPaginaAtualComLivroFechado() {
        try{
            livro.fechar();
            livro.marcarPagina(2);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Livro fechado impossivel marcar pagina", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoMarcarPaginaAtualInexistenteAcimaNumeropaginas() {
        try{
            livro.marcarPagina(2);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Pagina inexistente para marcar", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoMarcarPaginaAtualInexistenteAbaixoUm() {
        try{
            livro.marcarPagina(0);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Pagina inexistente para marcar", e.getMessage());
        }
    }
    @Test
    public void deveTestarMarcarPaginaAtualExistente() {
        livro.setNumeroPaginas(100);
        livro.marcarPagina(5);
        assertEquals(5,livro.getPaginaAtual());
    }
    @Test
    public void deveTestarExcecaoAvancarPaginaAtualComLivroFechado() {
        try{
            livro.fechar();
            livro.avancarPagina();
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Livro fechado impossivel avancar pagina", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoAvancarUltimaPaginaAtual() {
        try{
            livro.avancarPagina();
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Esta e a última página, nao pode avancar", e.getMessage());
        }
    }
    @Test
    public void deveTestarAvancarPaginaAtual() {
        livro.setNumeroPaginas(100);
        livro.setPaginaAtual(99);
        livro.avancarPagina();
        assertEquals(100,livro.getPaginaAtual());
    }
    @Test
    public void deveTestarExcecaoRetrocederPaginaAtualComLivroFechado() {
        try{
            livro.fechar();
            livro.retrocederPagina();
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Livro fechado impossivel retroceder pagina", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoRetrocederPrimeiraPaginaAtual() {
        try{
            livro.retrocederPagina();
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Esta e a primeira página, nao pode retroceder", e.getMessage());
        }
    }
    @Test
    public void deveTestarRetrocederPaginaAtual() {
        livro.setNumeroPaginas(100);
        livro.setPaginaAtual(2);
        livro.retrocederPagina();
        assertEquals(1,livro.getPaginaAtual());
    }
}