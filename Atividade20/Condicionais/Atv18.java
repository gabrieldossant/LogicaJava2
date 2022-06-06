import java.util.Scanner;

public class Atv18 {
    
    public static void main (String[]args) {

        // 18 - Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino)
        //  de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
        // para homens: (72.7 * h) - 58
        // para mulheres: (62.1 * h) - 44.7


        Scanner in = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = in.nextInt();
        System.out.println("Qual o seu sexo? ");
        System.out.println("[1] Masculino | [2] Feminino ");
        int sexo = in.nextInt();

        if (sexo == 1) {
            System.out.println("PESO IDEAL: " + ((72.7 * altura)- 58));
        } else if (sexo == 2) {
            System.out.println("PESO IDEAL: " + ((62.1 * altura)- 44.7));
        }
        in.close();
    }
}