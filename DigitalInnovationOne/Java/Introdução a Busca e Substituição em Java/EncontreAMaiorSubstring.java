//Introdução a Busca e Substituição em Java
//2 / 5 - Encontre a maior substring
//Desafio
//Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').
//
//Entrada
//A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').
//
//Saída
//O tamanho da maior subsequência comum entre as duas Strings.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|      abcdef                   |                2              |
//|      cdofhij                  |                1              |
//|      TWO                      |                0              |
//|      FOUR                     |                7              |
//|      abracadabra              |                               |
//|      open                     |                               |
//|      Hey This java is hot     |                               |
//|      Java is a new paradigm   |                               |
//|---------------------------------------------------------------|

import java.io.IOException;
import java.util.Scanner;

public class EncontreAMaiorSubstring {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String larger;
        String smaller;

        while (scanner.hasNextLine()) {
            larger = scanner.nextLine();
            smaller = scanner.nextLine();

            int amountEquals = 0;

            if (larger.length() > smaller.length()) {
                String aux = smaller;
                smaller = larger;
                larger = aux;
            }

            for (int i = 0; i < smaller.length(); i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (larger.contains(smaller.substring(j, smaller.length() - i + j))) {
                        amountEquals = Math.max(amountEquals, smaller.length() - i);
                    }
                }
            }

            System.out.println(amountEquals);

        }
    }
}