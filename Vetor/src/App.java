import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //armazenar vários valores do mesmo tipo
        //tipo[] nomevariavel = new tipo[5];
        String[] nomes = new String[]{
            "João", "Maria", "Ana", "Marcos", "Lili"
        };

        //nomes[0] = "João";
        //nomes[1] = "Maria";
        //nomes[2] = "Ana";
        //nomes[3] = "Marcos";
        //nomes[4] = "Lili";

        for(int i=0; i<5; i++){
            System.out.println(nomes[i]);
        }

        //Prenchendo todo o Array com um valor

        int[] numero = new int[100];

        Arrays.fill(numero, 0);
        
        System.out.println(Arrays.toString(numero));
        
    }
}
