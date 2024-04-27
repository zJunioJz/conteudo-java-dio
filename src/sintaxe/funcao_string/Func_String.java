package sintaxe.funcao_string;

public class Func_String {
    
    public static void main(String[] args){
        
        String original = "abcde FGHIJ ABC abc DEFG  ";
        
        // Converte todos os caracteres para minúsculo
        String s01 = original.toLowerCase();
        
        // Converte todos os caracteres para maiúsculo
        String s02 = original.toUpperCase();
        
        // Remove os espaços em branco no início e no fim da string
        String s03 = original.trim();
        
        // Obtém uma substring a partir do índice 2 até o final da string
        String s04 = original.substring(2);
        
        // Obtém uma substring a partir do índice 2 até o índice 8 (exclusivo)
        String s05 = original.substring(2, 9);
        
        // Substitui todas as ocorrências do caractere 'a' pelo caractere 'x'
        String s06 = original.replace('a', 'x');
        
        // Substitui todas as ocorrências da substring "abc" pela substring "xy"
        String s07 = original.replace("abc", "xy");
        
        // Obtém o índice da primeira ocorrência da substring "bc"
        int i = original.indexOf("bc");
        
        // Obtém o índice da última ocorrência da substring "bc"
        int j = original.lastIndexOf("bc");
        
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -"+ s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("subString: -" + s04 + "-");
        System.out.println("subString(2,9): -" + s05 + "-");
        System.out.println("Replace('a', 'x': -" + s06 + "-");
        System.out.println("Replace('abc', 'xy': -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last Index of 'bc': " + j);
        
    }

}
