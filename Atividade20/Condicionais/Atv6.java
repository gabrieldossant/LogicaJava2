import java.util.Scanner;

public class Atv6 {

    public static void main (String[]args) {

        // 6.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os 
        // números informados e escreva a média aritmética desses valores lidos.

        Scanner in = new Scanner(System.in);
        int num = 0;
        int soma = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Digite o primeiro número: ");
            num = in.nextInt();
            soma += num;
        }
        int media = (soma/10);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("A media aritmética dos valores: " + media);
        in.close();
    }
}