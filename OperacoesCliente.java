package trabalhop2.SistemaDeJogos;

public interface OperacoesCliente {
    public void adicionarItemAoCarrinho(Jogo jogo);
    public void removerItemDoCarrinho(Jogo jogo);
    public void listarItemsDoCarrinho();
    public void realizarCompra();
    public void mudarMetodoPagamento(String metodoPagamento);
}
