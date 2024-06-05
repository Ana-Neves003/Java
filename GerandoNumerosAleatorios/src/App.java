import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //int dado6Faces = 1 + (int) (Math.random()*6);
        //JOptionPane.showMessageDialog(null, dado6Faces);

        //Random gerador = new Random();
        //int numero = gerador.nextInt(6)+1; //6 é o maior número, 1 é o menor número
        //JOptionPane.showMessageDialog(null, numero);

        Random gerador = new Random();

        String facesString = JOptionPane.showInputDialog(null, "Quantas faces tem um dado?");

        int facesDado = Integer.parseInt(facesString);

        int resultado = 1 + gerador.nextInt(facesDado);

        JOptionPane.showMessageDialog(null, "Você tirou " + resultado + " no dado");

        
    }
}
