import java.util.Scanner;

public class Atv20 {
    
    public static void main (String[]args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de lados: ");
        int lados = in.nextInt();
        
        if (lados > 5) {
            System.out.println("POLIGONO NAO IDENTIFICADO ");
        } else if (lados < 3) {
            System.out.println("NAO E UM POLIGONO ");
        } else if(lados == 3) {
            System.out.println("TRIANGULO");
        } else if(lados == 4) {
            System.out.println("QUADRADO");
        } else if(lados == 5) {
            System.out.println("PENTAGONO");
        }
        in.close();
    }
}