//Aula de variavel 

public class App {
    public static void main(String[] args) throws Exception {
        /*/
        //variáveis do tipo Inteiro

        //variáveis inteiro byte <short <int <long 
        //byte é uma variável que pode armazenar valores entre -128 a 127
        byte numeroPequeno=125;
        System.out.println(numeroPequeno);

        //short é uma variável que pode armazenar valores entre -32768 a 32767
        short numeroShort=32767;
        System.out.println(numeroShort);

        //int é uma variável que pode armazenar valores entre -2147483648 a -2147483647 
        int numeroMaior=-2147483648;
        System.out.println(numeroMaior);

        //long é uma variável que pode armazenar um valor até 92233720368547700
        long numeroEnorme=92233720368547700l;
        System.out.println(numeroEnorme);


        //Variáveis do tipo Ponto Flutuante
        
        float peso = 78.7f;
        System.out.println(peso);

        double pi = 3.14159265358979323846; 
        System.out.println(pi);

        //variáveis do tipo caractere

        char letra = '+';
        System.out.println(letra);

        //Variável booleana

        boolean estouComFome = false;
        System.out.println(estouComFome);

        //Variável do tipo String

        String nome = "Ana";
        System.out.println(nome);
*/
        String filme = "Vingadores"; //%s
        int anoLancamento = 2015; //%d
        int duracao = 240; //%d
        float notaCritica = 8.7f; //%f
        char letraInicial = 'V'; //%c
        boolean foiSucesso = true; //%b

        System.out.println("O filme " + filme);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao);
        System.out.println("Nota média: " + notaCritica);
        System.out.println("Letra inicial: " + letraInicial);
        System.out.println("Foi sucesso? " + foiSucesso);

        System.out.println("O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos.");
        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);

        String texto = "O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos.";    
        System.out.println(texto);
        
        String texto2 = String.format("-> O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);
        System.out.println(texto2);

        String canal = "Academia dos Devs";
        String mensagem = "Se inscreva no canal";
        String mensagem2 = "Obrigado o/";
        int metaInscritos = 1000;

        //String mensagemFinal = mensagem + " " + canal + " " + mensagem2;
        String mensagemFinal = String.format("%s %s. Meta de inscritos é %d. %s", mensagem, canal, metaInscritos, mensagem2);
        System.out.println(mensagemFinal);
        
    }
}
