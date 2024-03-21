// Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a
//concatena��o de A e B, ou seja, C cont�m os elementos de A seguidos dos elementos
//de B.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "� elemento: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "� elemento: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + 5] = vetorB[i];
        }

        System.out.println("Vetor C (concatena��o de A e B):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
