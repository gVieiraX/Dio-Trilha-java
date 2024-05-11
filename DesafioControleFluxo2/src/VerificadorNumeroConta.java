import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
 try {        
String numeroConta = scanner.next();           

verificarNumeroConta(numeroConta);           

// Imprime que o número de conta é válido:
 System.out.println("Numero de conta valido."); 


 // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
    
} catch (IllegalArgumentException e) {
    System.out.println("Erro: " + e.getMessage()); 

// Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
          
     } finally {
            scanner.close();
        }
    
    }
// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
private static void verificarNumeroConta(String numeroConta) {
    if (numeroConta.length() != 8) {
        throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    }
}
        
// TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
    
}