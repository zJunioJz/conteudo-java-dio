package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class UtiWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // Lê um número inteiro do usuário e armazena na variável x
        int soma = 0; // Inicializa a variável soma com 0

        while (x != 0) { // Enquanto o valor de x for diferente de 0, repete o bloco de código abaixo
            soma += x; // Adiciona o valor de x à variável soma
            x = sc.nextInt(); // Lê o próximo número inteiro do usuário e atualiza o valor de x
        }

        System.out.println("Valor da soma: " + soma); // Imprime o valor final da soma

        sc.close(); // Fecha o objeto Scanner
    }
}
