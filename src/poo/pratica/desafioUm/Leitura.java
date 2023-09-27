package poo.pratica.desafioUm;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        // Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        // Imprimir as informações da conta usando o objeto criado acima.
        System.out.println("Conta: " + contaBancaria.numero());
        System.out.println("Titular: " + contaBancaria.titular());
        System.out.println("Saldo: R$ " + contaBancaria.saldo());
    }
}
