import java.util.Scanner;

public class Atv5 {
    public static void main (String[]args) {

        // 5 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e 
        // escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o 
        // aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

        Scanner in = new Scanner(System.in);

        int soma = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;

        for (int cont = 1; cont <= 4; cont++) {
            System.out.println("Digite a nota da " + cont + " avaliação: ");
            int num = in.nextInt();
                if (cont == 1) {
                    n1 = num;
                    soma += num;
                } else if (cont == 2) {
                    n2 = num;
                    soma += num;
                } else if (cont == 3) {
                    n3 = num;
                    soma += num;
                } else if (cont == 4) {
                    n4 = num;
                    soma += num;
                }
        };
        int media = (soma/4);
        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado! Suas notas abaixo foram: ");
            System.out.println("Nota da AV1: " + n1);
            System.out.println("Nota da AV2: " + n2);
            System.out.println("Nota da AV3: " + n3);
            System.out.println("Nota da AV4: " + n4);
            System.out.println("A soma das notas é " + soma);
            System.out.println("A media aritmetica e " + media);
        } else if (media < 6.0) {
            System.out.println("Reprovado! Suas notas foram: ");
            System.out.println("Nota da AV1: " + n1);
            System.out.println("Nota da AV2: " + n2);
            System.out.println("Nota da AV3: " + n3);
            System.out.println("Nota da AV4: " + n4);
            System.out.println("A soma das notas é " + soma);
            System.out.println("A media aritmetica e " + media);
        }
        in.close();
    }
} 