//Elabore um algoritmo que leia 5 n�meros do teclado e preencha um vetor de
//acordo com a seguinte regra: com exce��o do 1� n�mero, s� � permitido armazenar
//um n�mero se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o pr�ximo
//valor lido s� poder� ser maior que 5.

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o 1� n�mero: ");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o pr�ximo n�mero: ");
            int numero = scanner.nextInt();

            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("N�mero inv�lido. O pr�ximo n�mero deve ser maior que o anterior.");
                i--;
            }
        }

        System.out.println("Vetor preenchido:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
