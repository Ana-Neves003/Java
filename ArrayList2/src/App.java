import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Tipo primitivo -> Wrapper Class
         * int            -> Integer 
         * float          -> Float
         * double         -> Double
         * char           -> Character
         */

        Pessoa joao = new Pessoa("João", 20);
        Pessoa maria = new Pessoa("Maria", 22);
        Pessoa pedro = new Pessoa("Pedro", 75);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(pedro);
        /*
         * pessoas.add(new Pessoa("João",20));
         * pessoas.add(new Pessoa("Maria",22));
         * pessoas.add(new Pessoa("Pedro, 75"));
         */

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(100);
        numeros.add(78);
        numeros.add(4);
        numeros.add(-32);
        numeros.add(4);
        numeros.add(8);

        //sort -> ordenar
        Collections.sort(numeros, Collections.reverseOrder());

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Goku");
        nomes.add("Zorro");
        nomes.add("Abelha");
        nomes.add("Bob Esponja");

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }


    }
}
