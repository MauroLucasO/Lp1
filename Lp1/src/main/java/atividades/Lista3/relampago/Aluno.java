package atividades.Lista3.relampago;

public abstract class Aluno extends Pessoa {

    private int matricula;
    private float nota1;
    private float nota2;

    public Aluno(String nome) {
        super(nome);
        this.nota1 = 0.0f;
        this.nota2 = 0.0f;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return this.nota1;
    }

    public void setNota1(float nota1) {
        if ((nota1 < 0.0f) || (nota1 > 10.0f)) {
            throw new IllegalArgumentException("Nota 1 invalida");
        }
        this.nota1 = nota1;
    }

    public float getNota2() {
        return this.nota2;
    }

    public void setNota2(float nota2) {
        if ((nota2 < 0.0f) || (nota2 > 10.0f)) {
            throw new IllegalArgumentException("Nota 2 invalida");
        }
        this.nota2 = nota2;
    }

    public float calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public abstract float obterLimiteAprovacao();

    public boolean calcularAprovacao() {
        if (this.calcularMedia() >= this.obterLimiteAprovacao()) {
            return true;
        }
        else {
            return false;
        }
    }

    public String obterDados() {
        return "Nome: " + this.getNome() + " - Matricula: " + this.matricula + " - Aprovacao: " + this.calcularAprovacao();
    }
}