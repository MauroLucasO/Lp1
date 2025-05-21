package relampago;

import atividades.Lista3.relampago.Pessoa;
import atividades.Lista3.relampago.Professor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRegistrarNome() {
        Pessoa pessoa = new Professor("Ana");
        assertEquals("Ana", pessoa.getNome());
    }

    @Test
    void deveRegistrarNomeTirandoEspacos() {
        Pessoa pessoa = new Professor(" Ana ");
        assertEquals("Ana", pessoa.getNome());
    }

    @Test
    void deveLancarExcecaoNomeNulo() {
        try {
            Pessoa pessoa = new Professor("Ana");
            pessoa.setNome("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeNuloConstrutor() {
        try {
            Pessoa pessoa = new Professor("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        try {
            Pessoa pessoa = new Professor(" ");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }


}