import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {
    //Hamburguer sem nenhum adicional
    @Test
    void DeveRetornar10Reais() {
        Hamburguer hamburguer = new HamburguerBase(10.0f);

        assertEquals(10.0f, hamburguer.getPreco());
    }

    //Hamburguer com batata
    @Test
    void DeveRetornar25Reais() {
        Hamburguer hamburguer = new BatataFrita(new HamburguerBase(10.0f));

        assertEquals(25.0f, hamburguer.getPreco());
    }

    //hamburguer com carne extra
    @Test
    void DeveRetornar18Reais() {
        Hamburguer hamburguer = new Carne(new HamburguerBase(10.0f));

        assertEquals(18.0f, hamburguer.getPreco());
    }

    //hamburguer com refrigerante
    @Test
    void DeveRetornar20Reais() {
        Hamburguer hamburguer = new Refrigerante(new HamburguerBase(10.0f));

        assertEquals(20.0f, hamburguer.getPreco());
    }

    //Hamburguer com salada
    @Test
    void DeveRetornar13Reais() {
        Hamburguer hamburguer = new Salada(new HamburguerBase(10.0f));

        assertEquals(13.0f, hamburguer.getPreco());
    }

    // Hamburguer com Batata, carne, refri e salada
    @Test
    void DeveRetornar46Reais() {
        Hamburguer hamburguer = new BatataFrita(new Carne(new Refrigerante(new Salada(new HamburguerBase(10.0f)) )));

        assertEquals(46.0f, hamburguer.getPreco());
    }
}
