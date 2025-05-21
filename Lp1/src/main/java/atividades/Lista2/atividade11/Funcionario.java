package atividades.Lista2.atividade11;

//6.Classe Funcionario:
//Atributos: nome, cargo, salario, departamento
//Métodos: receber_aumento, mudar_departamento, exibir_dados
//
//•	receber_aumento(percentual): Aplica um aumento de percentual ao salario.
//•	mudar_departamento(novo_departamento): Altera o departamento para o novo_departamento.
//•	exibir_dados(): Exibe os dados do funcionário, incluindo nome, cargo, salário e departamento.

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private String departamento;

    public Funcionario(String nome, String cargo, float salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        if(salario<0f){
            throw new IllegalArgumentException("Salario invalido menor que zero");
        }
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public float receberAumento(float percentual){
        if(percentual<0f){
            throw new IllegalArgumentException("Percentual invalido");
        }
        return this.salario + (this.salario*(percentual/100));
    }
    public void mudarDepartamento(String novoDepartamento){
        this.departamento = novoDepartamento;
    }
    public String exibirDados(){//ou toString
        return "Nome: "+this.getNome()+"-Cargo: "+this.getCargo()+"-Salario: "+this.getSalario()+"-Departamento: "+this.getDepartamento();
    }
}
