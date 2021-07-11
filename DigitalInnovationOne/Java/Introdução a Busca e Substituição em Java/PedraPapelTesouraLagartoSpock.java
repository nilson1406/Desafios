//Introdução a Busca e Substituição em Java
//4 / 5 - Pedra, Papel, Tesoura, Lagarto e Spock
//Desafio
//Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de
// pedra-papel-tesoura. Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais: o
// lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos
// em Star Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por
// Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as
// seguintes:
//
//Tesoura corta papel
//Papel cobre pedra
//Pedra derruba lagarto
//Lagarto adormece Spock
//Spock derrete tesoura
//Tesoura prende lagarto
//Lagarto come papel
//Papel refuta Spock
//Spock vaporiza pedra
//Pedra quebra tesoura
//Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um almoço para o outro, com esta
// brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem irá
// ganhar ou se dará empate.
//
//Entrada
//Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro, representando a quantidade
// de casos de teste. Cada caso de teste tem duas palavras, representando a escolha de Fernanda e de
// Marcia, respectivamente.
//
//Saída
//Para cada caso de teste, imprima quem venceu, ou se houve empate.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|                3              |                               |
//|---------------------------------------------------------------|
//|           spock spock         |           empate              |
//|---------------------------------------------------------------|
//|          tesoura spock        |           marcia              |
//|---------------------------------------------------------------|
//|          lagarto spock        |           fernanda            |
//|---------------------------------------------------------------|

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PedraPapelTesouraLagartoSpock {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < n; i++) {
            String[] lineItems = br.readLine().split(" ");
            if (lineItems[0].equalsIgnoreCase(lineItems[1])) {
                System.out.println("empate");
            } else if (lineItems[0].equalsIgnoreCase("tesoura")
                    && lineItems[1].equalsIgnoreCase("papel")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("papel")
                    && lineItems[1].equalsIgnoreCase("pedra")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("pedra")
                    && lineItems[1].equalsIgnoreCase("lagarto")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("lagarto")
                    && lineItems[1].equalsIgnoreCase("spock")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("spock")
                    && lineItems[1].equalsIgnoreCase("tesoura")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("tesoura")
                    && lineItems[1].equalsIgnoreCase("lagarto")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("lagarto")
                    && lineItems[1].equalsIgnoreCase("papel")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("papel")
                    && lineItems[1].equalsIgnoreCase("spock")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("spock")
                    && lineItems[1].equalsIgnoreCase("pedra")) {
                System.out.println("fernanda");
            } else if (lineItems[0].equalsIgnoreCase("pedra")
                    && lineItems[1].equalsIgnoreCase("tesoura")) {
                System.out.println("fernanda");
            } else {
                System.out.println("marcia");
            }
        }
    }

}
