package sintaxe.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class CalculaRaio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        double R, A, pi = 3.14159;

        // Entrada do valor do raio
        R = sc.nextDouble();

        // Cálculo da área
        A = pi * R * R;

        // Exibição do resultado formatado com 4 casas decimais
        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}
