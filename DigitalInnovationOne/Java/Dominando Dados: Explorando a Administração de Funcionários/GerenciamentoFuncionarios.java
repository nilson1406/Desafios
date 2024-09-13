/*
Dominando Dados: Explorando a Administração de Funcionários
1 / 3 - Gerenciamento de Funcionários

Intermediário - Princípios Básicos

Descrição

Você está desenvolvendo um sistema de banco de dados para gerenciar funcionários de uma empresa. 
Cada funcionário tem um ID, nome e cargo. Crie um programa que adicione funcionários a uma "tabela" (lista) 
e liste todos os funcionários ordenados pelo ID.

Entrada

1. Um número inteiro n representando a quantidade de funcionários.

2. Para cada funcionário, serão fornecidos dois dados:

    - nome (uma string representando o nome do funcionário)

    - cargo (uma string representando o cargo do funcionário)

Saída

    - String contendo todos os funcionários listados em ordem crescente de ID, 
cada um em uma linha no formato: "ID: Nome - Cargo"

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|---------------------------------------------------|
| Exemplos de Entrada | Exemplos de Saída           |
|---------------------------------------------------|
| 2                   | 1: Mariana - Desenvolvedora |
| Mariana             | 2: Samuel - Analista        |
| Desenvolvedora      |                             |
| Samuel              |                             |
| Analista            |                             |
|---------------------------------------------------|
| 3                   | 1: Simone - Gerente         |
| Simone              | 2: Victor - Desenvolvedor   |
| Gerente             | 3: Ana - Analista           |
| Victor              |                             |
| Desenvolvedor       |                             |
| Ana                 |                             |
| Analista            |                             |
|---------------------------------------------------|
| 3                   | 1: Patricia - Coordenadora  |
| Patricia            | 2: Fabio - Arquiteto        |
| Coordenadora        | 3: Marcelo - Gerente        |
| Fabio               |                             |
| Arquiteto           |                             |
| Marcelo             |                             |
| Gerente             |                             |
|---------------------------------------------------|


*/

import java.util.*;

public class GerenciamentoFuncionarios {
    static class Funcionario {
        int id;
        String nome;
        String cargo;

        Funcionario(int id, String nome, String cargo) {
            this.id = id;
            this.nome = nome;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return (id + 1) + ": " + nome + " - " + cargo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            String nome = scanner.nextLine();
            String cargo = scanner.nextLine();

            funcionarios.add(new Funcionario(i, nome, cargo));

        }

        scanner.close();

        Collections.sort(funcionarios, Comparator.comparingInt(f -> f.id));
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}