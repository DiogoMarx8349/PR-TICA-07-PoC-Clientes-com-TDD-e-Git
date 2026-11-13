package br.edu.una;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaturaClienteTest {

    @Test
    public void deveCriarFaturaComId() {
        FaturaCliente fatura = new FaturaCliente(1);

        assertEquals(1, fatura.getId());
    }
}