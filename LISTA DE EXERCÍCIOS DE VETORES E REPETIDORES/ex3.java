//Fa�a um programa que leia em um vetor uma sequ�ncia finita de n�meros digitados
//pelo usu�rio. Crie um segundo vetor que armazene o dobro de cada n�mero do
//primeiro vetor e depois apresente os valores deste vetor.
import java.util.Scanner;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede ao usu�rio para digitar o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

      
        int[] vetorOriginal = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o n�mero para a posi��o " + i + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }


        int[] vetorDobro = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("\nValores do vetor dobrados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posi��o " + i + ": " + vetorDobro[i]);
        }
    }
}
