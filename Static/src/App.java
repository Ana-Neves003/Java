public class App {
    static int soma = 0;

    private static void imprimirMensagem(){
        System.out.println("Testando... ");
    }
    public static void main(String[] args) throws Exception {
        //Matematica matematica = new Matematica();
        //System.out.println(matematica.calcularAreaQuadrado(5));
        //System.out.println(matematica.calcularAreaCirculo(4));

        //Usando o STATIC
        //System.out.println(Matematica.calcularAreaQuadrado(2));
        //System.out.println(Matematica.calcularAreaCirculo(1.2));
        //System.out.println(Matematica.somar(5, 10));

        soma = 50;
        System.out.println("Soma = " + soma);
        imprimirMensagem();

        Carro ferrari = new Carro("Ferrari", 2023);
        Carro fusca = new Carro("Fusca", 1999);

        //ferrari.anoCompra = 2007;
        //fusca.anoCompra = 2020;

        Carro.anoCompra = 2016;

        System.out.println(ferrari.getNome());
        //System.out.println(ferrari.anoCompra);


        System.out.println(fusca.getNome());
        //System.out.println(fusca.anoCompra);

        System.out.println(Carro.anoCompra);
    }
}
