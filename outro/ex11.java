import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor inteiro:");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo valor inteiro:");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro valor inteiro:");
        int c = scanner.nextInt();
        
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        System.out.println("Os valores em ordem crescente são: " + a + ", " + b + ", " + c);
        
        scanner.close();
    }
}
