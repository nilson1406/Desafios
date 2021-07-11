//Solução de Problemas com Java
//1 / 7 - Contagem repetida de números
//Desafio
//Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece,
// ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de
// valor.
//
//Entrada
//A primeira linha de entrada contem um único inteiro N, que indica a quantidade de valores que serão lidos
// para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na
// entrada de dados.
//
//Saída
//Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece
// na entrada por ordem crescente de valor.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|            7                  |      4 aparece 1 vez(es)      |
//|            8                  |      8 aparece 2 vez(es)      |
//|            10                 |      10 aparece 3 vez(es)     |
//|            8                  |      260 aparece 1 vez(es)    |
//|            260                |                               |
//|            4                  |                               |
//|            10                 |                               |
//|            10                 |                               |
//|---------------------------------------------------------------|

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemRepetidaDeNumeros {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int amount = scr.nextInt();
        Map<Integer, Integer> values = new HashMap<>();

        while (amount-- > 0) {
            int num = scr.nextInt();

            if (values.containsKey(num)) {
                int times = values.get(num);
                values.put(num, ++times);
            } else {
                values.put(num, 1);
            }
        }

        values.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }
}