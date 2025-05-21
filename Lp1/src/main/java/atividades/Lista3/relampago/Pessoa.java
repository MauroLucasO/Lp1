package atividades.Lista3.relampago;

public abstract class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome.trim();
    }

    public abstract String obterDados();
}