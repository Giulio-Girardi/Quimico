package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InorganicosTest {

    private Inorganicos inorganicosTeste;

    @BeforeEach
    public void setUp()throws Exception{
        inorganicosTeste = new Inorganicos();
    }

    @Test
    void getDescricaoUso() {
        inorganicosTeste.setDescricaoUso("Testando descricao de uso");
        String atual = inorganicosTeste.getDescricaoUso();
        assertEquals("Testando descricao de uso",atual);
    }

    @Test
    void setDescricaoUso() {
        inorganicosTeste.setDescricaoUso("Testando");
        assertEquals("Testando",inorganicosTeste.getDescricaoUso());
    }
}