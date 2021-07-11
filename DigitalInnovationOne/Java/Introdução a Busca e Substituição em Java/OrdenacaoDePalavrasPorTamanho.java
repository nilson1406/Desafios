//Introdução a Busca e Substituição em Java
//1 / 5 - Ordenação de palavras por tamanho
//Desafio
//Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve receber
// um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras decrescente,
// se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.
//
//Entrada
//A primeira linha da entrada possui um único inteiro N, que indica o número de casos de teste. Cada caso
// de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter entre 1 e 50
// caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.
//
//Saída
//A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o tamanho
// das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve ser impresso
// entre duas palavras.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|2                              |midnight three four mond One at|
//|One three four mond at midnight|three five one                 |
//|one three five                 |                               |
//|---------------------------------------------------------------|

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class OrdenacaoDePalavrasPorTamanho {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<List<String>> listOfList = new ArrayList<>();
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int diff = s2.length() - s1.length();
                if (diff == 0) {
                    return s1.compareTo(s2);
                }
                return diff;
            }
        };

        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            String[] lineItems = br.readLine().trim().split(" ");
            listOfList.add(Arrays.asList(lineItems));
        }

        for (List<String> list : listOfList) {
            Collections.sort(list, comparator);
        }

        for (List<String> list : listOfList) {
            list.forEach(s -> System.out.print(s + " "));
            System.out.println();
        }

    }
}
