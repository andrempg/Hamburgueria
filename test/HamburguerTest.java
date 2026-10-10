import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HamburguerTest {

    private static final double DELTA = 0.001;

    @Test
    void deveRetornarDescricaoDoHamburguer() {
        Sanduiche hamburguer = new Hamburguer();

        assertEquals("Hambúrguer", hamburguer.getDescricao());
    }

    @Test
    void deveRetornarPrecoBaseDoHamburguer() {
        Sanduiche hamburguer = new Hamburguer();

        assertEquals(25.00, hamburguer.getPreco(), DELTA);
    }
}
