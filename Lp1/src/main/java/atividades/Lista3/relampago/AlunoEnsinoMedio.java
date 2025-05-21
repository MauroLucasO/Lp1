package atividades.Lista3.relampago;

public class AlunoEnsinoMedio extends Aluno {

    public AlunoEnsinoMedio(String nome) {
        super(nome);
    }

    public float obterLimiteAprovacao() {
        return 6.0f;
    }
}