// Classe principal para executar o programa
public class Main {
    public static void main(String[] args) {
        // Criação de uma conta corrente
        Conta cc = new ContaCorrente();

        // Criação de uma conta poupança
        Conta cp = new ContaPoupanca();

        // Depósito de R$100 na conta corrente
        cc.depositar(100);

        // Impressão do extrato da conta corrente
        cc.imprimirExtrato();

        // Impressão do extrato da conta poupança (saldo inicial zero)
        cp.imprimirExtrato();

        // Saque de R$10 da conta corrente
        cc.sacar(10);

        // Impressão do extrato da conta corrente após o saque
        cc.imprimirExtrato();

        // Transferência de R$25 da conta corrente para a conta poupança
        cc.transferir(25, cp);

        // Impressão dos extratos após a transferência
        cc.imprimirExtrato(); // Conta corrente após transferência
        cp.imprimirExtrato(); // Conta poupança após recebimento
    }
}
