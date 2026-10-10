import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdicionaisTest {

    private static final double DELTA = 0.001;

    @Test
    void deveAdicionarAlfaceAoSanduiche() {
        Sanduiche sanduiche = new Alface(new Hamburguer());

        assertEquals("Hambúrguer, alface", sanduiche.getDescricao());
        assertEquals(26.50, sanduiche.getPreco(), DELTA);
    }

    @Test
    void deveAdicionarBaconAoSanduiche() {
        Sanduiche sanduiche = new Bacon(new Hamburguer());

        assertEquals("Hambúrguer, bacon", sanduiche.getDescricao());
        assertEquals(29.00, sanduiche.getPreco(), DELTA);
    }

    @Test
    void deveAdicionarQueijoAoSanduiche() {
        Sanduiche sanduiche = new Queijo(new Hamburguer());

        assertEquals("Hambúrguer, queijo", sanduiche.getDescricao());
        assertEquals(27.50, sanduiche.getPreco(), DELTA);
    }

    @Test
    void deveAcumularDescricaoEPrecoDeMultiplosAdicionais() {
        Sanduiche sanduiche = new Queijo(new Bacon(new Hamburguer()));

        assertEquals("Hambúrguer, bacon, queijo", sanduiche.getDescricao());
        assertEquals(31.50, sanduiche.getPreco(), DELTA);
    }
}
