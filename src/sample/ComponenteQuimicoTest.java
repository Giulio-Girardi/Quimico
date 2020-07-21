package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponenteQuimicoTest {

    private ComponenteQuimico compTest;


    @BeforeEach
    public void setUp() throws Exception {
        compTest = new ComponenteQuimico("teste");
    }

    @Test
    void getNome() {
        String atual = compTest.getNome();
        assertEquals("teste",atual);

    }

    @Test
    void setNome() {
        compTest.setNome("testando");
        assertEquals("testando",compTest.getNome());
    }

    @Test
    void getQuantEstoque() {
        int atual = compTest.getQuantEstoque();
        assertEquals(0,atual);
    }

    @Test
    void setQuantEstoque() {
        compTest.setQuantEstoque(2);
        assertEquals(2,compTest.getQuantEstoque());
    }

    @Test
    void getId() {
        compTest.setId("2");
        String atual = compTest.getId();
        assertEquals("2",atual);

    }

    @Test
    void setId() {
        compTest.setId("4");
        assertEquals("4",compTest.getId());
    }

    @Test
    void getDescricaoComponente() {
        compTest.setDescricaoComponente("Testando descricao");
        String atual = compTest.getDescricaoComponente();
        assertEquals("Testando descricao",atual);
    }

    @Test
    void setDescricaoComponente() {
        compTest.setDescricaoComponente("Testando setter");
        assertEquals("Testando setter",compTest.getDescricaoComponente());
    }
}