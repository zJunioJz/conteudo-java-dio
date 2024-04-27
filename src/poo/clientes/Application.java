package poo.clientes;

public class Application {
    
    public static void main(String[] args){
        ClientePF clientepf1 =  new ClientePF("Jefferson","Rua Velha 75B","25592384");
        
        ClientePJ clientepj1 =  new ClientePJ("Luiz","Gardenia Azul 85b","11854942");
        
        System.out.println("Dados Cliente: "+clientepf1.getNome()+ "\nEndereco: "+clientepf1.getEndereco()+ "\nCPF: " + clientepf1.getCpf());
        
        System.out.println("\nDados Cliente: "+clientepj1.getNome() + "\nEndeereco: "+clientepj1.getEndereco() + "\nCNPJ: "+clientepj1.getCnpj());
        
        
        //POLIMORFISMO
        System.out.println(clientepf1.toString());
        System.out.println(clientepj1.toString());
        
    }
    
}
