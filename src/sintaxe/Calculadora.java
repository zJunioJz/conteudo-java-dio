package sintaxe;

import java.util.Scanner;

class OpcoesInvalidasExceptions extends Exception {

}

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        String opcao = "";

        do {
            System.out.println("\t\t Calculadora em Java");
            try {
                System.out.print("'+' : Adição\t\t");
                System.out.println("'/' : Divisão");
                System.out.print("'-' : Subtração\t");
                System.out.println("\t'*' : Multiplicação");
                System.out.println("\nQual Operação você deseja?");
                opcao = sc.nextLine();

                if (opcao.matches(".*[\\^`{_].*")) {
                    throw new OpcoesInvalidasExceptions();
                }
                if (opcao.equals("0")) {
                    break;
                }

                System.out.print("Digite o numero..: ");
                num1 = sc.nextDouble();
                System.out.print("Digite o numero..: ");
                num2 = sc.nextDouble();
                sc.nextLine();

                switch (opcao) {
                    case "+": {
                        System.out.println("Resultado..: " + (num1 + num2));
                        break;
                    }
                    case "-": {
                        System.out.println("Resultado..: " + (num1 - num2));
                        break;
                    }
                    case "/": {
                        if (num2 != 0) {
                            System.out.println("Resultado..: " + (num1 / num2));
                        } else {
                            System.out.println("Não possui divisão por ZERO");
                        }
                        break;
                    }
                    case "*": {
                        System.out.println("Resultado..: " + (num1 * num2));
                        break;
                    }
                    default:
                        System.out.println("Operação Invalida\n");
                }
            } catch (OpcoesInvalidasExceptions e) {
                System.out.println("Operação Invalida\n");
            }
        } while (!opcao.equals("0"));
        sc.close();
    }
}
