package poo.iphone.reprodutor;

public class IphoneReprodutor implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando a Musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a Musica.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a Musica" + musica);
    }
}
