package sintaxe.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class PesoValor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define a configuração local para US (ponto como separador decimal)
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler os dados de entrada

        int n = sc.nextInt(); // Lê um valor inteiro para n

        for (int i = 0; i < n; i++) { // Loop que se repete n vezes
            double a = sc.nextDouble(); // Lê um valor double para a
            double b = sc.nextDouble(); // Lê um valor double para b
            double c = sc.nextDouble(); // Lê um valor double para c

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0; // Calcula a média ponderada usando os pesos 2, 3 e 5

            System.out.printf("%.1f%n", media); // Imprime a média formatada com uma casa decimal
        }

        sc.close(); // Fecha o objeto Scanner
    }
}
