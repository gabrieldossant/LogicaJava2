import java.util.Scanner;

public class Atv15 {
    
    public static void main (String[]args) {

        // 15 - Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma 
        // mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar 
        // o mês em que ela nasceu).


        Scanner in = new Scanner(System.in);
        int ano_atual = 2022;

        System.out.println("Digite sua data de nascimento: ");
        int nasc = in.nextInt();

        int idade = (ano_atual - nasc);

        if (idade >= 18) {
            System.out.println("Você pode votar! ");
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("Você não pode votar! ");
            System.out.println("Idade: " + idade);
        }
        in.close();
    }
}