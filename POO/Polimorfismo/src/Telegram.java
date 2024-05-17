public class Telegram extends  ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando menssagem pelo Telegram.");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo menssagem pelo Telegram.");
    }
}

