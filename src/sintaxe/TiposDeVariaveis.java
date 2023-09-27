package sintaxe;


public class TiposDeVariaveis {

    public static void main(String[] args) {

        String meuNome = "Jefferson";
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroCurto;

        int numero = 5;
        final double VALOR_DE_PI = 3.14;

        System.out.println("" + VALOR_DE_PI);
    }
}
