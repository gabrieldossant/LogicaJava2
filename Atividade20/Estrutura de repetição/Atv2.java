import java.util.Scanner;

public class Atv2 {
    public static void main (String[]args) {

        // 2. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

        Scanner in = new Scanner(System.in);
        int maior = 0;

        for (int cont = 1; cont <= 3; cont++) {
            System.out.println("Digite " + cont + " número: ");
            int num = in.nextInt();
            if (cont == 1) {
                maior = num;
            } else if (maior < num) {
                maior = num;
            }
        }
        System.out.println("O maior numero digitado foi " + maior);
        in.close();
    }
}