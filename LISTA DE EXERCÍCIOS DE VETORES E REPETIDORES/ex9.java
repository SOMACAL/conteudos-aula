//Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
//de acordo com as seguintes regras:
//a. Os elementos das posições pares de C são os elementos das posições pares de A;
//b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento: ");
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { // Se a posição é par
                vetorC[i] = vetorA[i];
            } else { // Se a posição é ímpar
                vetorC[i] = vetorB[i];
            }
        }

        System.out.println("Vetor C (baseado nas regras especificadas):");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
