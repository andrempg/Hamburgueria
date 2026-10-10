import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {

    private static final double DELTA = 0.001;

    @Test
    void deveCalcularSubtotalComOsAdicionaisDoSanduiche() {
        Sanduiche sanduiche = new Queijo(new Bacon(new Hamburguer()));
        Pedido pedido = new Pedido(sanduiche, new PagamentoCartao());

        assertEquals(31.50, pedido.calcularTotal(), DELTA);
    }

    @Test
    void deveFinalizarPedidoAplicandoFormaDePagamento() {
        Pedido pedido = new Pedido(new Hamburguer(), new PagamentoPix());

        assertEquals(23.75, pedido.finalizarPedido(), DELTA);
    }
}
