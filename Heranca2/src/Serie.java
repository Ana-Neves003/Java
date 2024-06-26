public class Serie {
    
    private String nome;
    private int temporadas;
    private int ano;

    public Serie(String nome, int temporadas, int ano) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.ano = ano;
    }

    //Métodos específicos da classe
    public String pegarInformacoes(){
        String informacoes = String.format("Nome: %s (%d) - %d temporadas", nome, ano, temporadas);
        return informacoes;
        //System.out.printf("Nome: %s (%d) - %d temporadas", nome, ano, temporadas);
    }

    @Override
    public String toString(){
        String informacoes = String.format("Nome: %s (%d) - %d temporadas", nome, ano, temporadas);
        return informacoes;
        //return "abacaxi";
    }


    //Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
