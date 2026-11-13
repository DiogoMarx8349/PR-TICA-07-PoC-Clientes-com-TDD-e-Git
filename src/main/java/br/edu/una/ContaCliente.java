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

   public void setSaldo(double saldo) {
    this.saldo = saldo;

    } 

    public ContaCliente(int id, Cliente cliente) {
    this.id = id;
    this.cliente = cliente;
    this.saldo = 0.0;
    }

    public ContaCliente(int id) {
    this.id = id;
    this.cliente = null;
    this.saldo = 0.0;
    }

   public void setCliente(Cliente cliente) {
    this.cliente = cliente;
    }

    public double addDeposito(double valor) {
    this.saldo += valor;
    return this.saldo;
    }
}