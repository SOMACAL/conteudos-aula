//Crie um programa que leia um vetor A de 5 posi��es e, ao final da leitura, copie
//os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A � o
//�ltimo elemento de B, o segundo elemento de A � o pen�ltimo elemento de B, e assim
//por diante.

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "� elemento: ");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }

        System.out.println("Vetor B (c�pia invertida de A):");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
