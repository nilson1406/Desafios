/*

Explorando Desafios de Códigos Básicos em Java
1 / 5 - Operações Bancárias Simples com Switch
Básico - Princípios Básicos

Descrição

Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. 
A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

Entrada

 - O programa exibirá um menu com as seguintes opções:

    1.Depositar
    2.Sacar
    3.Consultar Saldo
    4Encerrar

 - O usuário escolherá uma dessas opções digitando o número correspondente.

Saída

 - Utilizando um switch, o programa realizará a operação escolhida pelo usuário.

 - Se o usuário escolher:

    1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, 
        deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
    2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, 
        deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
    3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
    0: O programa encerrará, imprimindo "Programa encerrado.".

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|---------------------------------------------------------------|
|       Exemplos de Entrada     |       Exemplos de Saída       |
|---------------------------------------------------------------|
|               1               |      Saldo atual: 50.0        |
|               50              |      Saldo insuficiente.      |
|               2               |      Programa encerrado.      |
|               100             |                               |
|               0               |                               |
|---------------------------------------------------------------|
|               3               |      Saldo atual: 0.0         |
|               1               |      Saldo atual: 550.0       |
|               550             |      Programa encerrado.      |
|               0               |                               |
|                               |                               |
|---------------------------------------------------------------|
|               1               |      Saldo atual: 1000.0      |
|               1000            |      Saldo atual: 500.0       |
|               2               |      Programa encerrado.      |  
|               500             |                               |
|               0               |                               |
|---------------------------------------------------------------|

 */

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:                    
                    saldo = saldo + scanner.nextDouble();
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo = saldo - saque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.\n");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}