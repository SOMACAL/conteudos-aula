//Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja maior ou igual
// a 50, outra se ele for menor que 50
import java.util.Scanner;
public class Ex8 {


    public static void executar8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um numero");
        double a = scanner.nextDouble();

       
        if (a >= 50) {
            System.out.println("numero maior ou igual a 50!");
            } if (a < 50) {
            System.out.println("numero menor que 50!");
            

        scanner.close();
    }
}
}

