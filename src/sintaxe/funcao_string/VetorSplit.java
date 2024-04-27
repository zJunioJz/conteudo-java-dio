package sintaxe.funcao_string;

public class VetorSplit {

    public static void main(String[] args) {

        String s = "maça uva laranja batata alface";

        // Divide a string em substrings com base no espaço em branco
        String[] vect = s.split(" ");

        // Imprime cada elemento do vetor
        System.out.println(vect[0]); // maça
        System.out.println(vect[1]); // uva
        System.out.println(vect[2]); // laranja
        System.out.println(vect[3]); // batata
        System.out.println(vect[4]); // alface
    }

}
