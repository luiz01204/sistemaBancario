package com.luiz01204.sistemaBancario.modelos;

import java.math.BigDecimal;

public  abstract class Conta implements Iconta {
    private final int agenecia = 1;
    private int numero;
    private Cliente cliente;
    private BigDecimal saldo;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = new BigDecimal(0);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(BigDecimal valor) throws SemSaldoException {
        int compare = this.saldo.compareTo(valor);
        if (compare > 0) {
            this.saldo = this.saldo.subtract(valor);
        } else {
            throw new SemSaldoException("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }
}