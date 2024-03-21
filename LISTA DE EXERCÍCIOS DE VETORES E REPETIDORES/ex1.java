//Construa um programa que leia em um vetor uma sequência de 5 números digitados
//pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais
//ou superiores à média.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o vetor com 5 elementos
        double[] vetor = new double[5];

        // Pede ao usuário para digitar os números e os armazena no vetor
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double num : vetor) {
            soma += num;
        }
        double media = soma / vetor.length;

        double[] menores = new double[5];
        double[] iguais = new double[5];
        double[] superiores = new double[5];

        int menorIndex = 0, igualIndex = 0, superiorIndex = 0;
        for (double num : vetor) {
            if (num < media) {
                menores[menorIndex++] = num;
            } else if (num == media) {
                iguais[igualIndex++] = num;
            } else {
                superiores[superiorIndex++] = num;
            }
        }

        // Apresenta os resultados na tela
        System.out.println("\nMédia: " + media);
        System.out.print("Valores menores que a média: ");
        for (int i = 0; i < menorIndex; i++) {
            System.out.print(menores[i] + " ");
        }
        System.out.println();
        System.out.print("Valores iguais à média: ");
        for (int i = 0; i < igualIndex; i++) {
            System.out.print(iguais[i] + " ");
        }
        System.out.println();
        System.out.print("Valores superiores à média: ");
        for (int i = 0; i < superiorIndex; i++) {
            System.out.print(superiores[i] + " ");
        }
    }
}
