package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class PostoCombus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0; // Variável para contar a quantidade de abastecimentos com álcool
        int gasolina = 0; // Variável para contar a quantidade de abastecimentos com gasolina
        int diesel = 0; // Variável para contar a quantidade de abastecimentos com diesel

        int tipo = sc.nextInt(); // Lê o tipo de combustível do primeiro abastecimento

        while (tipo != 4) { // Enquanto o tipo de combustível for diferente de 4, repete o bloco de código abaixo
            if (tipo == 1) { // Se o tipo for 1 (álcool)
                alcool = alcool + 1; // Incrementa a variável alcool em 1
            } else if (tipo == 2) { // Se o tipo for 2 (gasolina)
                gasolina = gasolina + 1; // Incrementa a variável gasolina em 1
            } else if (tipo == 3) { // Se o tipo for 3 (diesel)
                diesel = diesel + 1; // Incrementa a variável diesel em 1
            }

            tipo = sc.nextInt(); // Lê o tipo de combustível do próximo abastecimento
        }

        System.out.println("MUITO OBRIGADO"); // Imprime a mensagem de agradecimento
        System.out.println("Alcool: " + alcool); // Imprime a quantidade de abastecimentos com álcool
        System.out.println("Gasolina: " + gasolina); // Imprime a quantidade de abastecimentos com gasolina
        System.out.println("Diesel: " + diesel); // Imprime a quantidade de abastecimentos com diesel

        sc.close(); // Fecha o objeto Scanner
    }
}
