import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    int calcularDano(){
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(20);

        return (forca + dado20Faces);
    }

    void mostrarStatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        }else{
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);
        }
    }
}
