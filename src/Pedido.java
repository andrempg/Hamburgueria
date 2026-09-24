public class Pedido {

    private Sanduiche sanduiche;
    private FormaDePagamento formaPagamento;

    public Pedido(Sanduiche sanduiche, FormaDePagamento formaPagamento) {
        this.sanduiche = sanduiche;
        this.formaPagamento = formaPagamento;
    }

    public double calcularTotal() {
        return sanduiche.getPreco();
    }

    public double finalizarPedido() {
        return formaPagamento.pagar(calcularTotal());
    }
}
