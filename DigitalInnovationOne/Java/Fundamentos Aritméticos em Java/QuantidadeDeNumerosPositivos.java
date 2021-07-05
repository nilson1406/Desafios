//Fundamentos Aritméticos em Java
//1 / 5 - Quantidade de Números Positivos
//Desafio
//Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada,
// devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.
//
//Entrada
//Você receberá seis valores, negativos e/ou positivos.
//
//Saída
//Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo
// de saída. Não esqueça da mensagem "valores positivos" ao final.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|             7                 |       4 valores positivos     |
//|             -5                |                               |
//|             6                 |                               |
//|             -3.4              |                               |
//|             4.6               |                               |
//|             12                |                               |
//|---------------------------------------------------------------|

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();

        int amount = 6;
        for (int i = 0; i < amount; i++) {
            numbers.add(scanner.nextDouble());
        }

        System.out.printf("%d %s", numbers.stream().filter(n -> n > 0).count(), "valores positivos");
    }
}
