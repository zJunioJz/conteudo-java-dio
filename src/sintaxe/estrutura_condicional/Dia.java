package sintaxe.estrutura_condicional;

import java.util.Scanner;

public class Dia {

    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário um número inteiro e armazena em x
        int x = sc.nextInt();
        
        // Variável para armazenar o dia da semana correspondente ao valor de x
        String dia;

        // Estrutura switch para verificar o valor de x e atribuir o dia da semana correspondente à variável dia
        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }
        
        // Exibe o dia da semana correspondente ao valor de x
        System.out.println("Dia da semana: " + dia);
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
