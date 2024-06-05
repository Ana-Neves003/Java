//import devflix.Filme;
import devflix.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        //Filme filme = new Filme("Lagoa Azul");
        //filme.play();
        //filme.play("japonês");
        //filme.play("inglês","árabe");

        Serie serie = new Serie("The Last of US", 2, 10);
        serie.play(2, 8);
        //System.out.println(serie);

    }
}
