package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class CadastroProdutos implements Serializable {

    private ArrayList<ProdutoQuimico> produtosQuimicos;
    private ProdutoQuimico auxiliar;
    private Registro registrador;


    CadastroProdutos() {
        produtosQuimicos = new ArrayList<ProdutoQuimico>();
        registrador = new Registro();
    }

    public void CadastraProduto(ProdutoQuimico novoProduto) {
        produtosQuimicos.add(novoProduto);
        registrador.gravaProdutos(novoProduto);
        System.out.println("Cadastro efetuado! ");
    }

    //Consulta todos componentes quimicos cadastrados
    public void ListaProdutos() {
        for (int i = 0; i < produtosQuimicos.size(); i++) {
            auxiliar = produtosQuimicos.get(i);
            registrador.leProdutos();
        }
    }

    //Consulta existencia de um produto pelo ID
    public boolean ConsultaProduto(ProdutoQuimico novoProduto) {
        for (int i = 0; i < produtosQuimicos.size(); i++) {
            if (produtosQuimicos.get(i).getId() == novoProduto.getId()) {
                System.out.println("Produto ja esta cadastrado no sistema!");
                return true;
            }
        }
        return false;
    }

    public void ComponentesProduto(ProdutoQuimico conteudo){
        conteudo.getComponentes();
    }
}
