//Elabore um programa que leia um vetor de 5 n�meros digitados pelo usu�rio e uma
//vari�vel de um n�mero n qualquer, depois mostre na tela o �ndice dos elementos que
//s�o inferiores a n
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "� n�mero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um n�mero n: ");
        int n = scanner.nextInt();

        System.out.println("�ndices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                System.out.println("�ndice " + i);
            }
        }
    }
}
