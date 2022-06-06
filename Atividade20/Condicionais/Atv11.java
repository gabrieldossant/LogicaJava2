import java.util.Scanner;

public class Atv11 {
    
    public static void main (String[]args) {

        // 11 - Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
        // Sabendo-se que o preço do combustível é de R$ 2,90, escreva um programa para ler: 
        // a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o 
        // número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. 
        // Sabendo que o carro desse taxista roda 14 kilômetros por litro de gasolina, crie um 
        // programa que calcule e escreva: a média do consumo em Km/L e o lucro (líquido) do dia.

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