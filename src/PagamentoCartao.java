public class PagamentoCartao implements FormaDePagamento {

    @Override
    public double pagar(double valor) {
        return valor;
    }
}
