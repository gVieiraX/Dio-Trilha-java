public class ExemploFor {
    public static void main(String[] args) {
        for ( int x = 1; x<=20; x ++ ){
            System.out.println("Número: " + x);
        }
        System.out.println("Stop");

        System.out.println("-----------------------------------------------");

        int y = 1;
        for( ; y <=20; ){
            System.out.println("Número: " + y);
            y++;
        }    
    }
}
