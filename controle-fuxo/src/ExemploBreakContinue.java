public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for (int number = 1; number <=20; number++){
            if(number == 14) //BREAK: Ao chegar no número 14, irá interromper o programa, caso seja CONTINUE,continuará normalmente.
            break; 
            System.out.println(number);
        }
    }
}
