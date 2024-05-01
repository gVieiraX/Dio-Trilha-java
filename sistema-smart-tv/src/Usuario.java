
public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status - TV Ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual:" + smartTv.volume);
        System.out.println();

        smartTv.mudarCanal(16);
        System.out.println("Canal atual: " + smartTv.canal);



    }
}