
package br.edu.una;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void deveCriarClienteComNome() {
        Cliente cliente = new Cliente(1, "Diogo", 10);

        assertEquals("Diogo", cliente.getNome());
    }

    @Test
    public void deveRetornarIdDoCliente() {
        Cliente cliente = new Cliente(1, "Diogo", 10);

        assertEquals(1, cliente.getId());
    }
}
