package sintaxe.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {
        // Configura o padrão de localização para US (ponto decimal como separador decimal)
        Locale.setDefault(Locale.US);

        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita um número ao usuário e armazena na variável numero
        double numero = sc.nextDouble();

        // Verifica em qual intervalo o número se encontra e exibe a mensagem correspondente
        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
