
//Elabore um programa que leia 5 n�meros do teclado e os armazene em um vetor.
//Em seguida, leia um n�mero n qualquer e apresente na tela a quantidade de vezes
//que o n�mero n aparece no vetor.
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "� n�mero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um n�mero n: ");
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                count++;
            }
        }

        System.out.println("O n�mero " + n + " aparece " + count + " vezes no vetor.");
    }
}
