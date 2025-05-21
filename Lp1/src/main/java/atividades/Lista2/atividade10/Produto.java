package atividades.Lista2.atividade10;

//5.Classe Produto:
//Atributos: nome, preco, quantidade_estoque, categoria
//Métodos: adicionar_estoque, remover_estoque, aplicar_desconto
//•	adicionar_estoque(quantidade): Adiciona quantidade ao quantidade_estoque.
//•	remover_estoque(quantidade): Remove quantidade do quantidade_estoque, se houver quantidade suficiente.
//•	aplicar_desconto(percentual): Aplica um desconto de percentual ao preco do produto.

public class Produto {
    private String nome;
    private float preco;
    private int quantidadeEstoque;
    private String categoria;

    public Produto(String nome, float preco, int quantidadeEstoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco(){
        return this.preco;
    }
    public void setPreco(float preco){
        if(preco<0.00f)
            throw new IllegalArgumentException("Preço invalido");
        this.preco = preco;
    }
    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque){
        if(quantidadeEstoque<0)
            throw new IllegalArgumentException("Quantidade de estoque invalido");
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void adicionarEstoque(int quantidade){
        if(quantidade<0)
            throw new IllegalArgumentException("Quantidade invalido");
        this.quantidadeEstoque += quantidade;
    }
    public void removerEstoque(int quantidade){
        if(quantidade<0)
            throw new IllegalArgumentException("Quantidade invalido");
        if (this.quantidadeEstoque < quantidade)
            throw new IllegalArgumentException("Quantidade de estoque insuficiente");
        this.quantidadeEstoque -= quantidade;
    }
    public float aplicarDesconto(float percentual){
        if(percentual < 0.00f)
            throw new IllegalArgumentException("Valor de desconto invalido");
        return this.preco - (this.preco*(percentual/100.0f));
    }
}
