package atividade4;

import atividades.Lista1.atividade4.Carro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveDesligarCarro() {
        Carro carro = new Carro();
        carro.ligar();
        carro.desligar();
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void deveAcelerarCarro() {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(100);
        assertEquals(100, carro.getVelocidadeAtual());
    }

    @Test
    void deveVerificarVelocidadeAtualInvalida() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.setVelocidadeAtual(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Velocidade invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAceleracaoNula() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aceleracao invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAceleracaoCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.acelerar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao pode acelerar carro desligado", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoLigarCarroLigado() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.ligar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode ligar carro ligado", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDesligarCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.desligar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao pode desligar carro desligado", e.getMessage());
        }
    }

    @Test
    void deveFrearCarro() {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(100);
        carro.frear(10);
        assertEquals(90, carro.getVelocidadeAtual());
    }

    @Test
    void deveLancarExcecaoFrearAlemVelocidadeAtual() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(100);
            carro.frear(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode frear alem da velocidade atual", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoFrearCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.frear(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao pode frear carro desligado", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoModificarVelocidadeCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.setVelocidadeAtual(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao pode modificar velocidade com carro desligado", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDesligarCarroMovimento() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(100);
            carro.desligar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode desligar carro em movimento", e.getMessage());
        }
    }

}