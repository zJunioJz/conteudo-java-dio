package sintaxe.estrutura_condicional;

import java.util.Scanner;

public class Tabela {

    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o código do produto e a quantidade informados pelo usuário
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        // Verifica o código do produto e calcula o total a ser pago com base na quantidade
        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.5;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.5;
        }

        // Exibe o valor total formatado com duas casas decimais
        System.out.printf("Total: R$ %.2f%n", total);

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
