package poo.pessoas;

public class Application {
    
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa(1,"Jefferson",20);
        
        Pessoa pessoa2 = new Pessoa(2,"Luiz", 19);
        
        Pessoa pessoa3 = new Pessoa(3,"Fabiano", 21);
        
        
       
        System.out.println("Codigo:"+ pessoa1.getCodigo() + "\nNome: "+pessoa1.getNome() + "\nIdade: " +pessoa1.getIdade());
        
        System.out.println("\n\nCodigo: "+ pessoa2.getCodigo() + "\nNome: "+pessoa2.getNome() + "\nIdade: " +pessoa2.getIdade());
        
        System.out.println("\n\nCodigo: " +pessoa3.getCodigo() + "\nNome: " +pessoa3.getNome() + "\nIdade: " +pessoa3.getIdade());
        
        // Usado para modificar o valor de um atributo privado
        pessoa1.setNome("Junio");
        
        System.out.println("\nSeu nome e: "+pessoa1.getNome());
    }
    
}
