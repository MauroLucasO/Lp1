package atividade11;

import atividades.Lista2.atividade11.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("Funcionario A", "Cargo A", 1000f, "Departamento A");
    }

    @Test
    public void deveTestarExcecaoSalarioNegativo(){
        try{
            funcionario.setSalario(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Salario invalido menor que zero", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoPercentualNegativo(){
        try{
            funcionario.receberAumento(-0.01f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Percentual invalido", e.getMessage());
        }
    }
    @Test
    public void deveAumentarSalario(){
        assertEquals(1100f,funcionario.receberAumento(10f));
    }
    @Test
    public void deveMudarDepartamento(){
        funcionario.mudarDepartamento("Departamento B");
        assertEquals("Departamento B",funcionario.getDepartamento());
    }
    @Test
    public void deveExibirDadosFuncionario(){
        assertEquals("Nome: Funcionario A-Cargo: Cargo A-Salario: 1000.0-Departamento: Departamento A",funcionario.exibirDados());

    }
}
