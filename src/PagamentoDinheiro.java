public class PagamentoDinheiro implements FormaDePagamento {

    @Override
    public double pagar(double valor) {
        return valor;
    }
}
