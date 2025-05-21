package atividade10;

import atividades.Lista2.atividade10.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto("Nome A", 0.00f, 0, "Categoria A");
    }
    @Test
    public void deveTestarExcecaoPrecoNegativo(){
        try{
            produto.setPreco(-0.01f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Preço invalido", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoEstoqueNegativo(){
        try{
            produto.setQuantidadeEstoque(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Quantidade de estoque invalido", e.getMessage());
        }
    }
    @Test
    public void deveAdicionarEstoque(){
        produto.setQuantidadeEstoque(1);
        produto.adicionarEstoque(10);
        assertEquals(11, produto.getQuantidadeEstoque());
    }
    @Test
    public void deveTestarExcecaoAdicionarEstoqueComQuantidadeNegativo(){
        try{
            produto.adicionarEstoque(-1);
        }
        catch(IllegalArgumentException e){
            assertEquals("Quantidade invalido", e.getMessage());
        }
    }
    @Test
    public void deveRemoverEstoque(){
        produto.setQuantidadeEstoque(10);
        produto.removerEstoque(1);
        assertEquals(9, produto.getQuantidadeEstoque());
    }
    @Test
    public void deveTestarExcecaoRemoverEstoqueComQuantidadeNegativo(){
        try{
            produto.removerEstoque(-1);
        }
        catch(IllegalArgumentException e){
            assertEquals("Quantidade invalido", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoRemoverEstoqueMenorQuantidadeSolicitada(){
        try{
            produto.setQuantidadeEstoque(10);
            produto.removerEstoque(11);
        }
        catch(IllegalArgumentException e){
            assertEquals("Quantidade de estoque insuficiente", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoPercentualNegativo(){
        try{
            produto.aplicarDesconto(-0.01f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Valor de desconto invalido", e.getMessage());
        }
    }
    @Test
    public void deveTestarAplicarDescontoPercentualValido(){
        produto.setPreco(1000.0f);
        assertEquals(900.0f, produto.aplicarDesconto(10.00f));
    }
}