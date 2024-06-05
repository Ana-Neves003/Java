package jogo;

public final class Arqueiro extends Personagem{

    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco Longo";
    }

    @Override
    public String toString() {
        String informacaoPersonagem = super.toString();
        String informacaoArqueiro = String.format(" - Arma: %s", arma);
        //String informacoes = String.format("%s (nível: %d) - Classe %s - Arma: %s", getNome(), getNivel(), getClasse(), arma);
        return (informacaoPersonagem + informacaoArqueiro);
    }

    @Override
    public void atacarComArma() {
        System.out.println("O arqueiro atacou com " + arma); 
    }
    
}
