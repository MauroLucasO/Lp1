package relampago;


import atividades.Lista3.relampago.AlunoGraduacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    @Test
    void deveAprovarAluno() {
        AlunoGraduacao aluno = new AlunoGraduacao("Ana");
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        assertTrue(aluno.calcularAprovacao());
    }

    @Test
    void deveReprovarAluno() {
        AlunoGraduacao aluno = new AlunoGraduacao("Ana");
        aluno.setNota1(6.9f);
        aluno.setNota2(7.0f);
        assertFalse(aluno.calcularAprovacao());
    }

    @Test
    void deveRetornarDadosAluno() {
        AlunoGraduacao aluno = new AlunoGraduacao("Joao");
        aluno.setMatricula(123);
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        assertEquals("Nome: Joao - Matricula: 123 - Aprovacao: " + aluno.calcularAprovacao(), aluno.obterDados());
    }

}