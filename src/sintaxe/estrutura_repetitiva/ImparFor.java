package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class ImparFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // Lê um valor inteiro para x

        for (int i = 1; i <= x; i++) { // Loop que se repete de 1 até o valor de x
            if (i % 2 != 0) { // Verifica se o número i é ímpar (resto da divisão por 2 diferente de 0)
                System.out.println(i); // Imprime o número i
            }
        }

        sc.close(); // Fecha o objeto Scanner
    }
}
