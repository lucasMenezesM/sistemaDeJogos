package trabalhop2.SistemaDeJogos;
import java.util.ArrayList;

public class Promocao implements GerenciamentoJogos{
    private String nome;
    private double porcentagem;
    private ArrayList<Jogo> listaJogos;

    public Promocao(String nome, double porcentagem) {
        this.nome = nome;
        this.porcentagem = porcentagem;
        listaJogos = new ArrayList<Jogo>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public String adicionarJogo(Jogo jogo) {
        if(listaJogos.contains(jogo)){
            return "o jogo "+jogo.getNome()+" já está cadastrado na Promoção "+this.getNome();
        }else{
            listaJogos.add(jogo);
            double novoPreco = jogo.getPreco() - (jogo.getPreco() * (this.getPorcentagem()/100));
            jogo.setPreco(novoPreco);
            return "O jogo "+jogo.getNome()+" foi adicionado na promoção "+this.getNome()+" e agora custa R$ "+novoPreco;
        }
    }

    @Override
    public String removerJogo(Jogo jogo) {
        if(listaJogos.contains(jogo)){
            listaJogos.remove(jogo);
            double novoPreco = jogo.getPreco() + (jogo.getPreco() * (this.getPorcentagem()/100));
            jogo.setPreco(novoPreco);
            return "O jogo "+jogo.getNome()+" foi removido da lista da Promoção "+this.getNome();
        }else{
            return "O jogo "+jogo.getNome()+" não está cadastrado na promoção "+this.getNome();
        }
    }

    @Override
    public void listarJogos() {
        System.out.println("\nJogos cadastrados na Promoção "+this.nome+":");
        for(Jogo jogo: listaJogos){
            System.out.println(jogo.getNome());
        }
    }
    
}
