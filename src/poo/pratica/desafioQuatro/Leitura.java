package poo.pratica.desafioQuatro;
import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        // Extrair informações da entrada
        String data = partes[0];
        String hora = partes[1];
        String descricao = partes[2];
        double valor = Double.parseDouble(partes[3]);


        Transacao transacao = new Transacao(data, hora, descricao, valor);


        transacao.imprimir();
    }
}
