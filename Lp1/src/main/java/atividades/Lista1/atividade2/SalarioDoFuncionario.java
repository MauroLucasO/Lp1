package atividades.Lista1.atividade2;

public class SalarioDoFuncionario {

    private float salarioBruto;
    private float valorHoraExtra;
    private int numeroHorasExtras;

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if (salarioBruto < 0) {
            throw new IllegalArgumentException("Salário bruto inválido");
        }
        this.salarioBruto = salarioBruto;
    }

    public float getValorHoraExtra() {
        return this.valorHoraExtra;
    }

    public void setValorHoraExtra(float valorHoraExtra) {
        if (valorHoraExtra < 0) {
            throw new IllegalArgumentException("Valor da hora extra inválido");
        }
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getNumeroHorasExtras() {
        return this.numeroHorasExtras;
    }

    public void setNumeroHorasExtras(int numeroHorasExtras) {
        if (numeroHorasExtras < 0) {
            throw new IllegalArgumentException("Número de horas extras inválido");
        }
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public float calcularSalarioLiquido() {
        float totalHorasExtras = this.valorHoraExtra * this.numeroHorasExtras;
        float salarioTotal = this.salarioBruto + totalHorasExtras;
        float descontoINSS = salarioTotal * 0.08f;
        return salarioTotal - descontoINSS;
    }
}
