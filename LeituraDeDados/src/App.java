import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //int numero;
        //float numero2;

        //String jogo;
        String elo;
        String valor;
        int tier;

        //Scanner -> classe 
        //Crio um objeto leitor para ler valores digitados 
        Scanner leitor = new Scanner(System.in);
        //Configurando (definindo que os separadores é ; OU \r OU \n)
        leitor.useDelimiter("[;\r\n]+");

        //Para quebra de linha pode ser 
        //jogo = leitor.nextLine();


        /*
        System.out.println("Digite um número inteiro:");
        numero = leitor.nextInt();

        System.out.println("Digite um número float:");
        numero2 = leitor.nextFloat();

        System.out.println("O número é: " + numero);
        System.out.println("E o número float é: " + numero2);
        */

        //System.out.println("Qual o seu jogo no momento?");
        //jogo = leitor.next();

        //System.out.println("Jogo é: " + jogo);

        System.out.println("Qual o seu elo:");
        elo = leitor.nextLine();

        System.out.println("Qual o seu tier:");
        valor = leitor.nextLine();
        tier = Integer.parseInt(valor);

        System.out.println("Valor = " + (tier+1));

        //System.out.println("Qual o seu campeão favorito?");
        //String campeao = leitor.nextLine();

       // System.out.println("Você é mono "+ campeao + " no elo " + elo + " " + tier);

    }
}
