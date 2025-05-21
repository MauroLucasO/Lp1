//1.Classe Carro:
//Atributos: marca, modelo, ano, velocidade_atual, estado
//Métodos: acelerar, frear, ligar, desligar
//•	acelerar(quantidade): aumenta a velocidade atual do carro pela quantidade especificada.
//•	frear(quantidade): diminui a velocidade atual do carro pela quantidade especificada, sem
// deixar que a velocidade fique negativa.
//•	ligar(): altera o estado do carro para ligado.
//•	desligar(): altera o estado do carro para desligado e zera a velocidade atual.

package atividades.Lista2.atividade6;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;
    private boolean motorLigado;

    public Carro(String marca, String modelo, int ano, float velocidadeAtual, boolean motorLigado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
        this.motorLigado = motorLigado;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public boolean isMotorLigado() {
        return motorLigado;
    }
    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }
    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(float velocidadeAtual){
        if(!isMotorLigado())
            throw new IllegalArgumentException("Motor desligado");
        if(velocidadeAtual < 0f)
            throw new IllegalArgumentException("Velocidade invalida");
        this.velocidadeAtual = velocidadeAtual;
    }
    public void ligar(){
        if(isMotorLigado())
            throw new IllegalArgumentException("Motor já está ligado");
        this.setMotorLigado(true);
    }
    public void desligar(){
        if(!isMotorLigado())
            throw new IllegalArgumentException("Motor já está desligado");
        this.motorLigado = false;
        this.velocidadeAtual = 0f;
    }
    public void acelerar(float quantidadeEspecificada){
        if(!isMotorLigado())
            throw new IllegalArgumentException("Carro esta desligado, nao pode acelerar");
        if (quantidadeEspecificada < 0f)
            throw new IllegalArgumentException("Nao pode acelerar quantidade invalida");
        this.velocidadeAtual = this.velocidadeAtual + quantidadeEspecificada;
    }
    public void frear(float quantidadeEspecificada) {
        if(!isMotorLigado())
            throw new IllegalArgumentException("Carro esta desligado, nao pode frear");
        if (quantidadeEspecificada < 0f)
            throw new IllegalArgumentException("Nao pode frear quantidade invalida");
        if (quantidadeEspecificada > this.velocidadeAtual)
            throw new IllegalArgumentException("Nao pode frear alem da velocidade atual");
        this.velocidadeAtual = this.velocidadeAtual - quantidadeEspecificada;
    }
}