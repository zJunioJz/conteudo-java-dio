package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class DivisaoImpossivel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler os dados de entrada

        int n = sc.nextInt(); // Lê um valor inteiro para n

        for (int i = 0; i < n; i++) { // Loop que se repete n vezes
            int x = sc.nextInt(); // Lê um valor inteiro para x
            int y = sc.nextInt(); // Lê um valor inteiro para y

            if (y == 0) { // Verifica se y é igual a 0 (divisão por zero)
                System.out.println("divisao impossivel"); // Imprime a mensagem "divisao impossivel"
            } else {
                double div = (double) x / y; // Realiza a divisão entre x e y, convertendo um dos operandos para double para obter o resultado com casas decimais
                System.out.printf("%.1f%n", div); // Imprime o resultado formatado com uma casa decimal
            }
        }

        sc.close(); // Fecha o objeto Scanner
    }
}
