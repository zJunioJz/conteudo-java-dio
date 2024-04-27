package sintaxe.estrutura_sequencial;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, Informe o numero da Agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.println("Por favor, Informe o seu Nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, Informe o seu Saldo: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Ola " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta" + numeroConta + " e seu saldo" + saldo + " já está disponível para saque");
    }
}
