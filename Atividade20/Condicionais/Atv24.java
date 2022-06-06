import java.util.Scanner;

public class Atv24 {
    
    public static void main (String[]args) {

        // 24 - Um zoológico muito louco
        // Escreva um programa que leia a idade de 2 javalis e 2 girafas (considere que a idade dos javalis será sempre 
        // diferente, assim como das girafas ). Calcule e escreva a soma das idades do javali mais velho com a girafa 
        // mais nova, e o produto das idades do javali mais novo com a girafa mais velha.

        Scanner in = new Scanner(System.in);

        int javali = 0;
        int girafa = 0;
        int maiorJ = 0;
        int menorJ = 0;
        int maiorG = 0;
        int menorG = 0;

        for (int cont = 1; cont <= 2; cont++) {
            System.out.println("Digite a idade do Javali: ");  
            int idadeJ = in.nextInt();

            if (cont == 1) {
                maiorJ = idadeJ;
                menorJ = idadeJ;
            } else if (idadeJ > maiorJ) {
                maiorJ = idadeJ;
            } else if (idadeJ < menorJ) {
                menorJ = idadeJ;
            }
        }
        for (int cont2 = 1; cont2 <= 2; cont2++) {
            System.out.println("Digite a idade do Girafa: ");  
            int idadeG = in.nextInt();

            if (cont2 == 1) {
                maiorG = idadeG;
                menorG = idadeG;
            } else if (idadeG > maiorG) {
                maiorG = idadeG;
            } else if (idadeG < menorG) {
                menorG = idadeG;
            }
        }
        System.out.println("O Javali mais velho tem a idade " + maiorJ);
        System.out.println("O Javali mais novo tem a idade " + menorJ);
        System.out.println("A girafa mais velha tem a idade " + maiorG);
        System.out.println("A girafa mais nova tem a idade " + menorG);
        in.close();
    }
}
