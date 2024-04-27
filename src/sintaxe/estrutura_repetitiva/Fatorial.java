package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler os dados de entrada

        int n = sc.nextInt(); // Lê um valor inteiro para n

        int fat = 1; // Inicializa a variável fat com o valor 1, pois o fatorial de 0 é 1
        for (int i = 1; i <= n; i++) { // Loop que se repete de 1 até n
            fat = fat * i; // Multiplica a variável fat pelo valor atual de i
        }

        System.out.println(fat); // Imprime o resultado do fatorial

        sc.close(); // Fecha o objeto Scanner
    }
}
