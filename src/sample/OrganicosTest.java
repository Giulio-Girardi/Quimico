package sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganicosTest {

    private Organicos organicosTeste;

    @BeforeEach
    public void setUp() throws Exception{
        organicosTeste = new Organicos();
    }

    @Test
    void getPercentCarbono() {
        organicosTeste.setPercentCarbono(5);
        int atual = organicosTeste.getPercentCarbono();
        assertEquals(5,atual);
    }

    @Test
    void setPercentCarbono() {
        organicosTeste.setPercentCarbono(6);
        assertEquals(6,organicosTeste.getPercentCarbono());
    }
}