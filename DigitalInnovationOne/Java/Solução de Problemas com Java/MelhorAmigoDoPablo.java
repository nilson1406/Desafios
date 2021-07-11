//Solução de Problemas com Java
//3 / 7 - Melhor amigo do Pablo
//Desafio
//Todo final de ano ocorre uma festa na escola. As inscrições para participar da festa são abertas no
// início de julho. No momento da inscrição, o aluno pode escolher se quer ser "O Amigo do Pablo" na
// festa ou não. O mais lógico seria escolher a opção Sim, afinal, é um privilégio ser O Amigo do
// Pablo, já que ele é a pessoa mais descolada da escola. Porém, há indivíduos que definitivamente
// não pretendem ser O Amigo do Pablo, e por motivos desconhecidos.
//
//Somente um será o escolhido. Em vista disso, muitos alunos que escolheram a opção Sim realizaram
// a inscrição diversas vezes para aumentar a própria probabilidade de ser O Amigo do Pablo.
// A diretora da escola pediu que você desenvolva um programa que organize as inscrições do site,
// pois está havendo um spam de inscrições. O critério para ser o escolhido é a quantidade de letras
// do primeiro nome, e em caso de empate, vence aquele que realizou primeiro a inscrição. A
// organização final dos inscritos deverá seguir a ordem de escolha (Sim ou Não), mas respeitando
// a ordem alfabética.
//
//OBS.: Ninguém que escolheu a opção Não realizou a inscrição mais de uma vez.
//
//Entrada
//A entrada contém somente um caso de teste. Cada linha é composta pelo primeiro nome do
// participante (sem espaços), seguido da opção SIM (caso o usuário queira ser O Amigo do Pablo)
// ou NAO (caso não queira). A entrada termina assim que o usuário digita "FIM" (sem as aspas).
//
//Saída
//Seu programa deverá imprimir os inscritos pela ordem de escolha e por ordem alfabética, seguido
// do nome do vencedor. Imprima uma linha em branco entre a lista de inscritos e o nome do vencedor.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|          Joao NAO             |          Abhay                |
//|          Carlos SIM           |          Aline                |
//|          Abner NAO            |          Andres               |
//|          Samuel SIM           |          Carlos               |
//|          Ricardo NAO          |          Pablo                |
//|          Abhay SIM            |          Samuel               |
//|          Samuel SIM           |          Abner                |
//|          Andres SIM           |          Joao                 |
//|          Roberto NAO          |          Ricardo              |
//|          Carlos SIM           |          Roberto              |
//|          Samuel SIM           |                               |
//|          Samuel SIM           |          Amigo do Pablo:      |
//|          Abhay SIM            |          Carlos               |
//|          Aline SIM            |                               |
//|          Andres SIM           |                               |
//|          FIM                  |                               |
//|---------------------------------------------------------------|

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MelhorAmigoDoPablo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        List<String> friends = new ArrayList<>();
        List<String> notFriends = new ArrayList<>();

        while (true) {
            line = scanner.nextLine();
            if (line.equals("FIM")) {
                break;
            }
            String[] lineItems = line.split(" ");
            for (int i = 0; i < lineItems.length - 1; i += 2) {
                if (lineItems[i + 1].equals("SIM")) {
                    if (!friends.contains(lineItems[i]))
                        friends.add(lineItems[i]);
                } else {
                    notFriends.add(lineItems[i]);
                }
            }
        }

        String friendPablo = "";
        if (!friends.isEmpty())
            friendPablo = friends.get(0);

        for (int i = 0; i < friends.size() - 1; i++) {
            if (friendPablo.length() < friends.get(i + 1).length()) {
                friendPablo = friends.get(i + 1);
            }
        }

        Collections.sort(friends);
        Collections.sort(notFriends);

        friends.forEach(System.out::println);
        notFriends.forEach(System.out::println);
        System.out.println("\n" + "Amigo do Pablo:");
        System.out.println(friendPablo);
    }
}
