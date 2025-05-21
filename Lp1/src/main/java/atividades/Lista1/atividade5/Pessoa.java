package atividades.Lista1.atividade5;

public class Pessoa {

    private float peso;
    private float altura;
    private String sexo;

    public void setPeso(float peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido. Deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public void setAltura(float altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida. Deve ser maior que zero.");
        }
        this.altura = altura;
    }
    public void setSexo(String sexo) {
        if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
            throw new IllegalArgumentException("Sexo inválido. Use 'M' (masculino) ou 'F' (feminino).");
        }
        this.sexo = sexo.toUpperCase();
    }

    public float calcularImc() {
        return peso / (altura * altura);
    }

    public String classificarImc() {
        float imc = calcularImc();

        if (sexo.equals("F")) {
            if (imc < 19.1f) return "Abaixo do peso";
            else if (imc < 25.8f) return "No peso normal";
            else if (imc < 27.3f) return "Marginalmente acima do peso";
            else if (imc < 32.3f) return "Acima do peso ideal";
            else return "Obeso";
        } else { // sexo == "M"
            if (imc < 20.7f) return "Abaixo do peso";
            else if (imc < 26.4f) return "No peso normal";
            else if (imc < 27.8f) return "Marginalmente acima do peso";
            else if (imc < 31.1f) return "Acima do peso ideal";
            else return "Obeso";
        }
    }
}
