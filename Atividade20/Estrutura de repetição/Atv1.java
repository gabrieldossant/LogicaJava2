import java.util.Scanner;

public class Atv1 {
    public static void main (String[]args) {

        // 1 - Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = in.nextInt();
        
        if (num == 0) {
            System.out.println("O número digitado é igual a ZERO ");
        } else if (num > 0) {
            System.out.println("O número digitado é positivo ");
        } else {
            System.out.println("O número digitado é negativo ");
        }
        in.close();
    }
} 