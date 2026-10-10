import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentosTest {

    private static final double DELTA = 0.001;

    @Test
    void deveManterValorNoPagamentoComCartao() {
        FormaDePagamento pagamento = new PagamentoCartao();

        assertEquals(25.00, pagamento.pagar(25.00), DELTA);
    }

    @Test
    void deveAplicarDezPorCentoDeDescontoNoPagamentoEmDinheiro() {
        FormaDePagamento pagamento = new PagamentoDinheiro();

        assertEquals(22.50, pagamento.pagar(25.00), DELTA);
    }

    @Test
    void deveAplicarCincoPorCentoDeDescontoNoPagamentoComPix() {
        FormaDePagamento pagamento = new PagamentoPix();

        assertEquals(23.75, pagamento.pagar(25.00), DELTA);
    }
}
