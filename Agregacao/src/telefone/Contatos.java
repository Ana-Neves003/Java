package telefone;
import java.util.ArrayList;

public class Contatos {

    private ArrayList<Contato> contatos;

    public Contatos() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionar(String nome, String numero){
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }

    public void adicionar(Contato novContato){
        contatos.add(novContato);
    }

    public Contatos buscar(String palavraChave){
        String palavraChaveMinusculo = palavraChave.toLowerCase();  
        Contatos contatosFiltrados = new Contatos();
        for (Contato contato : contatos) {
            //Esse contato começa com a minha palavraChave?
            String nomeContatoMinusculo = contato.getNome().toLowerCase();
            if(nomeContatoMinusculo.startsWith(palavraChaveMinusculo)){
                // Sim -> vou alvar nos meus contatos filtrados
                contatosFiltrados.adicionar(contato);
            }    
        }
        return contatosFiltrados;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        String informacao = "Contatos:\n";
        for (Contato contato : contatos) {
            informacao += contato.toString() + "\n";
        }
        return informacao;
    }
    
}
