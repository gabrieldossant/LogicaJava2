import java.util.Scanner;

public class Atv4 {

    public static void main (String[]args) {

        // 4. Faça um programa que leia  3 valores (considere que não serão informados 
        // valores iguais) e escrever a soma dos 2 maiores.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = in.nextInt();

        System.out.println("Digite o terceiro e ultimo número: ");
        int n3 = in.nextInt();

        if (n1 < n2 && n1 < n3) {
            int soma = n2 + n3;
            System.out.println("Os maiores numeros digitados: " +  n2 + " e " + n3 + " e a soma deles é: " + soma);
        } else if (n2 < n1 && n2 < n3) {
            int soma = n1 + n3;
            System.out.println("Os maiores numeros digitados: " + n1 + " e " + n3 + " e a soma deles é: " + soma);
        } else if (n3 < n1 && n3 < n2) {
            int soma = n1 + n2;
            System.out.println("Os maiores numeros digitados: " + n1 + " e " + n2 + " e a soma deles é: " + soma);
        } in.close();
    }
}