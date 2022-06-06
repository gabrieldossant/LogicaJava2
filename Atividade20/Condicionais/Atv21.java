import java.util.Scanner;

public class Atv21 {
    
    public static void main (String[]args) {

        // 21 - Escreva um programa que leia as notas das duas avaliações normais e a nota da 
        // avaliação optativa. Calcular a média do semestre considerando que a prova optativa 
        // substitui a nota mais baixa entre as duas primeiras avaliações. Escrever a média e 
        // mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo 
        // com as informações abaixo:

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota da primeira avaliação: ");
        int av1 = in.nextInt();
        System.out.println("Digite a nota da segunda avaliação: ");
        int av2 = in.nextInt();
        System.out.println("Digite a nota da avaliação optativa: ");
        int av0 = in.nextInt();

        int soma = 0;
        int media = 0;

        if (av1 < av2) {
            soma = (av2 + av0);
        }
        if (av1 > av2) {
            soma = (av1 + av0);
        }
        media = (soma/2);
        if (media >= 6) {
            System.out.println("Parabéns! Você foi APROVADO!");
        }
        if (media < 3) {
            System.out.println("REPROVADO!");
        }
        if (media >= 3 && media < 6) {
            System.out.println("Você está de EXAME!");
        }
        in.close();
    }
}