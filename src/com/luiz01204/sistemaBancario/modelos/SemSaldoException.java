package com.luiz01204.sistemaBancario.modelos;

public class SemSaldoException extends Exception {
    public SemSaldoException(String mensagem) {
        super(mensagem);
    }
}
