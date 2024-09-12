/*

Dominando Desafios de Códigos Intermediários em Java
2 / 5 - Registro de Transações Bancárias com Stream API
Intermediário - Princípios Básicos

Descrição

Você está aprimorando o programa anterior e agora deseja utilizar a Stream API do Java para processar as transações bancárias de forma mais eficiente.

Entrada

    - O programa solicitará ao usuário que informe o saldo inicial da conta.
    - Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

 Entrada de Transações:
    - Para cada transação, o programa solicitará ao usuário:
        - O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
        - O valor da transação.

Saída

    - Utilizando a Stream API, o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
    - Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|---------------------------------------------------------------|
|       Exemplos de Entrada     |       Exemplos de Saída       |
|---------------------------------------------------------------|
|               100             |      Saldo : 90.0             |
|               2               |      Transacoes:              |
|               d               |      d de 10.0                |
|               10              |      s de 20.0                |
|               s               |                               |
|               20              |                               |
|---------------------------------------------------------------|
|               5000            |      Saldo : 5500.0           |
|               1               |      Transacoes:              |
|               d               |      d de 500.0               |
|               500             |                               |
|---------------------------------------------------------------|

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
          
            char tipoTransacao = scanner.next().toLowerCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);
            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'd') {
                saldo += valorTransacao;                
            } else if (transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }            
        }

        System.out.println("Saldo : " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> String.format("%s de %.1f", transacao.getTipo(), transacao.getValor()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}