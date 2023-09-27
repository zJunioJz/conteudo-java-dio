package sintaxe;

public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "T";

        switch (plano) {

            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            case "M": {
                System.out.println("Whats e insta grátis");
                break;
            }
            case "T": {
                System.out.println("5Gb YouTube");
                break;
            }
            default:
                System.out.println("Opção Invalida");
        }
    }
}
