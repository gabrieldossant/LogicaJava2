import java.util.Scanner;

public class Atv16 {
    
    public static void main (String[]args) {

        // 16 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 
        // se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas 
        // (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de maças compradas: ");
        double qnt = in.nextInt();

        if (qnt < 12) {
            System.out.println("O valor total da compra de maçãs = R$" + (qnt * 0.30) + " reais. ");
        } else {
            System.out.println("O valor total da compra de maçãs = R$" + (qnt * 0.25) + " reais | DESCONTO DE 0.25 EM CADA MAÇÃ |");
        }
        in.close();
    }
}