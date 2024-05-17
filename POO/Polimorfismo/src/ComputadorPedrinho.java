public class ComputadorPedrinho  {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        Facebook fb = new Facebook();
        fb.enviarMensagem();
        fb.receberMensagem();

        Telegram tl = new Telegram();
        tl.enviarMensagem();
        tl.receberMensagem();
        
        
    }
}
