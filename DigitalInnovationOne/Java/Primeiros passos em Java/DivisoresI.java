/*
Primeiros passos em Java
3 / 3 - Divisores I

Básico - Princípios Básicos

Desafio
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.

|------------------------------------------
| Exemplos de Entrada | Exemplos de Saída |
|------------------------------------------
| 6                   | 1                 |
|                     | 2                 |
|                     | 3                 |
|                     | 6                 |
|------------------------------------------

*/

import java.util.Scanner;

public class DivisoresI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
