package br.edu.una;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaturaClienteTest {

    @Test
    public void deveCriarFaturaComId() {
        FaturaCliente fatura = new FaturaCliente(1);

        assertEquals(1, fatura.getId());
    }

    @Test
public void deveCriarFaturaComClienteEValor() {
    Cliente cliente = new Cliente(1, "Diogo", 10);
    FaturaCliente fatura = new FaturaCliente(2, cliente, 100.0);

    assertEquals(2, fatura.getId());
    assertEquals(cliente, fatura.getCliente());
    assertEquals(100.0, fatura.getValor(), 0.001);
    }

    @Test
public void deveAlterarClienteDaFatura() {
    Cliente cliente = new Cliente(1, "Diogo", 10);
    Cliente novoCliente = new Cliente(2, "Carlos", 15);

    FaturaCliente fatura = new FaturaCliente(1, cliente, 100.0);

    fatura.setCliente(novoCliente);

    assertEquals(novoCliente, fatura.getCliente());
    }
}