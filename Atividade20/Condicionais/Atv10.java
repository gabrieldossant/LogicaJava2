import java.util.Scanner;

public class Atv10 {
    public static void main (String[]args) {

        // 10. Escreva um programa que calcule a média de quatro números informados pelo usuário, 
        // mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média 
        // for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer 
        // outra situação, ele receberá uma mensagem de "tente novamente"

        Scanner in = new Scanner(System.in);
        int num = 0;
        int soma = 0;
        int fora = 0;

        for (int cont = 1; cont <= 4; cont++) {
            System.out.println("Digite a " + cont + " nota de [0/10]: ");
            num = in.nextInt();
            if (num > 0 && num <= 10) {
                soma += num;
            } else {
                fora++;
            }
        }
        int media = (soma/4);

        if (media > 5) {
            System.out.println("Você passou no teste! Parabéns!");
            System.out.println("Media = " + media);
        } else if (media < 5) {
            System.out.println("Você foi reprovado!");
            System.out.println("Tente novamente! ");
            System.out.println("Media = " + media);
            System.out.println("Numeros fora do limite = " + fora);
        } 
        in.close();
    } 
}