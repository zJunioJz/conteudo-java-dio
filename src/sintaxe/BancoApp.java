package sintaxe;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // Para formatar a saída com duas casas decimais

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        // Aplica os juros compostos iterativamente ao longo do período
        for (int x = 1; x <= periodo; x++) {
            valorFinal = valorFinal * (1 + taxaJuros);
        }

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}
