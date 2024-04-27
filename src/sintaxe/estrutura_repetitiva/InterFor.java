package sintaxe.estrutura_repetitiva;

import java.util.Scanner;

public class InterFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Lê um valor inteiro para n

        int in = 0; // Variável para contar quantos valores estão dentro do intervalo [10, 20]
        int out = 0; // Variável para contar quantos valores estão fora do intervalo [10, 20]

        for (int i = 0; i < n; i++) { // Loop que se repete n vezes
            int x = sc.nextInt(); // Lê um valor inteiro para x

            if (x >= 10 && x <= 20) { // Verifica se x está dentro do intervalo [10, 20]
                in = in + 1; // Incrementa a variável in
            } else {
                out = out + 1; // Incrementa a variável out
            }
        }

        System.out.println(in + " in"); // Imprime a quantidade de valores dentro do intervalo
        System.out.println(out + " out"); // Imprime a quantidade de valores fora do intervalo

        sc.close(); // Fecha o objeto Scanner
    }
}
