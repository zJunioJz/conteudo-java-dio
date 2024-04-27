package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class UtiFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0; // Variável de controle do loop
        int N = sc.nextInt(); // Lê o valor de N, determinando quantas iterações serão executadas
        int soma = 0; // Variável para armazenar a soma dos valores lidos

        for (i = 0; i < N; i++) { // Loop que se repete N vezes
            int x = sc.nextInt(); // Lê um valor inteiro para a variável x
            soma += x; // Adiciona o valor de x à soma

        }
        System.out.println(soma); // Imprime o valor da soma total

        sc.close(); // Fecha o objeto Scanner
    }

}
