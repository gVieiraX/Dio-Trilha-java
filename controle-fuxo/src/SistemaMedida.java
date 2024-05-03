public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

		/*if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");*/

        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;   
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
        }    
    }
    
}
