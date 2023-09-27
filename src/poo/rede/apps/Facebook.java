package poo.rede.apps;

import poo.rede.ServicoMensagemInstantanea;

public class Facebook extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem pelo Facebook");
    }
}
