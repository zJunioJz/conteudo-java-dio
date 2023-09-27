package sintaxe;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite o seu Sobrenome: ");
            String sobrenome = sc.nextLine();

            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite a sua altura");
            double altura = sc.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
        }
    }

