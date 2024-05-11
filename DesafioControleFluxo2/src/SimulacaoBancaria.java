import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

            double saldo = 0;
 
            // Loop infinito para manter o programa em execução até que o usuário decida sair
            while (true) {
    

                int opcao = scanner.nextInt();


                switch (opcao) {
                    case 1:{
                        double valordepositado = scanner.nextDouble();
                        saldo = saldo + valordepositado;
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    }
                    case 2:{
                        double valorsacado = scanner.nextDouble();
                        if (saldo < valorsacado) {
                            System.out.println("Saldo insuficiente.");
                        }else{
                            saldo = saldo - valorsacado;
                            System.out.println("Saldo atual: " + saldo);
                        }
                         
                        break;
                    }   
                    case 3:{
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    }
                    
                    case 0:{
                        System.out.println("Programa encerrado.");
                        scanner.close();
                        return;
                    }

                    // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
   }
 }
}

