package atividades.Lista1.atividade3;

public class ContaDeLuz {

    private int quilowattsConsumidos;

    public int getQuilowattsConsumidos() {
        return this.quilowattsConsumidos;
    }

    public void setQuilowattsConsumidos(int quilowattsConsumidos) {
        if (quilowattsConsumidos < 0) {
            throw new IllegalArgumentException("Quantidade de quilowatts inválida");
        }
        this.quilowattsConsumidos = quilowattsConsumidos;
    }
    public float calcularValorBase() {
        return this.quilowattsConsumidos * 0.12f;
    }

    public float calcularValorComICMS() {
        float valorBase = calcularValorBase();
        float icms = valorBase * 0.18f;
        return valorBase + icms;
    }
}
