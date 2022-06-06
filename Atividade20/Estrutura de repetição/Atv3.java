import java.util.Scanner;

public class Atv3 {
    public static void main (String[]args) {

        // 3. Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

        Scanner in = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int segundo = 0;
        int soma = 0;

        for (int cont = 1; cont <= 3; cont++) {
            System.out.println("Digite " + cont + " número: ");
            int num = in.nextInt();
            if (cont == 1) {
                maior = num;
                menor = num;
                segundo = num;
            } else if (menor > num) {
                menor = num;
            } else if (maior < num) {
                maior = num;
            } else if (cont == 3 && segundo > menor && segundo < maior) {
                segundo = num;
            } 
        }
        soma = (maior + segundo);
        System.out.println("O soma dos valores " + maior +  " e " + segundo + " e igual a " + soma);
        in.close();
    }
}