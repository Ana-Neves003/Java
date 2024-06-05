package devflix;

public class Video {
  
    public Video(String nome) {
        this.nome = nome;
    }

    private String nome;

    public void play(){
        System.out.println("Play: video qualquer");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
