//Introdução a Programação com Java
//2 / 3 - Multiplicação Simples
//Desafio
//Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois
// valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída
// esperada (exemplo abaixo).
//
//Entrada
//A entrada contém 2 valores inteiros.
//
//Saída
//Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes
// e depois da igualdade.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|               3               |         PROD = 27             |
//|               9               |                               |
//|---------------------------------------------------------------|
//|               -30             |         PROD = -300           |
//|               10              |                               |
//|---------------------------------------------------------------|
//|               0               |         PROD = 0              |
//|               9               |                               |
//|---------------------------------------------------------------|

import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
    }
}