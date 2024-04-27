package sintaxe.estrutura_condicional;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // Verifica se A e B são múltiplos um do outro
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
