package br.edu.una;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaClienteTest {

    @Test
    public void deveCriarContaComIdClienteESaldo() {
        Cliente cliente = new Cliente(1, "Diogo", 10);

        ContaCliente conta = new ContaCliente(1, cliente, 500.0);

        assertEquals(1, conta.getId());
        assertEquals(cliente, conta.getCliente());
        assertEquals(500.0, conta.getSaldo());
    }
}