package atividade6;

import atividades.Lista2.atividade6.Carro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CarroTest {
    Carro carro;

    @BeforeEach
    public void setUp(){
        carro = new Carro("Marca A", "Modelo A", 0, 0f, true);
    }
    @Test
    public void deveTestarExcecaoAlterarVelocidadeAtualCarroDesligado(){
        try {
            carro.setMotorLigado(false);
            carro.setVelocidadeAtual(20f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Motor desligado", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoAlterarVelocidadeAtualNegativa(){
        try {
            carro.setVelocidadeAtual(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Velocidade invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarAlterarVelocidadeAtual(){
        carro.setVelocidadeAtual(20f);
        assertEquals(20f, carro.getVelocidadeAtual());
    }
    @Test
    public void deveTestarExcecaoLigarCarroLigado(){
        try{
            carro.ligar();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Motor já está ligado", e.getMessage());
        }
    }
    @Test
    public void deveTestarLigarCarro(){
        carro.setMotorLigado(false);
        carro.ligar();
        assertEquals(true, carro.isMotorLigado());
    }
    @Test
    public void deveTestarExcecaoDesligarCarroDesligado(){
        try{
            carro.setMotorLigado(false);
            carro.desligar();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Motor já está desligado", e.getMessage());
        }
    }
    @Test
    public void deveTestarDesligarCarro(){
        carro.desligar();
        assertEquals(false, carro.isMotorLigado());
    }
    @Test
    public void deveTestarDesligarCarroVelocidadeAtualZerada(){
        carro.setVelocidadeAtual(20f);
        carro.desligar();
        assertEquals(0f, carro.getVelocidadeAtual());
    }
    @Test
    public void deveTestarExcecaoAcelerarCarroDesligado(){
        try {
            carro.setMotorLigado(false);
            carro.acelerar(10f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Carro esta desligado, nao pode acelerar", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoAcelerarCarroLigadoQuantidadeNegativa(){
        try {
            carro.acelerar(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nao pode acelerar quantidade invalida", e.getMessage());
        }
    }
    @Test
    public void deveAcelerarCarro(){
        carro.setVelocidadeAtual(30f);
        carro.acelerar(50f);
        assertEquals(80f, carro.getVelocidadeAtual());
    }
    @Test
    public void deveTestarExcecaoFrearCarroDesligado(){
        try {
            carro.setMotorLigado(false);
            carro.frear(10f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Carro esta desligado, nao pode frear", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoFrearCarroLigadoQuantidadeNegativa(){
        try {
            carro.frear(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nao pode frear quantidade invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoFrearCarroLigadoQuantidadeMaiorVelocidade(){
        try {
            carro.setVelocidadeAtual(20f);
            carro.frear(40f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nao pode frear alem da velocidade atual", e.getMessage());
        }
    }
    @Test
    public void deveFrearCarro(){
        carro.setVelocidadeAtual(50f);
        carro.frear(20f);
        assertEquals(30f, carro.getVelocidadeAtual());
    }


}