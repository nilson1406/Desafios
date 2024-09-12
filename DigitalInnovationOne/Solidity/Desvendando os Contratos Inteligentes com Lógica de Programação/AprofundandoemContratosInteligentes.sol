/*

Desvendando os Contratos Inteligentes com Lógica de Programação
3 / 3 - Aprofundando em Contratos Inteligentes
Básico - Princípios Básicos

Descrição

Contratos Inteligentes são contratos autoexecutáveis com os termos do acordo entre comprador e vendedor sendo diretamente escritos em linhas de código. Neste desafio, você irá identificar e associar termos avançados relacionados a Contratos Inteligentes com suas descrições apropriadas.

Entrada

A entrada consiste em um termo avançado relacionado a Contratos Inteligentes para o qual você deve retornar a descrição. Para este desafio, os seguintes termos são considerados válidos:

    - "DAOs"
    - "DApps"
    - "Solidity"
    - "Oráculos"
    - "Gas Fees"

Saída

A saída esperada é a descrição associada ao termo fornecido como entrada. Aqui estão as possíveis saídas, listadas aleatoriamente, para que você possa analisar e associar corretamente:

    - "Linguagem de programação utilizada nos contratos inteligentes"
    - "Taxas pagas para realizar transações e executar contratos"
    - "Organizações autônomas descentralizadas"
    - "Aplicações descentralizadas que operam em uma rede blockchain"
    - "Entidades que fornecem dados externos aos contratos inteligentes"

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|---------------------------------------------------------------------------------------|
|  Exemplos de Entrada  |                     Exemplos de Saída                         |
|---------------------------------------------------------------------------------------|
|  DAOs                 | Organizações autônomas descentralizadas                       |
|---------------------------------------------------------------------------------------|
|  DApps                | Aplicações descentralizadas que operam em uma rede blockchain |
|---------------------------------------------------------------------------------------|
|  Solidity             | Linguagem de programação utilizada nos contratos inteligentes |
|---------------------------------------------------------------------------------------|

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

 */

# Recebe a Entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber um termo e retornar sua respectiva descrição.
def descrever_termo(termo):
  if termo == "DAOs":
    return "Organizações autônomas descentralizadas"

  # TODO: Preencha corretamente a descrição de cada termo, considerando as condições abaixo e Saídas possíveis:
  elif termo == "Gas Fees":
    return "Taxas pagas para realizar transações e executar contratos"
			
  elif termo == "Oráculos":
    return "Entidades que fornecem dados externos aos contratos inteligentes"

  elif termo == "Solidity":
    return "Linguagem de programação utilizada nos contratos inteligentes"  	    

  elif termo == "DApps":
    return "Aplicações descentralizadas que operam em uma rede blockchain"

print(descrever_termo(entrada))