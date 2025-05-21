package atividade9;

import atividades.Lista2.atividade9.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa("Nome A", 0, 1.0f, 0.0f);
    }
    @Test
    public void deveTestarExcecaoIdadeNegativa(){
        try{
            pessoa.setIdade(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Idade invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoAturaNegativa(){
        try{
            pessoa.setAltura(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Altura invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarExcecaoPesoNegativa(){
        try{
            pessoa.setPeso(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Peso invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarEnvelhecerAumentarIdadePessoaEmUmAno(){
        pessoa.setIdade(10);
        pessoa.envelhecer();
        assertEquals(11, pessoa.getIdade());
    }
    @Test
    public void deveTestarExcecaoCrescerAlturaCentrimetroNegativa(){
        try{
            pessoa.crescer(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Centimetro invalida", e.getMessage());
        }
    }
    @Test
    public void deveTestarCrescerNaoAumentarAlturaPessoaMais21Anos(){
        pessoa.setIdade(21);
        pessoa.crescer(1.56f);
        assertEquals(1.00f, pessoa.getAltura());
    }
    @Test
    public void deveTestarCrescerAumentarAlturaPessoaMenos21Anos(){
        pessoa.setIdade(20);
        pessoa.crescer(1.56f);
        assertEquals(2.56f, pessoa.getAltura());
    }
    @Test
    public void deveTestarExcecaoGanharPesoQuilosNegativa(){
        try{
            pessoa.ganhaPeso(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals( "Peso invalido para ganho",e.getMessage());
        }
    }
    @Test
    public void deveGanharPeso(){
        pessoa.setPeso(55.0f);
        pessoa.ganhaPeso(10.0f);
        assertEquals(65.0, pessoa.getPeso());
    }
    @Test
    public void deveTestarExcecaoPerdePesoQuilosNegativa(){
        try{
            pessoa.perdePeso(-1.0f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Peso invalido para perda", e.getMessage());
        }
    }
    @Test
    public void devePerderPeso(){
        pessoa.setPeso(55.0f);
        pessoa.perdePeso(10.0f);
        assertEquals(45.0, pessoa.getPeso());
    }
}