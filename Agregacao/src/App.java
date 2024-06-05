import telefone.Contato;
import telefone.Contatos;
//import telefone.Ligacao;
import telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("4002 8922");
        System.out.println(telefone.getContatos());
        Contato contatoA = new Contato("João", "4052 3789");
        Contato contatoB = new Contato("Leandro", "7895 3102");
        Contato contatoC = new Contato("Luana", "2589 3265");
        Contato contatoD = new Contato("Lucas", "8596 9865");

        //telefone.getContatos().adicionar(contatoA);
        //telefone.getContatos().adicionar(contatoB);
        //telefone.getContatos().adicionar(contatoC);
        Contatos telefoneContatos = telefone .getContatos();

        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);
       
        System.out.println(telefoneContatos);

        System.out.println("Contatos filtrados:");
        System.out.println(telefoneContatos.buscar("l"));

        //Ligacao ligacao = new Ligacao("1234 5678", "9012 3456");
        //ligacao.ligar();
        //System.out.println(ligacao);

        telefone.ligar(contatoA);
        telefone.ligar(contatoB);
        telefone.ligar(contatoC);
        telefone.ligar(contatoD);
        System.out.println(telefone.getChamadas());
    }
}
