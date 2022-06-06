import java.util.Scanner;

public class Atv2 {

    public static void main (String[]args) {

        // 2. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = in.nextInt();

        if (num > 0) {
            System.out.println("O numero e positivo ");
        }
        if (num < 0) {
            System.out.println("O numero e negativo ");
        } else {
            System.out.println("O numero digitado e igual a zero ");
        } in.close();
    }
} 
