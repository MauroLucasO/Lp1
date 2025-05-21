package atividades.Lista2.atividade9;

//4.Classe Pessoa:
//Atributos: nome, idade, altura, peso
//Métodos: envelhecer, crescer, ganhar_peso, perder_peso
//•	envelhecer(): Aumenta a idade da pessoa em um ano.
//•	Crescer( entímetros): Aumenta a altura da pessoa em  centímetros, se a pessoa tiver menos de 21 anos.
//•	Ganhar_peso(quilos): Aumenta o peso da pessoa em quilos.
//•	Perder_peso(quilos): Diminui o peso da pessoa em quilos.

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public Pessoa(String nome, int idade, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("Idade invalida");
        }
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        if(altura < 0){
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        if(peso < 0){
            throw new IllegalArgumentException("Peso invalida");
        }
        this.peso = peso;
    }
    public void envelhecer(){
        this.idade++;
    }
    public void crescer(float centimetro){
        if(centimetro < 0)
            throw new IllegalArgumentException("Centimetro invalida");
        if(this.idade < 21)
            this.altura = this.altura +centimetro;
    }
    public void ganhaPeso(float quilos){
        if(quilos < 0)
            throw new IllegalArgumentException("Peso invalido para ganho");
        this.peso = this.peso + quilos;
    }
    public void perdePeso(float quilos){
        if(quilos < 0)
            throw new IllegalArgumentException("Peso invalido para perda");
        this.peso = this.peso - quilos;
    }

}