//Escreva um algoritmo que leia em um vetor uma sequ�ncia finita de n�meros
//digitados pelo usu�rio e, logo ap�s, mostre o n�mero de cada posi��o do vetor e se
//ele � positivo, negativo ou zero.
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pede ao usu�rio para digitar o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o n�mero para a posi��o " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Mostra se cada n�mero do vetor � positivo, negativo ou zero
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("O n�mero " + vetor[i] + " na posi��o " + i + " � positivo.");
            } else if (vetor[i] < 0) {
                System.out.println("O n�mero " + vetor[i] + " na posi��o " + i + " � negativo.");
            } else {
                System.out.println("O n�mero " + vetor[i] + " na posi��o " + i + " � zero.");
            }
        }
    }
}
