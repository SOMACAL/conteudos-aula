//Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaaritmética.
// Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

import java.util.Scanner;

public class Ex16  {
    public static void executar16() {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar as  notas do aluno
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        // Calcular a média aritmética
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Imprimir o resultado
        System.out.println("Média: " + media);
        
        scanner.close();
    }
}
