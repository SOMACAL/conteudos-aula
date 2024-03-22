//escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo deoperador em outra variável do tipo CARACTERE.
//  Imprima o resultado da operação de A por B se o operador aritmético for válido; caso contrário deve ser impresso umamensagem de operador não definido.
//  Tratar erro de divisão por zero

import java.util.Scanner;

public class Ex13 {
    public static void executar13() {

    Scanner scanner = new Scanner(System.in);
        
        // Solicitar os valores de A e B
        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();
        
        // Solicitar o operador aritmético
        System.out.println("Digite o operador aritmético (+, -, *, /):");
        char operador = scanner.next().charAt(0);
        
        double resultado;
        
        // Verificar o operador aritmético e realizar a operação correspondente
        switch(operador) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                // Verificar se B é diferente de zero para evitar divisão por zero
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador não definido!");
        }
        
        scanner.close();
    }
}
