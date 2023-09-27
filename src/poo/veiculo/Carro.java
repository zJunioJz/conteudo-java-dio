package poo.veiculo;

public class Carro extends Veiculo{

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");

    }
    private void confereCambio(){
        System.out.println("Conferindo cambio");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustivel em N");
    }
}
