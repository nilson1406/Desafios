/* 

Iniciando a programar em C#
1 / 3 - Dividindo X por Y 

Básico - Princípios Básicos

Desafio
Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado 
da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao 
impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores 
inteiros (X e Y) que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, 
ou “divisao impossivel” caso não seja possível efetuar o cálculo.

|---------------------------------------------------------------|
|       Exemplos de Entrada     |       Exemplos de Saída       |
|---------------------------------------------------------------|
|               3               |                               |
|               3 -2            |      -1.5                     |
|               -8 0            |      divisao impossivel       |
|               0 8             |      0.0                      |
|---------------------------------------------------------------|

*/


using System;

class DividindoXPorY  {
    static void Main() {
        int n = Int32.Parse(Console.ReadLine());
        for (int i = 0; i < n; i++) 
        {
            string[] line = Console.ReadLine().Split(" ");
            double x = double.Parse(line[0]);
            double y = double.Parse(line[1]);
            if (y == 0) {
                Console.WriteLine("divisao impossivel");
            } else {
                double div = x / y;
                Console.WriteLine(div.ToString("N1"));
            }
        }
    }
}