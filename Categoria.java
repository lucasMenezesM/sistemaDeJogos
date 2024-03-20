package trabalhop2.SistemaDeJogos;
import java.util.ArrayList;

public class Categoria implements GerenciamentoJogos{
    private String nome;
    private ArrayList<Jogo> listaJogos;

    public Categoria(String nome) {
        this.nome = nome;
        listaJogos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String adicionarJogo(Jogo jogo){
        listaJogos.add(jogo);
        return "O jogo "+jogo.getNome()+" foi adicionado na Categoria "+this.getNome()+".";
    }

    @Override
    public String removerJogo(Jogo jogo){
        listaJogos.remove(jogo);
        return "O jogo "+jogo.getNome()+" foi removido da lista da Categoria "+this.getNome();
    }

    @Override
    public void listarJogos(){
        if(listaJogos.size() > 0){
            System.out.println("\nJogos cadastrados na categoria "+this.nome+":");
            for(Jogo jogo: listaJogos){
                System.out.println(jogo.getNome());
            }
        }else{
            System.out.println("A Desenvolvedora "+this.getNome()+" ainda não possui jogos.");
        }
    }
    
}