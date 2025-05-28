// Classe que representa uma Conta Corrente, herdando da classe abstrata Conta
public class ContaCorrente extends Conta {

    // Sobrescreve o método imprimirExtrato da interface IConta (implementado via Conta)
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        // Chama o método protegido da superclasse para imprimir dados comuns da conta
        imprimirInfosComuns();
    }
}
