//A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA).
//  Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
//  r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética.
//  Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28

import java.util.Scanner;

public class Ex14 {
    public static void executar14() {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar os valores de a1, n e r
        System.out.println("Digite o primeiro termo (a1):");
        int a1 = scanner.nextInt();
        System.out.println("Digite o valor de n:");
        int n = scanner.nextInt();
        System.out.println("Digite a razão (r):");
        int r = scanner.nextInt();
        
        // Calcular o n-ésimo termo da progressão aritmética
        int an = a1 + (n - 1) * r;
        
        // Imprimir o resultado
        System.out.println("O " + n + "-ésimo termo da Progressão Aritmética é: " + an);
        
        scanner.close();
    }
}
