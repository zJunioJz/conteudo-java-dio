package poo.iphone.aparelho;

public class Aparelho implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Efetuando a Ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a Chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz. ");
    }
}
