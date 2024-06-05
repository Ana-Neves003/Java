//import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String filme = JOptionPane.showInputDialog(null,"Qual teu filme preferido de 2021 até o momento", "Academia dos Devs", JOptionPane.QUESTION_MESSAGE);
        String texto = JOptionPane.showInputDialog(null, "Digite um número: ");
        int numero = Integer.parseInt(texto);
        numero = numero*10;
        JOptionPane.showMessageDialog(null, "Filme preferido: " + filme, "Academia dos Devs", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(filme);
        System.out.println(numero);
    }
}
