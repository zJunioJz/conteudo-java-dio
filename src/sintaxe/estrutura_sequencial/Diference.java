package sintaxe.estrutura_sequencial;

import java.util.Scanner;

public class Diference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int A, B, C, D, dif;

        // Leitura dos valores digitados pelo usuário
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        // Cálculo da diferença entre os valores A, B, C e D
        dif = A * B - C * D;

        // Exibição da diferença calculada
        System.out.println("DIFERENCA = " + dif);

        sc.close();
    }
}
