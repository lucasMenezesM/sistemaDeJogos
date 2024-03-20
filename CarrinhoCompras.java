package trabalhop2.SistemaDeJogos;

import java.util.ArrayList;

public class CarrinhoCompras {
    ArrayList<Jogo> itemsCarrinho = new ArrayList<Jogo>();
    private String metodoPagamento;

    public CarrinhoCompras(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void adicionarItem(Jogo jogo){
        if(itemsCarrinho.contains(jogo)){
            System.out.println("O jogo "+jogo.getNome()+ " já está no carrinho.");
        }else{
            itemsCarrinho.add(jogo);
        }
    }

    public void removerItem(Jogo jogo){
        if(itemsCarrinho.contains(jogo)){
            itemsCarrinho.remove(jogo);
        }else{
            System.out.println("O jogo " + jogo.getNome() + " não está no carrinho.");
        }
    }

    public void listarItems(){
        if(itemsCarrinho.size() > 0){
            for (Jogo jogo : itemsCarrinho) {
            System.out.println("Nome: "+jogo.getNome()+" | Desenvolvedora: "+jogo.getDesenvolvedora()+" | Categoria: "+jogo.getCategoria() +" | Preço: R$"+jogo.getPreco());
        }
        }else{
            System.out.println("O carrinho está vazio");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (Jogo jogo : itemsCarrinho) {
            total = total + jogo.getPreco();
        }
        return total;
    }

    public int getQtdItems(){
        return itemsCarrinho.size();
    }


}
