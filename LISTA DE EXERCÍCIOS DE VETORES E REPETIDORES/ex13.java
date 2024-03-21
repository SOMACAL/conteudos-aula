//Elabore um algoritmo que receba um número n e retorne um vetor com os n
//primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,
//13, 21}

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para a sequência de Fibonacci: ");
        int n = scanner.nextInt();

        // Inicializa o vetor para armazenar os n primeiros termos da sequência de Fibonacci
        int[] fibonacci = new int[n];

        // Gera os primeiros n termos da sequência de Fibonacci
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        // Exibe o vetor com os n primeiros termos da sequência de Fibonacci
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
