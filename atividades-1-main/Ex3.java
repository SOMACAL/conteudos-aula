//Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. 
//Caso os números sejam iguais 
//informarao usuário que a sequência de números informados é inválida
import java.util.Scanner;

public class Ex3 {
    public static void executar3() {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores de A e B
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Verificação e exibição do maior número
        if (a == b) {
            System.out.println("A sequência de números informados é inválida.");
        } else if (a > b) {
            System.out.println("A é o maior número.");
        } else {
            System.out.println("B é o maior número.");
        }
        
        scanner.close();
    }
}