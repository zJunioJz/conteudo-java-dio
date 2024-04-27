package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class NLinhas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler os dados de entrada

        int n = sc.nextInt(); // Lê um valor inteiro para n

        for (int i = 1; i <= n; i++) { // Loop que se repete de 1 até n
            int primeiro = i; // Atribui o valor de i à variável primeiro
            int segundo = i * i; // Calcula o quadrado de i e atribui à variável segundo
            int terceiro = i * i * i; // Calcula o cubo de i e atribui à variável terceiro
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro); // Imprime os valores de primeiro, segundo e terceiro formatados
        }

        sc.close(); // Fecha o objeto Scanner
    }
}
