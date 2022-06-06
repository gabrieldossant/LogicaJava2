import java.util.Scanner;

public class Atv9 {
    public static void main (String[]args) {

        // 9. Faça um programa que leia 6 números que o usuário vai informar. Todos os números 
        // lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada 
        // e também todos valores que o usuário informou.

        Scanner in = new Scanner(System.in);
        int num = 0;
        int soma = 0;

        for (int cont = 1; cont <= 7; cont++) {
            System.out.println("Digite o " + cont + " número: ");
            num = in.nextInt();
            if (num < 72) {
                soma += num;
            }
        }
        System.out.println("Os soma dos valores inferiores a 72 são:" + soma);
        in.close();
    } 
}