package sintaxe.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class NumPecas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        // Leitura dos valores do primeiro produto
        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        // Leitura dos valores do segundo produto
        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        // Cálculo do total a pagar
        total = preco1 * qte1 + preco2 * qte2;

        // Exibição do resultado formatado com 2 casas decimais
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
