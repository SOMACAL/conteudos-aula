//Construa um programa que leia em um vetor uma sequ�ncia de 5 n�meros digitados
//pelo usu�rio, calcule a m�dia e apresente na tela quais valores s�o menores, iguais
//ou superiores � m�dia.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o vetor com 5 elementos
        double[] vetor = new double[5];

        // Pede ao usu�rio para digitar os n�meros e os armazena no vetor
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "� n�mero: ");
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
        System.out.println("\nM�dia: " + media);
        System.out.print("Valores menores que a m�dia: ");
        for (int i = 0; i < menorIndex; i++) {
            System.out.print(menores[i] + " ");
        }
        System.out.println();
        System.out.print("Valores iguais � m�dia: ");
        for (int i = 0; i < igualIndex; i++) {
            System.out.print(iguais[i] + " ");
        }
        System.out.println();
        System.out.print("Valores superiores � m�dia: ");
        for (int i = 0; i < superiorIndex; i++) {
            System.out.print(superiores[i] + " ");
        }
    }
}
