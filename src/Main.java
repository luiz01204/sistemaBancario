import com.luiz01204.sistemaBancario.modelos.Cliente;
import com.luiz01204.sistemaBancario.modelos.ContaCorrente;
import com.luiz01204.sistemaBancario.modelos.SemSaldoException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws SemSaldoException {
        Cliente cliente = new Cliente("Luiz","12345678901");

        ContaCorrente conta1 = new ContaCorrente(123,cliente);
        conta1.depositar(new BigDecimal(100));
        System.out.println(conta1.getSaldo());

        conta1.sacar(new BigDecimal(50));
        System.out.println(conta1.getSaldo());
        conta1.sacar(new BigDecimal(100));
    }
}