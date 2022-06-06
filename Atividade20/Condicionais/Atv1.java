import java.util.Scanner;

public class Atv1 {
    
    public static void main (String[]args) {

        // 1. Escreva um programa em que o usuário informe dois números utilizando o "prompt". Então escreva em tela o maior deles.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = in.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número digitado " + n1 + " é maior que o segundo. ");
        } else {
            System.out.println("O segundo número digitado " + n2 + " é maior que o primeiro. ");
        }
    }
}