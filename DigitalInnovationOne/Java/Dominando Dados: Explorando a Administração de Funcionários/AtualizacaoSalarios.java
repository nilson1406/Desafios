/*
Dominando Dados: Explorando a Administração de Funcionários
3 / 3 - Atualização de Salários

Intermediário - Estrutura de Dados

Descrição

Você está desenvolvendo um sistema de recursos humanos para uma empresa. 
O sistema precisa atualizar os salários dos funcionários aplicando um aumento percentual. 
Cada funcionário tem um nome, departamento e salário. Crie um programa que leia os dados 
dos funcionários e aplique um aumento percentual a todos os salários, listando os novos salários.

Cálculo do Novo Salário:

O novo salário de cada funcionário é calculado usando a fórmula: novoSalario = salario * (1 + aumento / 100)

Onde:

    - salario é o salário atual do funcionário.

    - salario é o salário atual do funcionário.

    - aumento é o percentual de aumento fornecido.

    - aumento / 100 converte o percentual em uma fração decimal.

    - 1 + aumento / 100 calcula o fator de multiplicação para o aumento.

    - Multiplicar o salario pelo fator de multiplicação ajusta o valor para incluir o aumento.

Entrada

1. Um número inteiro n representando a quantidade de funcionários.

2. Para cada funcionário, serão fornecidos:

    - nome (uma string representando o nome do funcionário)

    - departamento (uma string representando o departamento do funcionário)

    - salario (um número decimal representando o salário do funcionário)

3. Um número decimal aumento representando o percentual de aumento.

Saída

`String` contendo todos os funcionários com seus novos salários, cada um em uma linha no formato: 
"Nome: X -  Novo Salario: Y". Onde, X representa o nome e Y o salário atualizado com duas casas decimais.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|--------------------------------------------------------------|
| Exemplos de Entrada | Exemplos de Saída                      |
|--------------------------------------------------------------|
| 1                   | Nome: Marianne - Novo Salario: 2200.00 |
| Marianne            |                                        |
| Desenvolvimento     |                                        |
| 2000.00             |                                        |
| 10                  |                                        |
|--------------------------------------------------------------|
| 1                   | Nome: Roberta - Novo Salario: 2250.00  |
| Roberta             |                                        |
| Financeiro          |                                        |
| 1500.00             |                                        |
| 50                  |                                        |
|--------------------------------------------------------------|
| 2                   | Nome: Luiz - Novo Salario: 5760.00     |
| Luiz                | Nome: Anne - Novo Salario: 5040.00     |
| Vendas              |                                        |
| 4800.00             |                                        |
| Anne                |                                        |
| Suporte             |                                        |
| 4200.00             |                                        |
| 20                  |                                        |
|--------------------------------------------------------------|

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizacaoSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine();
            funcionarios.add(new Funcionario(nome, departamento, salario));
        }

        double aumento = scanner.nextDouble();

        for (int i = 0; i < funcionarios.size(); i++) {
            String saida = String.format("Nome: %s - Novo Salario: %.2f", funcionarios.get(i).nome,
                    funcionarios.get(i).salario * (1 + (aumento / 100)));
            System.out.println(saida);
        }

        scanner.close();
    }
}

class Funcionario {
    String nome;
    String departamento;
    double salario;

    Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
}