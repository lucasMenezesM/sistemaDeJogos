package trabalhop2.SistemaDeJogos;

public class Jogo{
    private String nome, id;
    private double preco;
    private Categoria categoria;
    private Desenvolvedora desenvolvedora;
    private static int qtdJogos;

    public Jogo(String nome, String id, double preco, Categoria categoria, Desenvolvedora desenvolvedora) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.categoria = categoria;
        this.desenvolvedora = desenvolvedora;
        this.categoria.adicionarJogo(this);
        this.desenvolvedora.adicionarJogo(this);
        Jogo.qtdJogos+=1;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getCategoria() {
        return this.categoria.getNome();
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getDesenvolvedora() {
        return this.desenvolvedora.getNome();
    }
    public void setDesenvolvedora(Desenvolvedora desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public static int getQtdJogos() {
        return qtdJogos;
    }

}