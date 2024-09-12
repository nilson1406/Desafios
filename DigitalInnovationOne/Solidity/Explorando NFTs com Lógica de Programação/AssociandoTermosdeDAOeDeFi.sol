/*

Explorando NFTs com Lógica de Programação
3 / 3 - Associando Termos de DAO e DeFi
Básico - Princípios Básicos

Descrição

Organizações Autônomas Descentralizadas (DAO) são organizações geridas por código e governadas por seus membros, sem a necessidade de uma autoridade central. Finanças Descentralizadas (DeFi) é um termo para serviços financeiros construídos em tecnologia blockchain que operam sem intermediários centralizados, como bancos ou seguradoras. Neste desafio, você irá associar termos comumente usados em DAOs e DeFi aos seus significados ou funções corretos.

Entrada

A entrada consiste em um termo para o qual você deve determinar a associação correta. Os seguintes termos são considerados válidos:

    - "Governança"
    - "Liquidity Pool"
    - "Yield Farming"
    - "Token Governance"

Saída

A saída esperada é a associação correta para o termo fornecido como entrada. Cada termo está associado a apenas uma definição ou função. Aqui estão as possíveis saídas, listadas aleatoriamente, para você analisar e associar corretamente:

    - "Tokens que representam o poder de voto dos membros em uma DAO"
    - "Estratégia para aumentar o retorno de investimentos em DeFi"
    - "Membros de uma DAO votam em propostas para tomar decisões"
    - "Fundo coletivo bloqueado em um contrato inteligente"

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|------------------------------------------------------------------------------------|
|  Exemplos de Entrada | Exemplos de Saída                                           |
|------------------------------------------------------------------------------------|
|  Governança          | Membros de uma DAO votam em propostas para tomar decisões   |
|------------------------------------------------------------------------------------|
|  Liquidity Pool      | Fundo coletivo bloqueado em um contrato inteligente         |
|------------------------------------------------------------------------------------|
|  Yield Farming       | Estratégia para aumentar o retorno de investimentos em DeFi |
|------------------------------------------------------------------------------------|

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

 */

# Recebe a Entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber um termo e retornar sua respectiva descrição.		
def descrever_termo(termo):
  if termo == "Governança":
    return "Membros de uma DAO votam em propostas para tomar decisões"

  # TODO: Preencha corretamente a descrição de cada termo, considerando as condições abaixo e Saídas possíveis:		
  elif termo == "Liquidity Pool":
    return "Fundo coletivo bloqueado em um contrato inteligente"

  elif termo == "Yield Farming":
    return "Estratégia para aumentar o retorno de investimentos em DeFi"

  elif termo == "Token Governance":
    return "Tokens que representam o poder de voto dos membros em uma DAO"

print(descrever_termo(entrada))