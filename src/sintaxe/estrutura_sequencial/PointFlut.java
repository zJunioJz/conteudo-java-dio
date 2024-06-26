package sintaxe.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class PointFlut {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        // Leitura dos valores de entrada
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // Cálculo das áreas
        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        // Exibição dos resultados com 3 casas decimais
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
