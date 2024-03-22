//Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaharmônica.Média harmônica
 //= 31 + 1 + 1 nota 1 nota 2 nota 3 Exemplo: nota1 = 10, nota 2 = 5.5, nota 3 = 8 Média: 7.37
 import java.util.Scanner;

public class Ex18 {
    public static void executar18() {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar as três notas do aluno
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        // Calcular a média harmônica
        double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));
        
        // Imprimir o resultado
        System.out.println("Média harmônica: " + mediaHarmonica);
        
        scanner.close();
    }
}
