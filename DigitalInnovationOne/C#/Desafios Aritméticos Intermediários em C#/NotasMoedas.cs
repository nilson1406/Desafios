/* 

Desafios Aritméticos Intermediários em C#
1 / 3 - Notas e Moedas

Intermediário - Princípios Básicos

Desafio
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor 
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor 
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas 
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas 
necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, 
conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

|---------------------------------------------------------------|
|       Exemplos de Entrada     |       Exemplos de Saída       |
|---------------------------------------------------------------|
|              576.73           |       NOTAS:                  |
|                               |       5 nota(s) de R$ 100.00  |
|                               |       1 nota(s) de R$ 50.00   |
|                               |       1 nota(s) de R$ 20.00   |
|                               |       0 nota(s) de R$ 10.00   |
|                               |       1 nota(s) de R$ 5.00    |
|                               |       0 nota(s) de R$ 2.00    |
|                               |       MOEDAS:                 |
|                               |       1 moeda(s) de R$ 1.00   |
|                               |       1 moeda(s) de R$ 0.50   |
|                               |       0 moeda(s) de R$ 0.25   |
|                               |       2 moeda(s) de R$ 0.10   |
|                               |       0 moeda(s) de R$ 0.05   |
|                               |       3 moeda(s) de R$ 0.01   |
|---------------------------------------------------------------|
|              4.00             |       NOTAS:                  |
|                               |       0 nota(s) de R$ 100.00  |
|                               |       0 nota(s) de R$ 50.00   |
|                               |       0 nota(s) de R$ 20.00   |
|                               |       0 nota(s) de R$ 10.00   |
|                               |       0 nota(s) de R$ 5.00    |
|                               |       2 nota(s) de R$ 2.00    |
|                               |       MOEDAS:                 |
|                               |       0 moeda(s) de R$ 1.00   |
|                               |       0 moeda(s) de R$ 0.50   |
|                               |       0 moeda(s) de R$ 0.25   |
|                               |       0 moeda(s) de R$ 0.10   |
|                               |       0 moeda(s) de R$ 0.05   |
|                               |       0 moeda(s) de R$ 0.01   |
|---------------------------------------------------------------|
|              91.01            |       NOTAS:                  |
|                               |       0 nota(s) de R$ 100.00  |
|                               |       1 nota(s) de R$ 50.00   |
|                               |       2 nota(s) de R$ 20.00   |
|                               |       0 nota(s) de R$ 10.00   |
|                               |       0 nota(s) de R$ 5.00    |
|                               |       0 nota(s) de R$ 2.00    |
|                               |       MOEDAS:                 |
|                               |       1 moeda(s) de R$ 1.00   |
|                               |       0 moeda(s) de R$ 0.50   |
|                               |       0 moeda(s) de R$ 0.25   |
|                               |       0 moeda(s) de R$ 0.10   |
|                               |       0 moeda(s) de R$ 0.05   |
|                               |       1 moeda(s) de R$ 0.01   |
|---------------------------------------------------------------|

*/


using System; 
class NotasMoedas {
    static void Main(string[] args) { 

        decimal value;

        value = decimal.Parse(Console.ReadLine());

        Console.WriteLine("NOTAS:");
        Console.WriteLine("{0} nota(s) de R$ 100.00", (int) value / 100);

        value = value % 100;
        Console.WriteLine("{0} nota(s) de R$ 50.00", (int) value / 50);

        value = value % 50;
        Console.WriteLine("{0} nota(s) de R$ 20.00", (int) value / 20);

        value = value % 20;
        Console.WriteLine("{0} nota(s) de R$ 10.00", (int) value / 10);

        value = value % 10;
        Console.WriteLine("{0} nota(s) de R$ 5.00", (int) value / 5);

        value = value % 5;
        Console.WriteLine("{0} nota(s) de R$ 2.00", (int) value / 2);

        value = value % 2;
        value = value * 100;

        Console.WriteLine("MOEDAS:");
        Console.WriteLine("{0} moeda(s) de R$ 1.00", (int) value / 100);

        value = value % 100;
        Console.WriteLine("{0} moeda(s) de R$ 0.50", (int) value / 50);

        value = value % 50;
        Console.WriteLine("{0} moeda(s) de R$ 0.25", (int) value / 25);

        value = value % 25;
        Console.WriteLine("{0} moeda(s) de R$ 0.10", (int) value / 10);

        value = value % 10;
        Console.WriteLine("{0} moeda(s) de R$ 0.05", (int) value / 5);

        value = value % 5;
        Console.WriteLine("{0} moeda(s) de R$ 0.01", (int) value);

    }

}