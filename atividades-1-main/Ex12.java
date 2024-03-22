//Escreva um algoritmo que receba o número do mês e mostre o mêscorrespondente. Valide mês inválido.
import java.util.Scanner;

public class Ex12 {
    public static void executar12() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número do mês:");
        int numeroMes = scanner.nextInt();
        
        String mes;
        switch(numeroMes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Mês inválido!";
        }
        
        System.out.println("O mês correspondente ao número " + numeroMes + " é: " + mes);
        
        scanner.close();
    }
}
