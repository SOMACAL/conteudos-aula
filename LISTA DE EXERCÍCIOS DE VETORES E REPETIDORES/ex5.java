
//Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
//Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes
//que o número n aparece no vetor.
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                count++;
            }
        }

        System.out.println("O número " + n + " aparece " + count + " vezes no vetor.");
    }
}
