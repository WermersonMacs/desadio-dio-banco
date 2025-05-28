// Interface que define o contrato básico de operações bancárias para uma conta
public interface IConta {

    // Método para realizar um saque de um valor específico da conta
    void sacar(double valor);

    // Método para depositar um valor específico na conta
    void depositar(double valor);

    // Método para transferir um valor para outra conta de destino
    void transferir(double valor, Conta contaDestino);

    // Método para imprimir o extrato da conta
    void imprimirExtrato();
}
