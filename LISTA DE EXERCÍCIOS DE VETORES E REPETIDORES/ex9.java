//Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
//de acordo com as seguintes regras:
//a. Os elementos das posi��es pares de C s�o os elementos das posi��es pares de A;
//b. Os elementos das posi��es �mpares de C s�o os elementos das posi��es �mpares de B;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

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
            if (i % 2 == 0) { // Se a posi��o � par
                vetorC[i] = vetorA[i];
            } else { // Se a posi��o � �mpar
                vetorC[i] = vetorB[i];
            }
        }

        System.out.println("Vetor C (baseado nas regras especificadas):");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
