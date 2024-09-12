/*

Dominando Desafios de Códigos Intermediários em Java
3 / 5 - Conta Bancária com Construtor em POO
Intermediário - Princípios Básicos

Descrição

Você está desenvolvendo um programa simples em Java para representar uma conta bancária. 
Utilizando programação orientada a objetos (POO), você criará uma classe ContaBancaria com um construtor que permitirá a inicialização da conta com um saldo inicial.

Entrada

    - O programa solicitará ao usuário que informe o saldo inicial da conta.
    - Em seguida, o programa solicitará ao usuário que realize transações de depósito e saque.

Saída

    - A classe ContaBancaria conterá métodos para realizar depósitos e saques, atualizando o saldo da conta.
    - O saldo atual será exibido após cada transação.
    - Se o valor do saque for maior que o saldo disponível na conta, imprima uma mensagem informando: Saldo insuficiente. Saque não realizado.

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|---------------------------------------------------------------|
|       Exemplos de Entrada     |       Exemplos de Saída       |
|---------------------------------------------------------------|
|               50              |      Deposito feito.          |
|               50              |      Saldo atual: 100.0       |
|               100             |      Saque feito.             |
|                               |      Saldo atual: 0.0         |
|---------------------------------------------------------------|
|               90              |      Deposito feito.          |
|               90              |      Saldo atual: 180.0       |
|               12              |      Saque feito.             |
|                               |      Saldo atual: 168.0       |
|---------------------------------------------------------------|

 */

import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Criar uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // TODO: Incrementar o saldo com o valor e imprimir "Deposito feito."
        saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        // TODO: Verificar se o saldo é suficiente considerando o valor:
        // Se sim, atualizar o saldo e imprimir "Saque feito."
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Saque feito.");
        }else{
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
        imprimirSaldo();
    }
    
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}