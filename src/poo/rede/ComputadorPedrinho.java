package poo.rede.apps;

import poo.rede.ServicoMensagemInstantanea;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new Facebook();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();
        else {
            // Caso appEscolhido não corresponda a nenhum valor conhecido
            throw new IllegalArgumentException("App escolhido desconhecido: " + appEscolhido);
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
