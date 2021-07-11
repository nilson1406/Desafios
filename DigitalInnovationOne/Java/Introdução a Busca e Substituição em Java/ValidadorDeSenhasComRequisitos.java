//Introdução a Busca e Substituição em Java
//3 / 5 - Validador de senhas com requisitos
//Desafio
//Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e
// pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso
// você deve atentar aos requisitos a seguir:
//
//A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
//A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
//Além disso, a senha pode ter de 6 a 32 caracteres.
//Entrada
//A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S,
// correspondente a senha que é inserida pelo usuário no momento do cadastro.
//
//Saída
//A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos
// solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.
//
//|---------------------------------------------------------------|
//|       Exemplos de Entrada     |       Exemplos de Saída       |
//|---------------------------------------------------------------|
//|     Digital Innovation One    |       Senha invalida.         |
//|---------------------------------------------------------------|
//|           AbcdEfgh99          |       Senha valida.           |
//|---------------------------------------------------------------|
//|     DigitalInnovationOne123   |       Senha valida.           |
//|---------------------------------------------------------------|
//| Digital Innovation One 1233   |       Senha invalida.         |
//|---------------------------------------------------------------|
//|             Aass9             |       Senha invalida.         |
//|---------------------------------------------------------------|
//|            Aassd9             |       Senha valida.           |
//|---------------------------------------------------------------|

import java.util.Arrays;
import java.util.Scanner;

public class ValidadorDeSenhasComRequisitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String password = scanner.nextLine();

            if (password.length() >= 6 && password.length() <= 32) {
                boolean lowerCase = Arrays.stream(password.split("")).anyMatch(s -> s.matches("[a-z]"));
                boolean upperCase = Arrays.stream(password.split("")).anyMatch(s -> s.matches("[A-Z]"));
                boolean accentSpacesSpecial = Arrays.stream(password.split("")).allMatch(s -> s.matches("[A-Za-z0-9]"));
                if (lowerCase && upperCase && accentSpacesSpecial) {
                    System.out.println("Senha valida.");
                } else {
                    System.out.println("Senha invalida.");
                }
            }else{
                System.out.println("Senha invalida.");
            }
        }

    }

}
