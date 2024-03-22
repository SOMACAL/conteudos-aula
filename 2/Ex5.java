//Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável 
//A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A.
// Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados
import java.util.Scanner;

public class Ex5  {
    public static void executar5() {
        Scanner scanner = new Scanner(System.in);

        // Leia os valores de A e B
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        // Apresente os valores originais
        System.out.println("Valores originais:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Troque os valores
        int temp = A;
        A = B;
        B = temp;

        // Apresente os valores trocados
        System.out.println("\nValores trocados:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        scanner.close();
    }
}
