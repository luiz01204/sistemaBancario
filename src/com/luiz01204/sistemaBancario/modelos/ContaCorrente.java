package com.luiz01204.sistemaBancario.modelos;

import java.math.BigDecimal;

public class ContaCorrente extends  Conta {
    private final BigDecimal juros = BigDecimal.valueOf(0.1);

    public ContaCorrente(int numero, Cliente cliente){
        super(numero,cliente);
    }

    @Override
    public void sacar(BigDecimal valor) throws SemSaldoException {
        BigDecimal valorSacar = valor.add(valor.multiply(juros));
        try {
            super.sacar(valorSacar);
        } catch (SemSaldoException e) {
            throw new SemSaldoException("Saldo insuficiente");
        }
    }
}
