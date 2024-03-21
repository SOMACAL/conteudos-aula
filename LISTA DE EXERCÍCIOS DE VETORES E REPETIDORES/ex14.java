//Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione
//o maior elemento na última posição do vetor. Nenhum número do vetor pode ser
//apagado ou duplicado. Apresente o vetor atualizado na tela

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o vetor com 5 elementos
        int[] vetor = new int[5];

        // Pede ao usuário para inserir os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento: ");
            vetor[i] = scanner.nextInt();
        }

        // Encontra o índice do maior elemento do vetor
        int indiceMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        // Move o maior elemento para a última posição do vetor
        int temp = vetor[4];
        vetor[4] = vetor[indiceMaior];
        vetor[indiceMaior] = temp;

        // Exibe o vetor atualizado
        System.out.println("Vetor atualizado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
