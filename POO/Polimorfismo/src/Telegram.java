public class Telegram extends  ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoIntenert();
        System.out.println("Enviando menssagem pelo Telegram.");

    }

    @Override
    public void receberMensagem() {
        validarConectadoIntenert();
        System.out.println("Recebendo menssagem pelo Telegram.");
    }
}

