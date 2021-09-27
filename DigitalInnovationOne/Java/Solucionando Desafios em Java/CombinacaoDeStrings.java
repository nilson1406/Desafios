/*
Solucionando Desafios em Java
4 / 5 - Combinação de strings
Básico - Princípios Básicos
Desafio
Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de
cada string.

Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda
string, em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e
retornada.

Entrada
A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a
quantidade de casos de teste que vem a seguir. Cada caso de teste é composto por uma linha
que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50
caracteres inclusive.

Saída
Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a
cadeia resultante.

|-----------------------------------------|
| Exemplos de Entrada | Exemplos de Saída |
|-----------------------------------------|
| 2                   |                   |
|-----------------------------------------|
| aA Bb               | aBAb              |
|-----------------------------------------|
| aa bb               | abab              |
|-----------------------------------------|
*/

import java.util.Scanner;

public class CombinacaoDeStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String res = "";

            String[] words = scanner.nextLine().split(" ");
            String larger = "";
            int size = 0;
            if (words[0].length() < words[1].length()) {
                size = words[0].length();
                larger = words[1];
            } else {
                size = words[1].length();
                larger = words[0];
            }

            for (int j = 0; j < size; j++) {
                res += words[0].substring(j, j + 1);
                res += words[1].substring(j, j + 1);
            }

            if(words[0].length() != words[1].length()) {
                res += larger.substring(size);
            }

            System.out.println(res);
        }

        scanner.close();
    }

}