//escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos
import java.util.Scanner;

public class Ex4 {
    public static void executar4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = scanner.nextDouble();

        double soma = n1 + n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;
        double subtracao = n1 - n2;

        



        System.out.println("A soma é: " + soma);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
        System.out.println("A subtração é: " + subtracao);


        scanner.close();
    }
}
