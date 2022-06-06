import java.util.Scanner;

public class Atv8 {
    public static void main (String[]args) {

        // 8. Faça um programa que leia 10 números informados pelo usuário e ao final da leitura 
        // escrever a soma total dos 10 números lidos.

        Scanner in = new Scanner(System.in);
        int num = 0;
        int soma = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Digite o " + cont + " número: ");
            num = in.nextInt();
            soma += num;
        }
        System.out.println("Os soma dos 10 numeros digitados são: " + soma);
        in.close();
    } 
}