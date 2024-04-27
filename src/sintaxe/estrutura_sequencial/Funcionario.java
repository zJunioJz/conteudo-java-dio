package sintaxe.estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class Funcionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int numero, horas;
        double valorHora, salario;

        // Leitura dos valores digitados pelo usuário
        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        // Cálculo do salário
        salario = valorHora * horas;

        // Exibição do número do funcionário e do salário calculado
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
