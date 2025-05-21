package atividade5;

import atividades.Lista1.atividade5.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa imc;

    @BeforeEach
    public void setUp() {
        imc = new Pessoa();
    }

    @Test
    public void deveCalcularImcCorretamente() {
        imc.setPeso(60);
        imc.setAltura(1.65f);
        imc.setSexo("F");
        assertEquals(22.04f, imc.calcularImc(), 0.01f);
    }

    @Test
    public void deveClassificarCorretamenteSexoFeminino() {
        imc.setPeso(60);
        imc.setAltura(1.65f);
        imc.setSexo("F");
        assertEquals("No peso normal", imc.classificarImc());
    }

    @Test
    public void deveClassificarCorretamenteSexoMasculino() {
        imc.setPeso(80);
        imc.setAltura(1.80f);
        imc.setSexo("M");
        assertEquals("No peso normal", imc.classificarImc());
    }

    @Test
    public void deveLancarExcecaoParaPesoInvalido() {
        try {
            imc.setPeso(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido. Deve ser maior que zero.", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoParaAlturaInvalida() {
        try {
            imc.setAltura(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura inválida. Deve ser maior que zero.", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoParaSexoInvalido() {
        try {
            imc.setSexo("X");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo inválido. Use 'M' (masculino) ou 'F' (feminino).", e.getMessage());
        }
    }
}
