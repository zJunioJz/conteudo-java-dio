package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt(); // Lê um número inteiro do usuário e armazena na variável senha

        while (senha != 2002) { // Enquanto o valor da senha for diferente de 2002, repete o bloco de código abaixo
            System.out.println("Senha Invalida"); // Imprime a mensagem de senha inválida
            senha = sc.nextInt(); // Lê um novo número inteiro do usuário e atualiza o valor da senha
        }

        System.out.println("Acesso Permitido"); // Se o valor da senha for 2002, imprime a mensagem de acesso permitido

        sc.close(); // Fecha o objeto Scanner
    }
}
