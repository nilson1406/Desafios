//Ordenação e Filtros em Java
//5 / 5 - Gincana no Acampamento
//Desafio
//Nas férias de Dezembro, várias escolas se organizam e levam seus alunos para um acampamento de férias
// por uma semana. Nestes acampamentos os alunos são divididos em cabanas coletivos por gênero e idade,
// sempre com um adulto que, além de dormir com o grupo no cabana, também são responsáveis por criar e e
// xecutar várias atividades, como por exemplo jogos, excursões, Gincanas Noturnas, etc.
//
//No primeiro dia foi realizada uma gincana em que a atividade constituia em agrupar os alunos em um
// círculo (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse
// apenas um aluno, que seria o vencedor.
//
//No momento em que entra no círculo, cada aluno recebe uma pequena ficha que contém um valor de 1 a 500.
// Depois que o círculo é formado, conta-se, iniciando no aluno que está ao lado da primeira que entrou
// no círculo, o número correspondente à ficha que o primeiro detém. O aluno onde o número contado cair,
// deve ser retirado do grupo, e a contagem inicia novamente segundo a ficha do aluno que acabou de ser
// eliminado. Para ficar mais interessante, quando o valor que consta na ficha é par, a contagem é feita
// no sentido horário e quando o valor que consta na ficha é ímpar, a contagem é feita no sentido
// anti-horário.
//
//Desenvolva um programa para que no próximo evento o responsável pela brincadeira saiba previamente qual
// criança irá ser a vencedora de cada grupo, com base nas informações fornecidas.
//
//Entrada
//A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro
// N (1 ≤ N ≤ 100), indicando a quantidade de alunos que farão parte de cada círculo. Em seguida, as
// N linhas de cada caso de teste conterão duas informações, o Nome e o Valor (1 ≤ Valor ≤ 500) que
// consta na ficha de cada aluno, separados por um espaço, na ordem de entrada na formação do círculo
// inicial.
//
//OBS: O Nome de cada aluno não deverá ultrapassar 30 caracteres e contém apenas letras maiúsculas e
// minúsculas, sem acentos, e o caractere “_”. O final da entrada é indicado pelo número zero.
//
//Saída
//Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço após o
// sinal ":" indicando qual é o aluno do grupo que venceu a brincadeira.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|          3                    |     Vencedor(a): Fernanda     |
//|          Fernanda 7           |     Vencedor(a): Pedro        |
//|          Fernando 9           |     Vencedor(a): Pedro        |
//|          Gustavo 11           |                               |
//|          5                    |                               |
//|          Maria 7              |                               |
//|          Pedro 9              |                               |
//|          Joao_Vitor 5         |                               |
//|          Isabel 12            |                               |
//|          Laura 8              |                               |
//|          3                    |                               |
//|          Maria 4              |                               |
//|          Pedro 3              |                               |
//|          Joao 2               |                               |
//|          0                    |                               |
//|---------------------------------------------------------------|

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GincanaNoAcampamento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.next());

        while (n != 0) {

            for (int i = 0; i < n; i++) {
                String student = scanner.next();
                String valueCoin = scanner.next();
                list.add(student.trim() + " " + valueCoin.trim());
            }

            int index = 0;
            int indexToRemove = 0;
            String[] lineItems = list.get(index).split(" ");
            int valueCoin = Integer.parseInt(lineItems[1]);

            for (int i = 0; i < n - 1; i++) {

                if (valueCoin % 2 == 0) {
                    indexToRemove = (list.size() - (valueCoin % list.size()) + index) % list.size();
                } else if (valueCoin % 2 != 0) {
                    indexToRemove = (valueCoin % list.size() + index) % list.size();
                }

                lineItems = list.get(indexToRemove).split(" ");
                valueCoin = Integer.parseInt(lineItems[1]);
                list.remove(indexToRemove);

                if(valueCoin % 2 == 0){
                    if(indexToRemove <= list.size() - 1){
                        index = indexToRemove;
                    }else{
                        index = 0;
                    }
                }else{
                    if(indexToRemove == 0){
                        index = list.size() - 1;
                    }else{
                        index = indexToRemove - 1;
                    }
                }
            }

            System.out.println("Vencedor(a): " + list.get(0).split(" ")[0]);

            list.clear();
            n = Integer.parseInt(scanner.next());
        }
        scanner.close();
    }
}