package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoQuimicoTest {

    private ProdutoQuimico prodTest;

    @BeforeEach
    public void setUp() throws Exception{
        prodTest = new ProdutoQuimico();
    }

    @Test
    void getDataValidade() {
        prodTest.setDataValidade("01/02/2000");
        String atual = prodTest.getDataValidade();
        assertEquals("01/02/2000",atual);

    }

    @Test
    void setDataValidade() {
        prodTest.setDataValidade("03/10/1995");
        assertEquals("03/10/1995",prodTest.getDataValidade());
    }


    @Test
    void getNome() {
        prodTest.setNome("nometeste");
        String atual = prodTest.getNome();
        assertEquals("nometeste",atual);
    }

    @Test
    void setNome() {
        prodTest.setNome("Teste Produto");
        assertEquals("Teste Produto",prodTest.getNome());
    }

    @Test
    void getId() {
        prodTest.setId("2");
        String atual = prodTest.getId();
        assertEquals("2",atual);

    }

    @Test
    void setId() {
        prodTest.setId("4");
        assertEquals("4",prodTest.getId());
    }
}