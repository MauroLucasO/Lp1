//2.Classe ContaBancaria:
//Atributos: titular, numero_conta, saldo
//Métodos: depositar, sacar
//•	depositar(valor): adiciona o valor ao saldo da conta.
//•	sacar(valor): subtrai o valor do saldo da conta, se houver saldo suficiente.

package atividades.Lista2.atividade7;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private float saldo;

    public ContaBancaria(String titular, int numeroConta, float saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        if(numeroConta<0)
            throw new IllegalArgumentException("Numero da conta invalido");
        this.numeroConta = numeroConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        if(saldo<0f)
            throw new IllegalArgumentException("Saldo negativo invalido");
        this.saldo = saldo;
    }
    public void depositar(float valor){
        if(valor<0f)
            throw new IllegalArgumentException("Valor negativo para deposito não permitido");
        this.saldo = this.saldo + valor;
    }
    public void sacar(float valor){
        if(valor<0f)
            throw new IllegalArgumentException("Valor negativo para saque não permitido");
        if (valor > saldo)
            throw new IllegalArgumentException("Saldo Insuficiente");
        this.saldo = this.saldo - valor;
    }
}