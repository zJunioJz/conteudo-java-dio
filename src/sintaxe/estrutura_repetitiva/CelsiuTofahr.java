package sintaxe.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class CelsiuTofahr {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Configura o local para usar o ponto como separador decimal
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler os dados de entrada

        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble(); // Lê a temperatura em Celsius

            double F = 9.0 * C / 5.0 + 32.0; // Calcula a temperatura em Fahrenheit

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F); // Imprime a temperatura em Fahrenheit formatada

            System.out.println("Deseja continuar? (s/n)?");
            resp = sc.next().charAt(0); // Lê a resposta do usuário

        } while (resp != 'n');

        sc.close(); // Fecha o objeto Scanner
    }

}
