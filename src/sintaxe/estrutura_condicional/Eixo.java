package sintaxe.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Eixo {

    public static void main(String[] args) {
        // Define a configuração local para usar o formato de ponto decimal dos EUA
        Locale.setDefault(Locale.US);
        
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário as coordenadas x e y e as armazena nas variáveis x e y
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // Verifica as coordenadas e imprime a posição correspondente no plano cartesiano
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
