package atividade3;

import atividades.Lista1.atividade3.ContaDeLuz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaDeLuzTest {

    ContaDeLuz conta;

    @BeforeEach
    public void setUp() {
        conta = new ContaDeLuz();
    }

    @Test
    public void deveCalcularValorBase() {
        conta.setQuilowattsConsumidos(100);
        assertEquals(12.0f, conta.calcularValorBase());
    }

    @Test
    public void deveCalcularValorComICMS() {
        conta.setQuilowattsConsumidos(100);
        // Base = 100 * 0.12 = 12.0
        // ICMS = 18% de 12.0 = 2.16
        // Total = 14.16
        assertEquals(14.16f, conta.calcularValorComICMS(), 0.01f); // com margem de erro por float
    }

    @Test
    public void deveTestarQuilowattsNegativo() {
        try {
            conta.setQuilowattsConsumidos(-10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de quilowatts inválida", e.getMessage());
        }
    }
}
