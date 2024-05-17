public class MSNMessenger  extends  ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando menssagem pelo MSN.");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo menssagem pelo MSN.");
    }
}
