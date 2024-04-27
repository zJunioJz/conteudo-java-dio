package sintaxe.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * A classe atribuiçãoCumu calcula o valor da conta com base na quantidade de minutos utilizados.
 */
public class AtribuiçãoCumu {
    
    public static void main(String[] args){
        // Configura o padrão de localização para US (ponto decimal como separador decimal)
        Locale.setDefault(Locale.US);
        
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicita a quantidade de minutos utilizados ao usuário e armazena em min
        int min = sc.nextInt();
        
        // Define o valor inicial da conta
        double conta = 50.0;
        
        // Verifica se a quantidade de minutos utilizados é maior que 100
        // Se for, calcula o valor adicional da conta com base na diferença de minutos
        if(min > 100){
            conta += (min - 100) * 2.0;
        }
        
        // Exibe o valor da conta formatado com duas casas decimais
        System.out.printf("Valor da Conta: %.2f", conta);
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }
    
}
