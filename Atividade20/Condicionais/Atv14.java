import java.util.Scanner;

public class Atv14 {
    
    public static void main (String[]args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor do odometro no inicio do dia: ");
        int odometro_inicial = in.nextInt();
        System.out.println("Informe o valor do odometro no final do dia:  ");
        int odometro_final = in.nextInt();
        System.out.println("Informe o valor gasto do combustivel: ");
        int combustivel = in.nextInt();
        System.out.println("Informe o valor recebido dos passageiros R$: ");
        int passageiros = in.nextInt();
        int media = (odometro_inicial - odometro_final);
        int liquido = combustivel * 2.90;
        int total = liquido - passageiros;

        System.out.println("A média do combustível foi de " + (media / combustivel));
        System.out.println("O valor líquido é " + tot);
        in.close();
    }
}