package atividades.Lista1.atividade4;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;
    private boolean ligado;

    public Carro() {
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        if (! this.ligado) {
            throw new IllegalArgumentException("Nao pode modificar velocidade com carro desligado");
        }
        if (velocidadeAtual < 0) {
            throw new IllegalArgumentException("Velocidade invalida");
        }
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        if (this.ligado) {
            throw new IllegalArgumentException("Nao pode ligar carro ligado");
        }
        this.ligado = true;
    }

    public void desligar() {
        if (! this.ligado) {
            throw new IllegalArgumentException("Nao pode desligar carro desligado");
        }
        if (this.velocidadeAtual > 0) {
            throw new IllegalArgumentException("Nao pode desligar carro em movimento");
        }
        this.ligado = false;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int quantidade) {
        if (! this.ligado) {
            throw new IllegalArgumentException("Nao pode acelerar carro desligado");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Aceleracao invalida");
        }
        this.velocidadeAtual = this.velocidadeAtual + quantidade;
    }

    public void frear(int quantidade) {
        if (! this.ligado) {
            throw new IllegalArgumentException("Nao pode frear carro desligado");
        }
        if (quantidade > this.velocidadeAtual) {
            throw new IllegalArgumentException("Nao pode frear alem da velocidade atual");
        }
        this.velocidadeAtual = this.velocidadeAtual - quantidade;
    }


}