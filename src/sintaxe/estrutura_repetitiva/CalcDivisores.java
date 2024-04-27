package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class CalcDivisores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler os dados de entrada

        int n = sc.nextInt(); // Lê um valor inteiro para n

        for (int i = 1; i <= n; i++) { // Loop que se repete de 1 até n
            if (n % i == 0) { // Verifica se n é divisível por i (resto da divisão igual a zero)
                System.out.println(i); // Imprime o valor de i, que é um divisor de n
            }
        }

        sc.close(); // Fecha o objeto Scanner
    }
}
