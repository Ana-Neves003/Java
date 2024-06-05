import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        /*
        String personagem = "Goku";
        
        switch(personagem){
            case "Vegeta":
                System.out.println("Planeta Sayajin");
                break;
            case "Goku":
                System.out.println("Planeta Sayajin");
                break;
            case "Bulma":
                System.out.println("Planeta Terra");
                break;
            case "Piccolo":
                System.out.println("Planeta Namekuseijin");
                break;
            case "Kuriri":
                System.out.println("Planeta Terra");
                break;
            default:
                System.out.println("Origem desconhecido");

        }
        */

       // int diaSemana = 7;
        /*
            1 -> domingo -> final de semana
            2 -> segunda
            3 -> terça
            4 -> quarta
            5 -> quinta
            6 -> sexta
            7 -> sábado -. final de semana
         */

         /*
         switch(diaSemana){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;

         }*/

         String personagem = JOptionPane.showInputDialog(null, "Digite um personagem do Dragon Ball");
         String nomeImagem = "";
         String origem = "";

         switch(personagem){
            case "Goku":
                origem = "Planeta Sayajin";
                nomeImagem = "goku-icone";
                break;
            case "Piccolo":
                origem = "Planeta Namekuseijin";
                nomeImagem = "piccolo-icone";
                break;
            case "Vegeta":
                origem = "Planeta Sayajin";
                nomeImagem = "vegeta-icone";
                break;
            case "Bulma":
                origem = "Planeta Terra";
                nomeImagem = "bulma-icone";
                break;
            case "Kuririn":
                origem = "Planeta Terra";
                nomeImagem = "kuririn-icone";
                break;
            default:
                origem = "Origem desconhecida";
                nomeImagem = "default";
         }

         String informacoesPersonagens = String.format("Personagem: %s \nOrigem: %s", personagem,origem);
         String caminhoImagem = String.format("C:/Users/Dell/Documents/Bia/UFRN/2023.1/DIM0410/Java/ProjetoJava/SwitchCase/imagens/%s.png", nomeImagem);
         ImageIcon icone = new ImageIcon(caminhoImagem);
         JOptionPane.showConfirmDialog(null, informacoesPersonagens,"Descrição", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icone);
         
    }
}
