package sintaxe;

public class SistemaDeMedida {
    public static void main(String[] args) {

        String sigla = "G";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
