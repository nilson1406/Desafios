/*

Explorando NFTs com Lógica de Programação
2 / 3 - Identificando os Padrões de Token NFT
Básico - Princípios Básicos

Descrição

NFTs, ou Tokens Não Fungíveis, são ativos digitais que representam a propriedade de itens exclusivos e conteúdo no blockchain. Neste desafio, você irá explorar as características específicas dos padrões de Token Não Fungível (NFT) “ERC-721” e “ERC-1155”. Cada característica listada deve ser associada exclusivamente a um desses padrões.

Entrada

A entrada consiste em uma característica para a qual você deve determinar se ela se aplica ao padrão “ERC-721” ou “ERC-1155”. As seguintes características são consideradas válidas:

    - "Suporta a transferência em massa de diferentes tipos de tokens"
    - "Permite a criação de tokens fungíveis e não fungíveis"
    - "Permite identificadores únicos para cada token"
    - "Exige que cada token seja único e não divisível"

Saída

A saída esperada é o padrão de token NFT associado à característica fornecida como entrada. Cada característica está associada a apenas um padrão.

    - "ERC-721"
    - "ERC-1155"

Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|-------------------------------------------------------------------------------------|
|  Exemplos de Entrada                                            | Exemplos de Saída |
|-------------------------------------------------------------------------------------|
|  Suporta a transferência em massa de diferentes tipos de tokens | ERC-1155          |
|-------------------------------------------------------------------------------------|
|  Permite a criação de tokens fungíveis e não fungíveis          | ERC-1155          |
|-------------------------------------------------------------------------------------|
|  Permite identificadores únicos para cada token                 | ERC-721           |
|-------------------------------------------------------------------------------------|

Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

 */

# Recebe a Entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber uma característica e retornar o padrão respectivo.
def identificar_padrao_nft(caracteristica):
	if caracteristica == "Permite identificadores únicos para cada token":
			return "ERC-721"
			
	# TODO: Preencha corretamente o padrão referente a cada característica, considerando as condições abaixo e Saídas possíveis:		
	elif caracteristica == "Suporta a transferência em massa de diferentes tipos de tokens":
	    return "ERC-1155"
	    
	elif caracteristica == "Permite a criação de tokens fungíveis e não fungíveis":
	    return "ERC-1155"
	    	    	
	elif caracteristica == "Exige que cada token seja único e não divisível":
	    return "ERC-721"
	    
print(identificar_padrao_nft(entrada))