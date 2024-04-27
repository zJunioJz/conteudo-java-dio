    package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class PlanoCartesiano {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // Lê um número inteiro para a variável x
        int y = sc.nextInt(); // Lê um número inteiro para a variável y

        while (x != 0 && y != 0) { // Enquanto x e y forem diferentes de 0, repete o bloco de código abaixo
            if (x > 0 && y > 0) { // Se x e y forem positivos
                System.out.println("primeiro"); // Imprime "primeiro"
            } else if (x < 0 && y > 0) { // Se x for negativo e y for positivo
                System.out.println("segundo"); // Imprime "segundo"
            } else if (x < 0 && y < 0) { // Se x e y forem negativos
                System.out.println("terceiro"); // Imprime "terceiro"
            } else { // Caso contrário, ou seja, se x for positivo e y for negativo
                System.out.println("quarto"); // Imprime "quarto"
            }
            x = sc.nextInt(); // Lê um novo número inteiro para a variável x
            y = sc.nextInt(); // Lê um novo número inteiro para a variável y
        }

        sc.close(); // Fecha o objeto Scanner
    }
}
