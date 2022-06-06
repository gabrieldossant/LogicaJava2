import java.util.Scanner;

public class Atv22 {
    
    public static void main (String[]args) {

        // 22. A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga 
        // custa R$18.230 e pode ser pago em até 15 vezes sem juros. Crie um programa onde o usuário possa 
        // informar o valor parcelas que deseja pagar e exiba o valor de cada parcela.

        Scanner in = new Scanner(System.in);

        double valor = 18.230;

        System.out.println("| Loja Remi du Fromage |");
        System.out.println("Capacete artesanal para tartaruga | Valor: R$ 18.230,00 |");
        System.out.println("Informe a quantidade de parcelas: (máximo em até 15 vezes) ");
        int parcelas = in.nextInt();
        
        double soma = (valor / parcelas);

        if (parcelas > 15) {
            System.out.println("Não é possível parcelar mais de 15 vezes...");
        }

        System.out.println("Parcelas de " + parcelas + " fica no valor de " + soma);
        in.close();
    }
}
