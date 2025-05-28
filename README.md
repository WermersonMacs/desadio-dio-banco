# Projeto Banco em Java

Este é um projeto simples que simula operações bancárias básicas usando orientação a objetos em Java.

## Funcionalidades

- Criação de contas correntes e contas poupança.
- Depósito, saque e transferência entre contas.
- Impressão de extratos para cada tipo de conta.

## Estrutura do projeto

- **Banco**: representa o banco com seu nome.
- **Cliente**: representa o cliente do banco.
- **Conta** (classe abstrata): contém os atributos e métodos comuns para contas bancárias.
- **ContaCorrente**: herda de Conta, representa uma conta corrente.
- **ContaPoupanca**: herda de Conta, representa uma conta poupança.
- **IConta**: interface que define os métodos para operações bancárias.
- **Main**: classe principal para executar e testar as operações bancárias.

## Como executar

1. Compile todas as classes.
2. Execute a classe `Main` para ver exemplos de depósito, saque, transferência e impressão de extrato.

## Exemplo de uso

```java
Conta cc = new ContaCorrente();
Conta cp = new ContaPoupanca();

cc.depositar(100);
cc.imprimirExtrato();

cc.sacar(10);
cc.imprimirExtrato();

cc.transferir(25, cp);
cp.imprimirExtrato();
