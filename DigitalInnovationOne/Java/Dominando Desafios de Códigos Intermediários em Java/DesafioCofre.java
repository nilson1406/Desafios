/*

Dominando Desafios de Códigos Intermediários em Java
5 / 5 - Cofres Seguros: Dominando o Encapsulamento e Abstração
Intermediário - Paradigmas

Descrição

Você foi contratado para desenvolver um sistema de cofres seguros. O objetivo é criar dois tipos de cofres: um Cofre Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.

Entrada

O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: "digital" ou "físico". Se for escolhido o tipo "digital", o programa irá solicitar a senha e a confirmação de senha do cofre digital (ambas com apenas números). Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.

Saída

O programa irá exibir as informações do cofre criado. Para o Cofre Digital, será exibido o tipo e o método de abertura (senha). Para o Cofre Físico, será exibido apenas o tipo e o método de abertura (chave).

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.
Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|---------------------------------------------------------------|
|       Exemplos de Entrada     |       Exemplos de Saída       |
|---------------------------------------------------------------|
|               digital         |      Tipo: Cofre Digital      |
|               12345           |      Metodo de abertura: Senha|
|               1234            |      Senha incorreta!         |
|---------------------------------------------------------------|
|               fisico          |      Tipo: Cofre Fisico       |
|                               |      Metodo de abertura: Chave|
|---------------------------------------------------------------|
|               digital         |      Tipo: Cofre Digital      |
|               2525            |      Metodo de abertura: Senha|
|               2525            |      Cofre aberto!            |
|---------------------------------------------------------------|

 */


import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class DesafioCofre {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      CofreDigital cofreDigital = new CofreDigital(scanner.nextInt());
      cofreDigital.imprimirInformacoes();
      if(cofreDigital.validarSenha(scanner.nextInt())){
        System.out.println("Cofre aberto!");
      }else{
        System.out.println("Senha incorreta!");
      }      
    }else if(tipoCofre.equalsIgnoreCase("fisico")){
      Cofre cofre = new CofreFisico();
      cofre.imprimirInformacoes();
    }
  }
}