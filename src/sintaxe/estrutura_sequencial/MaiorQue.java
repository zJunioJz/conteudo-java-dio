package sintaxe.estrutura_sequencial;

import java.util.Scanner;

public class MaiorQue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }

    // Método para encontrar o maior entre três números
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    // Método para exibir o resultado
    public static void showResult(int value) {
        System.out.println("Maior: " + value);
    }
}
