//Fundamentos Aritméticos em Java
//3 / 5 - Análise de Números
//Desafio
//Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares,
// quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores
// informados são negativos.
//
//Entrada
//Você receberá 5 valores inteiros.
//
//Saída
//Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e
// não esquecendo o final de linha após cada uma.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|               -5              |      3 valor(es) par(es)      |
//|               0               |      2 valor(es) impar(es)    |
//|               -3              |      1 valor(es) positivo(s)  |
//|               -4              |      3 valor(es) negativo(s)  |
//|               12              |                               |
//|---------------------------------------------------------------|

import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int par = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
            if (num % 2 == 0) {
                par++;
            } else {
                odd++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");
    }

}
