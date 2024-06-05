import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //Array(vetor) -> comum tamanho fixo de 5 posições 
        String[] arrayEstatico = new String[5];
        //String[] arrayEstatico = {"João", "Maria"}; //Array de 02 posições 

        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "Pedro";
        arrayEstatico[3] = "Vegeta";
        arrayEstatico[4] = "Bob Esponja";

        //ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku");
        arrayDinamico.add("Maria");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Vegeta");
        arrayDinamico.add("Bob Esponja");
        arrayDinamico.add("Nome qualquer");

        //System.out.println("\nImprimindo o Array Estático");
        //for(int i=0;i<arrayEstatico.length;i++){
        //    System.out.println(arrayEstatico[i]);
        //}

        System.out.println("\nImprimindo o Array Dinamico");
        
        System.out.println("\nRemover Pedro");
        arrayDinamico.remove(2);

        //arrayDinamico.clear();

        //for(int i=0; i<arrayDinamico.size();i++){
        //    System.out.println(arrayDinamico.get(i));
        //}

        for(String nome : arrayDinamico){
            System.out.println(nome);
        }

    }
}
