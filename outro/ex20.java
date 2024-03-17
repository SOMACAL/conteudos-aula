//Elabore um algoritmo que calcule a quantidade de litros de combustível gasta emuma viagem, utilizando um automóvel 
//que faz 12km por litro e 
//considerando que sãofornecidos o tempo em hora e a velocidade média da viagem.
import java.util.Scanner;

public class ex20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar o tempo de viagem em horas
        System.out.println("Digite o tempo de viagem (em horas):");
        double tempoViagem = scanner.nextDouble();
        
        // Solicitar a velocidade média da viagem em km/h
        System.out.println("Digite a velocidade média da viagem (em km/h):");
        double velocidadeMedia = scanner.nextDouble();
        
        // Calcular a distância percorrida
        double distancia = tempoViagem * velocidadeMedia;
        
        // Calcular a quantidade de litros de combustível gasta
        double consumo = 12; // quilômetros por litro
        double litrosCombustivel = distancia / consumo;
        
        // Imprimir o resultado
        System.out.println("Quantidade de litros de combustível gasta: " + litrosCombustivel);
        
        scanner.close();
    }
}
