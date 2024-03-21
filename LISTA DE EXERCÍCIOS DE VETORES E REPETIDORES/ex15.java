//Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
//acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar
//um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo
//valor lido só poderá ser maior que 5.

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o 1º número: ");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo número: ");
            int numero = scanner.nextInt();

            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. O próximo número deve ser maior que o anterior.");
                i--;
            }
        }

        System.out.println("Vetor preenchido:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
