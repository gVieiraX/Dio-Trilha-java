public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

    double saldo = 25.0;
    double valorSolicitado = 17.0;
    
    if(valorSolicitado > saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo é: " + saldo);
    }else    
     System.out.println("Saldo insuficiente");

/* 
 *  if(valorSolicitado > saldo)
        System.out.println("Novo saldo é: " + saldo);
    else    
     System.out.println("Saldo insuficiente");
 */

    
   }
}
