package sample;

import java.util.ArrayList;

public class ProdutoQuimico {

    protected String dataValidade;
    protected String nome;
    protected int id;
    protected ArrayList<ComponenteQuimico> componentes;

    ProdutoQuimico(){
        componentes = new ArrayList<ComponenteQuimico>();
    }
}
