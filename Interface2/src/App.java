import classes.PingPong;
import classes.Videogame;

public class App {
    public static void main(String[] args) throws Exception {
        PingPong pingPong = new PingPong();
        Videogame xDevOne = new Videogame();

        xDevOne.ligar();
        xDevOne.jogar(pingPong);
        //xDevOne.jogar(new PingPong());
        

    }
}
