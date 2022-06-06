import java.util.Scanner;

public class Atv23 {
    
    public static void main (String[]args) {

        // 23 - Faça um programa em que o usuário informe 20 valores e no final, escreva o maior e o menor valor lido.

        Scanner in = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int cont = 1; cont <= 20; cont++) {
            System.out.println("Digite um numero: ");  
            int num = in.nextInt();
            if (cont == 1) {
                maior = num;
                menor = num;
            } else if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior numero digitado foi " + maior);
        System.out.println("O menor numero digitado foi " + menor);
        in.close();
    }
}
