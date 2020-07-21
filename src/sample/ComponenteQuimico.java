package sample;

import java.io.Serializable;

public class ComponenteQuimico implements Serializable {

    protected String nome;
    protected int quantEstoque;
    protected String id;
    protected String descricaoComponente;

    ComponenteQuimico() {

    }
    ComponenteQuimico(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricaoComponente() {
        return descricaoComponente;
    }

    public void setDescricaoComponente(String descricaoComponente) {
        this.descricaoComponente = descricaoComponente;
    }
}
