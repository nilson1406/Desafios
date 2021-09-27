/*
Desafios matemáticos em Java
3 / 3 - Área Inferior

Básico - Princípios Básicos

Desafio
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área inferior da matriz, conforme ilustrado abaixo (área verde).

https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1188.png

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante de dupla precisão (double) que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

|------------------------------------------
| Exemplos de Entrada | Exemplos de Saída |
|------------------------------------------
| S                   | 111.4             |
| 1.0                 |                   |
| 330.0               |                   |
| -3.5                |                   |
| 2.5                 |                   |
| 4.1                 |                   |
| ...                 |                   |
|------------------------------------------

*/

import java.io.IOException;
import java.util.Scanner;

public class AreaInferior {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        char o = scanner.next().toUpperCase().charAt(0);
        double[][] m = new double[12][12];

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                m[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                if ((i > 6) && (j < i) && (j > 11 - i))
                    sum += m[i][j];
            }
        }

        if (o == 'M')
            sum /= 30;

        System.out.println(String.format("%.1f", sum));
    }
}