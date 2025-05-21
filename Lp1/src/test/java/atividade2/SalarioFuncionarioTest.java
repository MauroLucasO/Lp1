package atividade2;

import atividades.Lista1.atividade2.SalarioDoFuncionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalarioFuncionarioTest {

    SalarioDoFuncionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new SalarioDoFuncionario();
    }

    @Test
    public void deveCalcularSalarioLiquidoComHorasExtras() {
        funcionario.setSalarioBruto(3000);
        funcionario.setValorHoraExtra(50);
        funcionario.setNumeroHorasExtras(10);

        /* Total = 3000 + (50 * 10) = 3500
         Desconto INSS = 8% de 3500 = 280
         Líquido = 3500 - 280 = 3220 */

        assertEquals(3220, funcionario.calcularSalarioLiquido());
    }

    @Test
    public void deveCalcularSalarioLiquidoSemHorasExtras() {
        funcionario.setSalarioBruto(2500);
        funcionario.setValorHoraExtra(0);
        funcionario.setNumeroHorasExtras(0);
        /* Total = 2500
        // Desconto INSS = 8% de 2500 = 200
         Líquido = 2300 */

        assertEquals(2300, funcionario.calcularSalarioLiquido());
    }

    @Test
    public void deveTestarSalarioBrutoNegativo() {
        try {
            funcionario.setSalarioBruto(-1000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário bruto inválido", e.getMessage());
        }
    }

    @Test
    public void deveTestarValorHoraExtraNegativo() {
        try {
            funcionario.setValorHoraExtra(-10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor da hora extra inválido", e.getMessage());
        }
    }

    @Test
    public void deveTestarNumeroHorasExtrasNegativo() {
        try {
            funcionario.setNumeroHorasExtras(-2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de horas extras inválido", e.getMessage());
        }
    }
}
