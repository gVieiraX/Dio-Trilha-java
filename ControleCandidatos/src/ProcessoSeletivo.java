import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        for (String candidato:candidatos){
            entrarEmContado(candidato);
        }
    }

    static void entrarEmContado (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentanto = true;
        boolean atendeu =  false;

        do {
            atendeu = atender();
            continuarTentanto = !atendeu;
            if(continuarTentanto)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso!!!");    
        } while (continuarTentanto && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA\n");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA\n");
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        System.out.println("Imprimindo a lista de candidatos informandoo o indice do elemento: ");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }

        //forma abreviado abaixo
       /*  for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
        */
    }

    static void selecaoCandidatos () {
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendito = valorPratendido() ;

            System.out.println( "O candidato " + candidato + " solictou este valor de salário " + salarioPretendito);
            if(salarioBase>=salarioPretendito){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatoSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPratendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2600);
    } 


    static void analisarCandidato(double salarioPretendito){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendito){
            System.out.println("Ligar para o candidato.");
        } else if ( salarioBase == salarioPretendito) {
            System.out.println("Ligar para o candidato, com a contra proposta.");
        }else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }

    








    }






