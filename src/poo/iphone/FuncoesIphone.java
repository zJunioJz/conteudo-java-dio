package poo.iphone;

import poo.iphone.aparelho.Aparelho;
import poo.iphone.navegador.Navegador;
import poo.iphone.reprodutor.IphoneReprodutor;
import poo.iphone.reprodutor.ReprodutorMusical;

public class FuncoesIphone {
    public static void main(String[] args) {
        ReprodutorMusical rp = new IphoneReprodutor();
        Aparelho ap = new Aparelho();
        Navegador nv = new Navegador();

        rp.tocar();
        rp.pausar();
        rp.selecionarMusica("Avicci - Waiting for Love");

        System.out.println("");

        ap.ligar();
        ap.atender();
        ap.iniciarCorreioVoz();

        System.out.println("");

        nv.exibirPagina();
        nv.adicionarNovaAba();
        nv.atualizarPagina();
    }
}
