import java.util.Scanner;

public class Atv25 {
    
    public static void main (String[]args) {

        // 25 - Uma micro calculadora
        // Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem
        // executadas (codificada da seguinte forma: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação).
        // O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. Observação: Considere
        // que só serão lidos os valores 1, 2, 3 ou 4 para as operações

        Scanner in = new Scanner(System.in);

        System.out.println("| [1] Adição | [2] Subtração | [3] Divisão | [4] Multiplicação |");
        int operadores = in.nextInt();
        double resultado = 0;

        switch (operadores) {
            case 1:
                System.out.println("Digite um número que deseja somar: ");
                double n1 = in.nextInt();
                System.out.println("Digite outro número para fazer a soma: ");
                double n2 = in.nextInt();
                resultado = n1 + n2;
                System.out.println(resultado);
                break;
            case 2:
                System.out.println("Digite um número que deseja subtrair: ");
                double v1 = in.nextInt();
                System.out.println("Digite outro número para fazer a subtração: ");
                double v2 = in.nextInt();
                resultado = (v1 - v2);
                System.out.println(resultado);
                break;
            case 3:
                System.out.println("Digite um número que deseja dividir: ");
                double d1 = in.nextInt();
                System.out.println("Digite outro número para fazer a divisao: ");
                double d2 = in.nextInt();
                resultado = (d1 / d2);
                System.out.println(resultado);
                break;
            case 4:
                System.out.println("Digite um número que deseja multiplicar: ");
                double m1 = in.nextInt();
                System.out.println("Digite outro número para fazer a multiplicação: ");
                double m2 = in.nextInt();
                resultado = (m1 * m2);
                System.out.println(resultado);
                break;
        }
        if (operadores > 4) {
            System.out.println("Função inexistente.");
        }
        in.close();
    }
}
