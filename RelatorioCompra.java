package trabalhop2.SistemaDeJogos;
import java.util.Date;
import java.text.SimpleDateFormat;
public class RelatorioCompra {
    private CarrinhoCompras carrinhoCompras;

    public RelatorioCompra(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

    public void gerarRelatorio(){
        Date dataAtual = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy | HH:mm:ss");
        String dataFormatada = formato.format(dataAtual);
        
        System.out.println("\nTotal de Items: "+carrinhoCompras.getQtdItems());
        System.out.println("Informações dos items comprados:");
        carrinhoCompras.listarItems();
        System.out.println("\nValor total da compra: R$ "+carrinhoCompras.calcularTotal()+"\nMomento da Compra: "+dataFormatada+"\nMetodo de Pagamento: "+carrinhoCompras.getMetodoPagamento());

        System.out.println("\n=============================================================================");
    }
}
