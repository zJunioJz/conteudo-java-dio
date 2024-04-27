package sintaxe.estrutura_sequencial;

import java.util.Locale;

public class Cliente {

    public static void main(String[] args) {

        // Declaração das variáveis
        String produto1 = "Computador";
        String produto2 = "Monitor";
        int idade = 30;
        int codigo = 3060;
        char genero = 'M';
        double price1 = 3700;
        double price2 = 2500;
        double measure = 54.943654;

        // Exibição dos valores utilizando formatação de strings
        System.out.printf("%s, o preco R$ %.2f\n", produto1, price1);
        System.out.printf("%s, o preco R$%.2f\n", produto2, price2);
        System.out.printf("record:%d anos, codigo %d e genero: %s\n", idade, codigo, genero);
        System.out.printf("measue with eight decimal places: %.8f\n", measure);
        System.out.printf("rouded(three decimal places): %.3f\n", measure);

        // Configuração do local padrão para exibição de números com ponto decimal
        Locale.setDefault(Locale.US);
        System.out.printf("Us decimal point: %.5f\n", measure);
    }
}
