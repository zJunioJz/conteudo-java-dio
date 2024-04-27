package sintaxe.estrutura_sequencial;

import java.util.Scanner;

public class CalculaMetro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        // Cálculo da área
        double area = largura * comprimento;

        // Cálculo do preço
        double preco = area * metroQuadrado;

        // Exibição da área e do preço
        System.out.println("Area: " + area);
        System.out.println("Preço: " + preco);

        sc.close();
    }

}
