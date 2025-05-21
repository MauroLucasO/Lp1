package atividades.Lista1.atividade1;

public class Funcionario {

    private String nome;
    private float salarioAtual;
    private float porcentagemAumento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioAtual() {
        return this.salarioAtual;
    }

    public void setSalarioAtual(float salarioAtual) {
        if (salarioAtual < 0) {
            throw new IllegalArgumentException("Salário inválido");
        }
        this.salarioAtual = salarioAtual;
    }

    public float getPorcentagemAumento() {
        return this.porcentagemAumento;
    }

    public void setPorcentagemAumento(float porcentagemAumento) {
        if (porcentagemAumento < 0) {
            throw new IllegalArgumentException("Porcentagem de aumento inválida");
        }
        this.porcentagemAumento = porcentagemAumento;
    }

    public float calcularAumento() {
        return (this.salarioAtual * this.porcentagemAumento) / 100;
    }

    public float novoSalario() {
        return this.salarioAtual + calcularAumento();
    }
}
