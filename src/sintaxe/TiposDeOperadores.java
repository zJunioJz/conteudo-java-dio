package sintaxe;

public class TiposDeOperadores {
    public static void main(String[] args) {

        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        //Operador ternario
        int a, b;
        a = 5;
        b = 6;
        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
    }
}
