import classes.CalculadorArea;
import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(2);
        //System.out.println("Área do círculo = " + circulo.calcularArea());

        Quadrado quadrado = new Quadrado(5);
        //System.out.println("Área do quadrado = " + quadrado.calcularArea());

        CalculadorArea calculador = new CalculadorArea();
        System.out.println(calculador.somarAreas(quadrado, circulo));
    }
}
