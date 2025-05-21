package atividade7;

import atividades.Lista2.atividade7.ContaBancaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    ContaBancaria conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaBancaria("Titular A", 0, 0f);
    }
    @Test
    public void deveTestarExcecaoNumeroContaNegativo(){
        try {
            conta.setNumeroConta(-1);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Numero da conta invalido", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoSaldoNegativo(){
        try {
            conta.setSaldo(-0.01f);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Saldo negativo invalido", e.getMessage());
        }
    }
    @Test
    public void deveTestarVerificarSaldo(){
        conta.setSaldo(150f);
        assertEquals(150f, conta.getSaldo());
    }
    @Test
    public void deveDepositarValor(){
        conta.depositar(150f);
        assertEquals(150f, conta.getSaldo());
    }
    @Test
    public void deveTestarExcecaoDepositarValorNegativo(){
        try{
            conta.depositar(-0.01f);
        }
        catch(IllegalArgumentException e) {
            assertEquals("Valor negativo para deposito não permitido", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoSacarValorMaiorQueSaldo(){
        conta.setSaldo(250f);
        try {
            conta.sacar(251f);
            fail();
        }
        catch(IllegalArgumentException e) {
            assertEquals("Saldo Insuficiente", e.getMessage());
        }
    }
    @Test
    public void deveSacarValor(){
        conta.setSaldo(200f);
        conta.sacar(150f);
        assertEquals(50f, conta.getSaldo());
    }
    @Test
    public void deveTestarExcecaoSacarValorNegativo(){
        try{
            conta.sacar(-0.01f);
        }
        catch(IllegalArgumentException e) {
            assertEquals("Valor negativo para saque não permitido", e.getMessage());
        }
    }

}