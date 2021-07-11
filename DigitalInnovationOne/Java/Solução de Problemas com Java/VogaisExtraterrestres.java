//Solução de Problemas com Java
//2 / 7 - Vogais Extraterrestres
//Desafio
//Desde o Gerador de Improbabilidade Infinita, muitos nem questionam sobre vidas extraterrestres, e se
// aprofundam em questionamentos mais improváveis, como, por exemplo, será que seres de outros planetas
// usam os mesmos caracteres que nós para se comunicarem? E se isso for verdade, será que usam as mesmas
// letras vogais que a gente? Pensando nisso, vários cientistas criaram inúmeros tipos de alfabetos
// alienígenas, usando as letras do nosso alfabeto, além dos dígitos, de 0 a 9, com as suas respectivas
// vogais. Baseados nisto, eles querem a sua ajuda para identificar vogais em alfabetos alienígenas e
// realizar a contagem.
//
//Escreva um programa que, dado uma sequência de vogais, em um determinado alfabeto alienígena,
// contabilize, em um texto escrito com o mesmo alfabeto, quantas vogais o mesmo possui.
//
//Entrada
//Haverá diversos casos de teste. Cada caso de teste é formado por duas linhas. A primeira linha informa
// uma palavra, formada por todas as vogais alienígenas de um determinado planeta. A segunda linha contém
// uma frase formada por letras do mesmo alfabeto. A entrada termina com fim de arquivo.
//
//Saída
//Para cada caso de teste, imprima a quantidade de vogais alienígenas correspondente.
//
//|-----------------------------------------------------------------------------|
//|       Exemplos de Entrada                   |       Exemplos de Saída       |
//|-----------------------------------------------------------------------------|
//|aeiou                                        |               16              |
//|o rato roeu a roupa do rei de roma           |                               |
//|-----------------------------------------------------------------------------|
//|4310                                         |               8               |
//|t3st3 p4r4 c0d1f1c4r                         |                               |
//|-----------------------------------------------------------------------------|
//|kwy                                          |               3               |
//|the quick brown fox jumps over the lazy dog  |                               |
//|-----------------------------------------------------------------------------|

import java.util.Scanner;

public class VogaisExtraterrestres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int amount = 0;
            String vowels = scanner.nextLine();
            String phrase = scanner.nextLine();

            for (int i = 0; i < vowels.length(); i++) {
                for (int j = 0; j < phrase.length(); j++) {
                    if (phrase.charAt(j) == vowels.charAt(i)) {
                        amount++;
                    }
                }
            }

            System.out.println(amount);
        }
    }

}
