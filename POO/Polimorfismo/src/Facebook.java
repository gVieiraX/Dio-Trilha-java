public class Facebook  extends  ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando menssagem pelo Facebook.");
     }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo menssagem pelo Facebook.");

    }
}
