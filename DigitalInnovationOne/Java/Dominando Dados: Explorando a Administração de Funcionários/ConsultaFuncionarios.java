/*
Dominando Dados: Explorando a Administração de Funcionários
2 / 3 - Consulta de Funcionários por Departamento

Intermediário - Estrutura de Dados

Descrição

Você está desenvolvendo um sistema de recursos humanos para uma empresa. 
O sistema precisa consultar os funcionários de um determinado departamento. 
Cada funcionário tem um nome, departamento e salário. 
Crie um programa que leia os dados dos funcionários e retorne a lista de funcionários de um departamento específico.

Entrada

1. Um número inteiro n representando a quantidade de funcionários.

2. Para cada funcionário, serão fornecidos:

    - nome (uma string representando o nome do funcionário)

    - departamento (uma string representando o departamento do funcionário)

    - salario (um número decimal representando o salário do funcionário)

3. Uma string departamento_consulta representando o departamento a ser consultado.

Saída

`String` contendo todos os funcionários do departamento consultado, cada um em uma linha no formato: "Nome: - Salario"

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|-------------------------------------------------------|
| Exemplos de Entrada | Exemplos de Saída               |
|-------------------------------------------------------|
| 2                   | Nome: Debora - Salario: 3000.00 |
| Marcos              |                                 |
| TI                  |                                 |
| 2500.50             |                                 |
| Debora              |                                 |
| RH                  |                                 |
| 3000.00             |                                 |
| RH                  |                                 |
|-------------------------------------------------------|
| 3                   | Nome: Alice - Salario: 3500.00  |
| Alice               | Nome: Carlos - Salario: 3200.00 |
| Vendas              |                                 |
| 3500.00             |                                 |
| Bob                 |                                 |
| TI                  |                                 |
| 2800.00             |                                 |
| Carlos              |                                 |
| Vendas              |                                 |
| 3200.00             |                                 |
| Vendas              |                                 |
|-------------------------------------------------------|
| 4                   | Nome: Ana - Salario: 3000.00    |
| Ana                 | Nome: Maria - Salario: 2600.00  |
| TI                  |                                 |
| 3000.00             |                                 |
| Pedro               |                                 |
| Marketing           |                                 |
| 2500.00             |                                 |
| Maria               |                                 |
| TI                  |                                 |
| 2600.00             |                                 |
| Joao                |                                 |
| Financeiro          |                                 |
| 3200.00             |                                 |
| TI                  |                                 |
|-------------------------------------------------------|

*/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsultaFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, List<Funcionario>> departamentoFuncionarios = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String departamento = scanner.nextLine();
            double salario = scanner.nextDouble();
            scanner.nextLine(); 

            departamentoFuncionarios.computeIfAbsent(departamento, k -> new LinkedList<>())
                    .add(new Funcionario(nome, salario));

        }

        String departamentoConsulta = scanner.nextLine();

        List<Funcionario> funcionarios = departamentoFuncionarios.getOrDefault(departamentoConsulta,
                new LinkedList<>());
        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %s - Salario: %.2f\n", f.nome, f.salario);
        }

        scanner.close();
    }
}

class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}