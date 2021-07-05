//Ordenação e Filtros em Java
//2 / 5 - Compras no Supermercado
//Desafio
//Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas domésticas.
// Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma anotar cada
// item na mesma hora que percebe a falta dele em casa.
//
//O problema é que o aplicativo não exclui itens duplicados, como Pedro anota o mesmo item mais de uma vez
// e a lista acaba ficando extensa. Sua tarefa é melhorar o aplicativo de notas desenvolvendo um código que
// exclua os itens duplicados da lista de compras e que os ordene alfabeticamente.
//
//Entrada
//A primeira linha de entrada contém um inteiro N (N < 100) com a quantidade de casos de teste que vem a
// seguir, ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra consiste de
// uma única linha que contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas
// (de 1 a 20 letras), sem acentos e separadas por um espaço.
//
//Saída
//A saída contém N linhas, cada uma representando uma lista de compra, sem os itens repetidos e em
// ordem alfabética.
//
//|-----------------------------------------------------------------------------------------------|
//|                 Exemplos de Entrada                |            Exemplos de Saída             |
//|-----------------------------------------------------------------------------------------------|
//|     2                                              |         carne laranja picles suco        |
//|     carne laranja suco picles laranja picles       |         picles suco laranja pera         |
//|     laranja pera laranja pera pera                 |                                          |
//|-----------------------------------------------------------------------------------------------|


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ComprasNoSupermercado {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<String> lines = new ArrayList<>();

        int amount = Integer.parseInt(st.nextToken());

        for (int i = 0; i < amount; i++) {
            List<String> items = new ArrayList<>();
            String line = br.readLine();
            String[] lineItems = line.split(" ");
            for (String s : lineItems) {
                if (!items.contains(s))
                    items.add(s);
            }

            Collections.sort(items);

            String l = "";
            for (String item : items) {
                l += item + " ";
            }

            lines.add(l);
        }

        lines.forEach(System.out::println);
    }

}
