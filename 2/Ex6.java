
//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é
import java.util.Scanner;
public class Ex6 {


    public static void executar6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celcius");
        double celsius = scanner.nextDouble();

       
        double Fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);

        scanner.close();
    }
}


