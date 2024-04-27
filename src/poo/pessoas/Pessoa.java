package poo.pessoas;

public class Pessoa {
    
//Private é utilizado para proteger e encapsular os dados da classe
    private int codigo;
    private String nome;
    private int idade;
    
    public Pessoa(int codigo, String nome, int idade){
        this.codigo=codigo;
        this.nome=nome;
        this.idade=idade;
    }
    
//METODO ACESSADOR
    public int getCodigo(){
        return codigo;
    }
  
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    //METODO MODIFICADOR
    public void setCodigo(int codigo){
        this.codigo=codigo; 
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }
    
    
}
