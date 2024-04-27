package sintaxe.estrutura_condicional;

import java.util.Scanner;

public class HoraFut {

    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler as entradas do usuário
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        // Verifica se a hora final é maior que a hora inicial
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            // Caso a hora final seja menor ou igual à hora inicial, adiciona 24 horas para obter a duração correta
            duracao = 24 - horaInicial + horaFinal;
        }

        // Imprime a duração do jogo em horas
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
