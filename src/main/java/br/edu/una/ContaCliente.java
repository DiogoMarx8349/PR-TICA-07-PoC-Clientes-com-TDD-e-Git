package br.edu.una;

public class ContaCliente {

    private int id;
    private Cliente cliente;
    private double saldo;

    public ContaCliente(int id, Cliente cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
}