package poo.bancario;

public class Application {
    
    
    public static void main(String[] args){
        
        ContaCorrente contacomum = new ContaCorrente(123,567);
        ContaCorrente contaespecial = new ContaCorrente(123,569, 1500.00f );
        
        System.out.println("Numero: " +contacomum.getNumero() + "\nAgencia: " +contacomum.getAgencia());
        System.out.println("\nNumero: " +contaespecial.getNumero() + "\nAgencia: " +contaespecial.getAgencia() + "\nLimite: " + contaespecial.getLimite());
    }
    
}
