/*

Explorando NFTs com Lógica de Programação
1 / 3 - Explorando o Mundo dos NFTs e Criptomoedas
Básico - Princípios Básicos

Descrição

O mundo dos NFTs e das criptomoedas é vasto e complexo, oferecendo várias características e benefícios. Para este desafio, você deve associar termos específicos relacionados a NFTs e criptomoedas com suas descrições corretas.

Entrada

A entrada consiste em um termo relacionado a NFTs ou criptomoedas para o qual você deve retornar a descrição. Neste contexto, os seguintes termos são considerados válidos para este desafio de codificação:

    - "Tokenization"
    - "Blockchain"
    - "Smart Contracts"
    - "Decentralization"

Saída

A saída esperada é a descrição associada ao termo fornecido como entrada. Aqui estão as possíveis saídas, listadas aleatoriamente, para você analisar e associar corretamente:

    - "Habilita transações seguras e à prova de adulterações"
    - "Converte ativos em tokens digitais"
    - "Remove autoridades centrais e devolve o controle aos usuários"
    - "Programas autoexecutáveis que operam em blockchains"

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|-------------------------------------------------------------------------------|
|  Exemplos de Entrada  |                     Exemplos de Saída                 |
|-------------------------------------------------------------------------------|
|  Tokenization         | Converte ativos em tokens digitais                    |
|-------------------------------------------------------------------------------|
|  Blockchain           | Habilita transações seguras e à prova de adulterações |
|-------------------------------------------------------------------------------|
|  Smart Contracts      | Programas autoexecutáveis que operam em blockchains   |
|-------------------------------------------------------------------------------|

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

 */

# Recebe a Entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber um termo e retornar sua respectiva descrição.		
def descrever_termo(termo):
	if termo == "Tokenization":
			return "Converte ativos em tokens digitais"
			
	# TODO: Preencha corretamente a descrição de cada termo, considerando as condições abaixo e Saídas possíveis:		
	elif termo == "Blockchain":
	    return "Habilita transações seguras e à prova de adulterações"
	    
	elif termo == "Smart Contracts":
	    return "Programas autoexecutáveis que operam em blockchains"
	    	    	
	elif termo == "Decentralization":
	    return "Remove autoridades centrais e devolve o controle aos usuários"
	    
print(descrever_termo(entrada))