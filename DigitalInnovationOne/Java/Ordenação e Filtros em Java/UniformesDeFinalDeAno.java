//Ordenação e Filtros em Java
//3 / 5 - Uniformes de final de ano
//Desafio
//O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o
// final do ano. Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor
// do uniforme entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as
// listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor,
// tamanho (P, M ou G) e por último pelo nome.
//
//Entrada
//Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de
// uniformes a serem feitas para aquela turma. As próximas N*2 linhas contém informações de cada um dos
// uniformes (serão duas linhas de informação para cada uniforme). A primeira linha irá conter o nome
// do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um
// espaço e pelo tamanho do uniforme "P" "M" ou "G". A entrada termina quando o valor de N for igual a
// zero (0) e esta valor não deverá ser processado.
//
//Saída
//Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente,
// seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o
// exemplo abaixo.
//
//|-----------------------------------------------------------------------------------------------|
//|                 Exemplos de Entrada                |            Exemplos de Saída             |
//|-----------------------------------------------------------------------------------------------|
//|                 9                                  |        branco P Cezar Torres Mo          |
//|                 Maria Jose                         |        branco P Maria Jose               |
//|                 branco P                           |        branco M JuJu Mentina             |
//|                 Mangojata Mancuda                  |        branco G Adabi Finho              |
//|                 vermelho P                         |        branco G Severina Rigudinha       |
//|                 Cezar Torres Mo                    |        vermelho P Amaro Dinha            |
//|                 branco P                           |        vermelho P Baka Lhau              |
//|                 Baka Lhau                          |        vermelho P Carlos Chade Losna     |
//|                 vermelho P                         |        vermelho P Mangojata Mancuda      |
//|                 JuJu Mentina                       |                                          |
//|                 branco M                           |                                          |
//|                 Amaro Dinha                        |                                          |
//|                 vermelho P                         |                                          |
//|                 Adabi Finho                        |                                          |
//|                 branco G                           |                                          |
//|                 Severina Rigudinha                 |                                          |
//|                 branco G                           |                                          |
//|                 Carlos Chade Losna                 |                                          |
//|                 vermelho P                         |                                          |
//|                 0                                  |                                          |
//|-----------------------------------------------------------------------------------------------|

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniformesDeFinalDeAno {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        List<Tshirt> tshirts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String owner = br.readLine();
            String[] lineItems = br.readLine().split(" ");
            String color = lineItems[0];
            String size = lineItems[1];
            tshirts.add(new Tshirt(size, color, owner));
        }

        Collections.sort(tshirts);
        tshirts.forEach(System.out::println);

    }
}

class Tshirt implements Comparable<Tshirt> {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }

    @Override
    public int compareTo(Tshirt t) {
        int diff = this.getColor().compareTo(t.getColor());
        if (diff != 0) {
            return diff;
        } else {
            diff = t.getSize().compareTo(this.getSize());
            if (diff != 0) {
                return diff;
            } else {
                return this.getOwner().compareTo(t.getOwner());
            }
        }
    }
}