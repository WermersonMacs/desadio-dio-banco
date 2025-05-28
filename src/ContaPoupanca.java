// Classe que representa uma Conta Poupança, estendendo a classe abstrata Conta
public class ContaPoupanca extends Conta {

    // Implementação do método imprimirExtrato, definido na interface IConta e herdado por Conta
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Poupanca ===");
        // Imprime informações comuns da conta (agência, número e saldo)
        imprimirInfosComuns();
    }
}
