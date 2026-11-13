package br.edu.una;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente criarCliente() {
        return new Cliente(1, "Diogo", 10);
    }

    @Test
    public void deveCriarClienteComNome() {
        Cliente cliente = criarCliente();
        assertEquals("Diogo", cliente.getNome());
    }

    @Test
    public void deveRetornarIdDoCliente() {
        Cliente cliente = criarCliente();
        assertEquals(1, cliente.getId());
    }

    @Test
    public void deveRetornarDescontoDoCliente() {
        Cliente cliente = criarCliente();
        assertEquals(10, cliente.getDesconto());
    }

    @Test
    public void deveAlterarDescontoDoCliente() {
        Cliente cliente = criarCliente();
        cliente.setDesconto(20);
        assertEquals(20, cliente.getDesconto());
    }

    // COLOQUE O NOVO TESTE AQUI, ANTES DA ÚLTIMA CHAVE!

    @Test
    public void deveRetornarGeneroNaoDefinido() {
        Cliente cliente = criarCliente();
        assertEquals("nd", cliente.getGenero());
    }

    @Test
public void deveAlterarGeneroDoCliente() {
    Cliente cliente = criarCliente();

    cliente.setGenero("m");

    assertEquals("m", cliente.getGenero());
    }
}