package atividade1;

import atividades.Lista1.atividade1.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    @Test
    public void deveCalcularAumento() {
        funcionario.setNome("Pedro");
        funcionario.setSalarioAtual(2000);
        funcionario.setPorcentagemAumento(10);
        assertEquals(200, funcionario.calcularAumento());
    }

    @Test
    public void deveCalcularNovoSalario() {
        funcionario.setSalarioAtual(3000);
        funcionario.setPorcentagemAumento(15);
        assertEquals(3450, funcionario.novoSalario());
    }

    @Test
    public void deveTestarSalarioNegativo() {
        try {
            funcionario.setSalarioAtual(-1000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário inválido", e.getMessage());
        }
    }

    @Test
    public void deveTestarPorcentagemNegativa() {
        try {
            funcionario.setPorcentagemAumento(-5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Porcentagem de aumento inválida", e.getMessage());
        }
    }
}
