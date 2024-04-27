package sintaxe.estrutura_condicional;

import java.util.Scanner;

public class NumPositivoNegativo {
    
    public static void main(String[] args){
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite o Numero: ");
        num = sc.nextInt();
        
        // Verifica se o número é positivo ou negativo
        if(num >= 0){
            System.out.println("O valor é Positivo");
        }
        else{
            System.out.println("O valor é Negativo");
        }
        
        // Fecha o Scanner para liberar recursos
        sc.close(); 
    }
    
}
