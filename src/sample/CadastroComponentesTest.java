package sample;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CadastroComponentesTest {

    private ComponenteQuimico testeComponente;
    private CadastroComponentes testeCadastro;
    private ArrayList<ComponenteQuimico> testeComponentesQuimicos;

    @BeforeEach
    public void setUP()throws Exception{
        testeComponente = new ComponenteQuimico();
        testeCadastro = new CadastroComponentes();
    }

    @Test
    void cadastraComponente() {
        testeComponente.setNome("ComponenteTeste");
        testeComponente.setId("1");
        testeComponente.setDescricaoComponente("teste");
        testeComponente.setQuantEstoque(1);
        assertEquals(1,testeComponente.quantEstoque);
    }



}