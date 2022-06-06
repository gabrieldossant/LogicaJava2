import java.util.Scanner;

public class Atv4 {
    public static void main (String[]args) {

        //4.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números 
        //informados e escreva a média aritmética desses valores lidos.

        Scanner in = new Scanner(System.in);

        int cont = 1;
        int soma = 0;

        while (cont <= 10) {
            System.out.println("Digite o " + cont + " número: ");
            int num = in.nextInt();
            cont++;
            soma += num;
        }
        double media = (soma/cont);
            System.out.println("A soma dos valores é " + soma);
            System.out.println("A media aritmetica e " + media);
            in.close();
    } 
} 