package sintaxe.estrutura_repetitiva;

public class ExemploForArray {
    public static void main(String[] args) {

        //Em arrays o indice se inicia em ZERO
        String alunos[] = {"Felipe", "Jefferson", "Giovanna", "Daniel"};

        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
