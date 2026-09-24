public class PagamentoPix implements FormaDePagamento {

    @Override
    public double pagar(double valor) {
        return valor * 0.95;
    }
}
