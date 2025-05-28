// Classe abstrata que representa uma Conta bancária genérica
public abstract class Conta implements IConta {

    // Constante para a agência padrão (usada em todas as contas)
    private static final int AGENCIA_PADRAO = 1;

    // Variável estática usada para gerar números de contas sequenciais
    private static int SEQUENCIAL = 1;

    // Atributos protegidos para que subclasses possam acessá-los
    protected int agencia;
    protected int numero;
    protected double saldo;

    // Construtor da conta: define a agência padrão e um número sequencial
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    // Implementação do método sacar da interface IConta
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    // Implementação do método depositar da interface IConta
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    // Implementação do método transferir da interface IConta
    // Utiliza os métodos sacar e depositar para realizar a transferência
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Getters públicos para acessar os atributos protegidos
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método protegido para imprimir as informações comuns da conta
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
