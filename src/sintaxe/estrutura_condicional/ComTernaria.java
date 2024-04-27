package sintaxe.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ComTernaria {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco = 34.5; // Definição do preço inicial
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        // Utilizando a operação ternária para calcular o desconto com base no preço
        // Se o preço for menor que 20.0, aplica-se um desconto de 10%
        // Caso contrário, aplica-se um desconto de 5%

        System.out.println(desconto); // Imprime o valor do desconto calculado

        sc.close();
    }

}
