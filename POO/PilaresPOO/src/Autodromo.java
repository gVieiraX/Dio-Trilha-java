public class Autodromo {
    public static void main(String[] args) {
        Carro bmw = new Carro();
        bmw.setChassi("242424");
        // bmw.ligar();

        Moto xre300 = new Moto();
        xre300.setChassi("33123");
      //  xre300.ligar();

        Veiculo coringa = xre300;
        coringa.ligar();
        }
}
