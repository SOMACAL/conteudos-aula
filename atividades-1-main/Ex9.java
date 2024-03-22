//Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes. 
//Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
//Caso sejam diferentes, informe que são diferentes e qual número é o maior.


import java.util.Scanner;

public class Ex9 {
    public static void executar9() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();
        
        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            if (a > b) {
                System.out.println("O número A é maior que o número B.");
            } else {
                System.out.println("O número B é maior que o número A.");
            }
        }
        scanner.close();

    }
}