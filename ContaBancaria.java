class ContaBancaria {
    String numero;
    double saldo;
 
    ContaBancaria(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
 
    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado);
    }
 
    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado);
        } else {
            System.out.println("Erro: saldo insuficiente.");
        }
    }
 
    double consultarSaldo() {
        return saldo;
    }
}
 
class ExemploContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("001-2", 500.00);
        conta.depositar(200.00);
        conta.sacar(100.00);
        conta.sacar(700.00); 
        System.out.println("Saldo final: R$ " + conta.consultarSaldo());
    }
}