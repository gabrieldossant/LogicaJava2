import java.util.Scanner;

public class Atv5 {

    public static void main (String[]args) {

        // 5. Faça um programa que leia dois valores informados pelo usuário e exiba uma das três 
        // mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, 
        // caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = in.nextInt();

        if (n1 == n2) {
            System.out.println("Os números digitados são iguais. ");
        } else if (n1 > n2) {
            System.out.println("O primeiro numero digitado " + n1 + " é maior que o segundo " + n2);
        } else if (n1 < n2) {
            System.out.println("O segundo numero digitado " + n2 + " é maior que o primeiro " + n1);
        } in.close();
    }
}