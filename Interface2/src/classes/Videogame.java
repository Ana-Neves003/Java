package classes;

public class Videogame {
    private boolean estaLigado;
    private Jogo jogo;

    public void ligar (){
        System.out.println("Ligando o videogame ... ");
        this.estaLigado = true;
    }

    public void jogar(Jogo jogo){
        if(estaLigado == true){
            System.out.println("Iniciando o jogo ... ");
            this.jogo = jogo;
            jogo.jogar();
        }else{
            System.out.println("Videogame está desligado!");
        }
    }

    public void fechar(){
        if(estaLigado == true){
            System.out.println("Fechando o jogo ... ");
        //boolean temJogoRodando = jogo != null;
        //if(temJogoRodando){
            if(jogo != null){
                jogo.fechar();
                jogo = null;
            }else{
                System.out.println("Não tem nenhum jogo rodando");
            }
        }else{
            System.out.println("Videogame está desligado!");
        }
        
    }  
}
