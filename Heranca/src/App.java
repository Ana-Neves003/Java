import animais.Cachorro;
import animais.Dragao;
import animais.Gato;
import animais.Pombo;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Caramelo");
        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Snobell");
        gato.miar();

        Dragao dragao = new Dragao("Dragão branco de olhos azuis");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombinha = new Pombo("Pombo correio Sedex");
        pombinha.voar();
        pombinha.enviarCarta();
        pombinha.fazerPru();
    }
}
