/*

Explorando Desafios de Códigos Básicos em Java
3 / 5 - Verificador de Idade para Conta Bancária
Básico - Princípios Básicos

Descrição

Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária. 
A condição é que o cliente deve ter pelo menos 18 anos de idade.

Entrada

 - O programa solicitará ao usuário que digite sua idade.

Saída

 - Utilizando apenas um bloco if e else, o programa verificará se a idade do cliente é igual ou superior a 18 anos.
 - Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária.
 - Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|---------------------------------------------------------------------------------------|
|       Exemplos de Entrada     |                 Exemplos de Saída                     |
|---------------------------------------------------------------------------------------|
|               17              | Voce nao esta elegivel para criar uma conta bancaria. |
|---------------------------------------------------------------------------------------|
|               26              | Voce esta elegivel para criar uma conta bancaria.     |
|---------------------------------------------------------------------------------------|
|               18              | Voce esta elegivel para criar uma conta bancaria.     |
|---------------------------------------------------------------------------------------|

 */

import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }else{
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        scanner.close();
    }
}