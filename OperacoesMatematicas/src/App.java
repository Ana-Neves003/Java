import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroA = -5;
        int numeroB = 9;
        
        int resultado = Math.abs(numeroA);
        int resultado1 = (int) Math.pow(10,2);
        int resultado2 = (int) Math.sqrt(numeroB);

        JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null, resultado1);
        JOptionPane.showMessageDialog(null, resultado2);

    }
}
