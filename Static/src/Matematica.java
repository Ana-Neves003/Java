public class Matematica {
    private static double valorPI = Math.PI;

    public static int somar(int numeroA, int numeroB){
        return(numeroA + numeroB);
    }

    public static double calcularAreaQuadrado(double lado){
        return(Math.pow(lado, 2));
    }

    public static double calcularAreaCirculo(double raio){
        return(valorPI*Math.pow(raio, 2));
    }

    public static double calcularDobroAreaCirculo(double raio){
        return (Math.pow(calcularAreaCirculo(raio), 2));
    }
}
