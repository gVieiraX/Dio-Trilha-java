public class ExemploForArray {

    public static void main(String[] args) {
        // em arrays indice se iniciar em 0
        String student [] = {"Gabriel","Felipe","Julia", "Marcos"};

        for (int x=0; x < student.length; x++){
            System.out.println("O aluno no indice x = "+ x + " é " + student[x]);
        }

        System.out.println("-----------------------------");

        String guys [] = {"Gabriel","Felipe","Julia", "Marcos"};
    
        for (String people : guys) {
            System.out.println("Nome do aluno é: "+ people);
        }


    }

   
}