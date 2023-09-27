package poo.pratica.desafioTres;
import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            // Se o cofre for digital, leia a senha e a confirmação de senha
            int senha = Integer.parseInt(scanner.nextLine());
            int confirmacaoSenha = Integer.parseInt(scanner.nextLine());

            // Crie um cofre digital e valide a senha
            CofreDigital cofreDigital = new CofreDigital(senha);
            boolean senhaCorreta = cofreDigital.validarSenha(confirmacaoSenha);

            // Imprima as informações do cofre
            cofreDigital.imprimirInformacoes();

            if (senhaCorreta) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            // Se o cofre for físico, crie um cofre físico e imprima suas informações
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
    }
}
