import java.util.Scanner;

public class Atv7 {
    public static void main (String[]args) {

        // 7. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, 
        // o último e o maior de todos eles (considere que todos os números informados serão diferentes)

        Scanner in = new Scanner(System.in);

        int primeiro = 0;
        int ultimo = 0;
        int maior = 0;

        for (int cont = 1; cont <= 4; cont++) {
            System.out.println("Digite o " + cont + " numero: ");
            int num = in.nextInt();
            if (cont == 1) {
                primeiro = num;
                maior = num;
            } else if (cont == 4) {
                ultimo = num;
            } else if (maior < num) {
                maior = num;
            }
        }
        System.out.println("O primeiro numero digitado foi " + primeiro);
        System.out.println("O ultimo numero digitado foi " + ultimo);
        System.out.println("O maior numero digitado foi " + maior); in.close();
    } 
}