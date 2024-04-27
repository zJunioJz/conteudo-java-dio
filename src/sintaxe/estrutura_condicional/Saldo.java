package sintaxe.estrutura_condicional;
import java.util.Scanner;
public class Saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();
        int saldo = 0;

        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
        if (saldoTotal >= valorSaque) {
            saldo = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo:" + saldo);

        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }
}