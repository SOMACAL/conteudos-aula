//Faça um programa que leia em um vetor uma sequência finita de números digitados
//pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do
//primeiro vetor e depois apresente os valores deste vetor.
import java.util.Scanner;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

      
        int[] vetorOriginal = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }


        int[] vetorDobro = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("\nValores do vetor dobrados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição " + i + ": " + vetorDobro[i]);
        }
    }
}
