package sintaxe;

public class SistemasSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void subirCanal() {
        canal++;
    }

    public void descerCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuiVolume() {
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}

