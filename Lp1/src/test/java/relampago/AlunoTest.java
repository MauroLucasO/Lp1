package relampago;

import atividades.Lista3.relampago.Aluno;
import atividades.Lista3.relampago.AlunoGraduacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveAtribuirNota1() {
        Aluno aluno = new AlunoGraduacao("Ana");
        aluno.setNota1(0.0f);
        assertEquals(0.0f, aluno.getNota1());
    }

    @Test
    void deveLancarExcecaoNota1Negativa() {
        try {
            Aluno aluno = new AlunoGraduacao("Ana");
            aluno.setNota1(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 1 invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNota1AcimaMaximo() {
        try {
            Aluno aluno = new AlunoGraduacao("Ana");
            aluno.setNota1(10.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 1 invalida", e.getMessage());
        }
    }

    @Test
    void deveAtribuirNota2() {
        Aluno aluno = new AlunoGraduacao("Ana");
        aluno.setNota2(0.0f);
        assertEquals(0.0f, aluno.getNota2());
    }

    @Test
    void deveLancarExcecaoNota2Negativa() {
        try {
            Aluno aluno = new AlunoGraduacao("Ana");
            aluno.setNota2(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 2 invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNota2AcimaMaximo() {
        try {
            Aluno aluno = new AlunoGraduacao("Ana");
            aluno.setNota2(10.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota 2 invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularMedia() {
        Aluno aluno = new AlunoGraduacao("Ana");
        aluno.setNota1(2.0f);
        aluno.setNota2(4.0f);
        assertEquals(3.0f, aluno.calcularMedia());
    }

}