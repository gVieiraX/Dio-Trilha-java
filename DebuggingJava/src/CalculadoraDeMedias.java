import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    
    public static void main(String[] args) {

    try{ 
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);


     }catch(InputMismatchException  e ){
            System.err.println("O campo de nota devem ser apenas números inteiros e sem caracteres.Exemplo: 1,2,3.");
        }   
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {


        
        double soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;




    }

     

}

