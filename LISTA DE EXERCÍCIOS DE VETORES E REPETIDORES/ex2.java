//Escreva um algoritmo que leia em um vetor uma sequência finita de números
//digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se
//ele é positivo, negativo ou zero.
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Mostra se cada número do vetor é positivo, negativo ou zero
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é negativo.");
            } else {
                System.out.println("O número " + vetor[i] + " na posição " + i + " é zero.");
            }
        }
    }
}
