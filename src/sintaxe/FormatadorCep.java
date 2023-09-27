package sintaxe;

public class FormatadorCep {

    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("22765064");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde à regra de negócios");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }

    public static class CepInvalidoException extends Exception {
    }
}
