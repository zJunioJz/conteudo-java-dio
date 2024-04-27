package sintaxe.estrutura_sequencial;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int A, B, soma;

        // Leitura dos valores digitados pelo usuário
        A = sc.nextInt();
        B = sc.nextInt();

        // Cálculo da soma
        soma = A + B;

        // Exibição do resultado da soma
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
