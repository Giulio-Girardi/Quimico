package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class ProdutoQuimico implements Serializable {

    protected String dataValidade;
    protected String nome;
    protected String id;
    protected ArrayList<CadastroComponentes> componentes;
    protected CadastroComponentes auxiliar;

    ProdutoQuimico(){
        componentes = new ArrayList<CadastroComponentes>();
        auxiliar = new CadastroComponentes();
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ArrayList<CadastroComponentes> getComponentes() {
        return componentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
