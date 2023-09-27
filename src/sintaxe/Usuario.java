package sintaxe;

public class Usuario {
    public static void main(String[] args) {
        SistemasSmartTv smartTv = new SistemasSmartTv();

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.   canal);

        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.diminuiVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Tv ligada?" + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
    }
}
