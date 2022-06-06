import java.util.Scanner;

public class Atv19 {
    
    public static void main (String[]args) {

        // 19 - Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols 
        // marcados pelo Inter em um GRENAL. Escrever o nome do vencedor. Caso não haja vencedor deverá 
        // ser impressa a palavra EMPATE.

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de gols marcados pelo Grêmio: ");
        int gremio = in.nextInt();
        System.out.println("Digite o número de gols marcados pelo Inter: ");
        int inter = in.nextInt();

        if (gremio > inter) {
            System.out.println("GRÊMIO VENCEDOR:  " + gremio);
        } else if (gremio < inter) {
            System.out.println("INTER VENCEDOR: " + inter);
        } else if(gremio == inter) {
            System.out.println("EMPATE");
        }
        in.close();
    }
}