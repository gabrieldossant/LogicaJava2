import java.util.Scanner;

public class Atv3 {

    public static void main (String[]args) {

        // 3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = in.nextInt();

        System.out.println("Digite o terceiro e ultimo número: ");
        int n3 = in.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " o primeiro numero digitado é o maior. ");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " o segundo numero digitado é o maior. ");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " o terceiro numero digitado é o maior. ");
        } 
        in.close();
    }
}