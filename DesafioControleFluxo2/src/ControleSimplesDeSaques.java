import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques:
        for (;;) {
            if (!scanner.hasNextDouble()) {
                break; // Encerrar o loop se não houver mais entrada disponível.
            }
            // Solicitar ao usuário o valor do saque:
            double valorSaque = scanner.nextDouble();

            // Verificar se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verificar se o valor do saque ultrapassa o limite diário:
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                continue; //Continue para solicitar um novo valor de saque.
            }

            // Subtrair o valor do saque do limite diário:
            limiteDiario -= valorSaque;

            // Informar que o saque foi realizado e mostrar o limite restante:
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
 
        }
        scanner.close(); 

        // Fechamos o Scanner para evitar vazamento de recursos:
    }

}
