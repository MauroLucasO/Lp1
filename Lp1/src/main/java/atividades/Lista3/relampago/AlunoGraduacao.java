package atividades.Lista3.relampago;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome) {
        super(nome);
    }

    public float obterLimiteAprovacao() {
        return 7.0f;
    }
}