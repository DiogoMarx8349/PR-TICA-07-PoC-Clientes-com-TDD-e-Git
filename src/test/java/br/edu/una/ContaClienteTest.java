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

   @Test
public void deveCriarContaComIdECliente() {
    Cliente cliente = new Cliente(1, "Diogo", 10);

    ContaCliente conta = new ContaCliente(2, cliente);

    assertEquals(2, conta.getId());
    assertEquals(cliente, conta.getCliente());
    assertEquals(0.0, conta.getSaldo());
    }

    @Test
public void deveCriarContaApenasComId() {
    ContaCliente conta = new ContaCliente(3);

    assertEquals(3, conta.getId());
    assertEquals(null, conta.getCliente());
    assertEquals(0.0, conta.getSaldo());
    }

    @Test
public void deveAlterarClienteDaConta() {
    Cliente cliente = new Cliente(1, "Diogo", 10);
    Cliente novoCliente = new Cliente(2, "Carlos", 15);

    ContaCliente conta = new ContaCliente(1, cliente, 500.0);

    conta.setCliente(novoCliente);

    assertEquals(novoCliente, conta.getCliente());
    }

    @Test
public void deveAlterarSaldoDaConta() {
    Cliente cliente = new Cliente(1, "Diogo", 10);

    ContaCliente conta = new ContaCliente(1, cliente, 500.0);

    conta.setSaldo(800.0);

    assertEquals(800.0, conta.getSaldo());
    }

    @Test
public void deveAdicionarDepositoNaConta() {
    Cliente cliente = new Cliente(1, "Diogo", 10);

    ContaCliente conta = new ContaCliente(1, cliente, 500.0);

    conta.addDeposito(200.0);

    assertEquals(700.0, conta.getSaldo());
    }

    @Test
public void deveRealizarSaqueNaConta() {
    Cliente cliente = new Cliente(1, "Diogo", 10);

    ContaCliente conta = new ContaCliente(1, cliente, 500.0);

    conta.subSaldo(200.0);

    assertEquals(300.0, conta.getSaldo());
    }
}