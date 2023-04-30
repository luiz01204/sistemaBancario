package com.luiz01204.sistemaBancario.modelos;

import java.math.BigDecimal;

public interface Iconta {
        void depositar(BigDecimal valor);

        void sacar(BigDecimal valor) throws SemSaldoException;
}
