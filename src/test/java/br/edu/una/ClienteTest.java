
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
}
