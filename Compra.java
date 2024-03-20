package trabalhop2.SistemaDeJogos;

public class Compra {
    CarrinhoCompras carrinhoCompras;
    private double totalCompra;

    public Compra(CarrinhoCompras carrinho){
        this.carrinhoCompras = carrinho;
        calcularValorFinal();
    }

    public void calcularValorFinal(){
        this.totalCompra = carrinhoCompras.calcularTotal();
    }

    public double getTotalCompra(){
        return this.totalCompra;
    }

    public void finalizarCompra(){
        
        System.out.println("=============================================================================");
        System.out.println("\nCompra realizada");
        System.out.println("\r\n" + //
                "(_\\______/________\r\n" + //
                "   \\-|-|/|-|-|-|-|/\r\n" + //
                "    \\==/-|-|-|-|-/\r\n" + //
                "     \\/|-|-|-|,-'\r\n" + //
                "      \\--|-'''\r\n" + //
                "       \\_j________\r\n" + //
                "       (_)     (_)");
        RelatorioCompra relatorio = new RelatorioCompra(carrinhoCompras);

        relatorio.gerarRelatorio();
    }
}
