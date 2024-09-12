/*

Desvendando os Contratos Inteligentes com Lógica de Programação
2 / 3 - Desvendando os Contratos Inteligentes
Básico - Princípios Básicos

Descrição

Os Contratos Inteligentes (Smart Contracts) são fundamentais no mundo das criptomoedas e NFTs, oferecendo uma maneira automatizada e segura de executar acordos. Para este desafio, você associará termos específicos relacionados a Contratos Inteligentes com suas descrições corretas.

Entrada

A entrada consiste em um termo relacionado a Contratos Inteligentes para o qual você deve retornar a descrição. Neste contexto, os seguintes termos são considerados válidos para este desafio de código:

    - "Automação de Acordos"
    - "Imutabilidade"
    - "Execução Autônoma"
    - "Interoperabilidade"

Saída

A saída esperada é a descrição associada ao termo fornecido como entrada. Aqui estão as possíveis saídas, listadas aleatoriamente, para que você possa analisar e associar corretamente:

    - "Capacidade de interagir e operar com diferentes blockchains e sistemas"
    - "Não pode ser alterado ou modificado após sua criação"
    - "Permite a execução de contratos baseado em eventos pré-definidos"
    - "Executa automaticamente as condições estabelecidas no código do contrato"

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|---------------------------------------------------------------------------------------------|
|  Exemplos de Entrada     |                     Exemplos de Saída                            |
|---------------------------------------------------------------------------------------------|
|  Automação de Acordos    | Permite a execução de contratos baseado em eventos pré-definidos |
|---------------------------------------------------------------------------------------------|
|  Imutabilidade           | Não pode ser alterado ou modificado após sua criação             |
|---------------------------------------------------------------------------------------------|
|  Execução Autônoma       | Executa automaticamente as condições do código do contrato       |
|---------------------------------------------------------------------------------------------|

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

 */

# Recebe a Entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber um termo e retornar sua respectiva descrição.
def descrever_termo(termo):
  if termo == "Automação de Acordos":
    return "Permite a execução de contratos baseado em eventos pré-definidos"
			
	# TODO: Preencha corretamente a descrição de cada termo, considerando as condições abaixo e Saídas possíveis:						  
  elif termo == "":
    return "Capacidade de interagir e operar com diferentes blockchains"
	    
  elif termo == "":
    return "Não pode ser alterado ou modificado após sua criação"
	    	    	
  elif termo == "":
    return "Executa automaticamente as condições do código do contrato"

print(descrever_termo(entrada))