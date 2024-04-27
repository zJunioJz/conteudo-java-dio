    package sintaxe.estrutura_condicional;

import java.util.Scanner;

public class Hora {
    
    public static void main(String[] args){
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        int hora;
        
        System.out.println("Que horas são? ");
        hora = sc.nextInt();
        
        // Verifica a hora e imprime a saudação correspondente
        if(hora < 12){
            System.out.println("Bom Dia!");
        }
        else if(hora >= 12 && hora < 18){
            System.out.println("Boa Tarde!");
        }
        else{
            System.out.println("Boa Noite!");
        }
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }   
}
