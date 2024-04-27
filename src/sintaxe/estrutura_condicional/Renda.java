package sintaxe.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Renda {

    public static void main(String[] args) {
        // Define o locale padrão para o formato de números (ponto como separador decimal)
        Locale.setDefault(Locale.US);
        
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o valor do salário informado pelo usuário
        double salario = sc.nextDouble();

        double imposto;
        // Verifica em qual faixa de renda o salário se enquadra e calcula o imposto
        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        // Verifica se o imposto é zero e exibe a mensagem correspondente
        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            // Exibe o valor do imposto formatado com duas casas decimais
            System.out.printf("R$ %.2f%n", imposto);
        }

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
