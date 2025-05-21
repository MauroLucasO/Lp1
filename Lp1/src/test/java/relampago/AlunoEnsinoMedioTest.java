package relampago;

import atividades.Lista3.relampago.AlunoEnsinoMedio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {

    @Test
    void deveAprovarAluno() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio("Ana");
        aluno.setNota1(6.0f);
        aluno.setNota2(6.0f);
        assertTrue(aluno.calcularAprovacao());
    }

    @Test
    void deveReprovarAluno() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio("Ana");
        aluno.setNota1(5.9f);
        aluno.setNota2(6.0f);
        assertFalse(aluno.calcularAprovacao());
    }

}