package sintaxe.estrutura_condicional;

import java.util.Scanner;

public class ImparOuPar {
    
    public static void main(String[] args){
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
	    
        // Verifica se o número é par ou ímpar
        if (N % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
