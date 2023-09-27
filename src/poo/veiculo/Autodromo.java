package poo.veiculo;
//ENCAPSULAMENTO
public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("85332");

        Moto z400 = new Moto();
        z400.setChassi("22553");
        z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
