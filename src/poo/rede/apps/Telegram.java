package poo.rede.apps;

import poo.rede.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem pelo Telegram");
    }
}
