package trabalhop2.SistemaDeJogos;

public class Cliente extends Usuario implements OperacoesCliente{
    private String idCliente;
    private CarrinhoCompras carrinhoDeCompras;
    
    public Cliente(String nome, String cpf, String email, String senha, String endereco, String id, String metodoPagamento) {
        super(nome, cpf, email, senha, endereco);
        setIdCliente(id);
        carrinhoDeCompras = new CarrinhoCompras(metodoPagamento);
    }

    
    public String getIdCliente(){
        return this.idCliente;
    }
    
    public void setIdCliente(String id){
        this.idCliente = id;
    }
    
    @Override
    public String imprimirDados() {
        System.out.println("\n=====================================================================================\n");
        return super.imprimirDados() + " | ID do cliente: "+this.getIdCliente()+" | Método de pagamento: "+carrinhoDeCompras.getMetodoPagamento()+"\n";
        
    }

    @Override
    public void adicionarItemAoCarrinho(Jogo jogo){
        carrinhoDeCompras.adicionarItem(jogo);
    }

    @Override
    public void removerItemDoCarrinho(Jogo jogo){
        carrinhoDeCompras.removerItem(jogo);
    }
    
    @Override
    public void listarItemsDoCarrinho(){
        if(carrinhoDeCompras.getQtdItems() > 0){
            System.out.println("\nItems do carrinho de compras do usuario "+this.getNome()+":");
            carrinhoDeCompras.listarItems();
        }else{
            System.out.println("\nO carrinho de compras do Usuário "+this.getNome()+" não possui nenhum item.");
        }
    }

    @Override
    public void mudarMetodoPagamento(String metodoPagamento){
        String metodoEscolhido = metodoPagamento.toLowerCase();
        switch(metodoEscolhido){
            case "pix", "cartao", "boleto":
                carrinhoDeCompras.setMetodoPagamento(metodoPagamento);
                break;
                default:
                System.out.println("Método invalido\nMétodos disponíveis:\n"+
                "| Cartão | Pix | Boleto |");
                break;
            }
        }

    @Override
    public void realizarCompra(){
        if(carrinhoDeCompras.getQtdItems() > 0){
            Compra novaCompra = new Compra(carrinhoDeCompras);
            novaCompra.finalizarCompra();
        }else{
            System.out.println("O carrinho de compras do Cliente "+this.getNome()+" está vazio.");
        }
    }

}