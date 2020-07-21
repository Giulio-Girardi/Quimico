package sample;

import java.io.Serializable;
import java.util.ArrayList;


public class CadastroComponentes implements Serializable {

    private ArrayList<ComponenteQuimico> componentesQuimicos;
    private ComponenteQuimico auxiliar;
    private Registro registrador;
    private CadastroProdutos produtos;


    CadastroComponentes() {
        componentesQuimicos = new ArrayList<ComponenteQuimico>();
        auxiliar = new ComponenteQuimico();
        registrador = new Registro();
        produtos = new CadastroProdutos();
    }

    //Cadastra novo componente: primeira funcao do sistema
    public void CadastraComponente(ComponenteQuimico novoComponente) {
        componentesQuimicos.add(novoComponente);
        registrador.gravaComponentes(novoComponente);
        novoComponente.setQuantEstoque(novoComponente.getQuantEstoque()+1);
        System.out.println("Cadastro efetuado! ");
    }


    //Consulta existencia do cadastro de um componente pelo Id
    public boolean ConsultaComponente(ComponenteQuimico novoComponente) {
        for (int i = 0; i < componentesQuimicos.size(); i++) {
            if (componentesQuimicos.get(i).getId() == novoComponente.getId()) {
                System.out.println("Componente ja esta cadastrado no sistema!");
                return true;
            }
        }
        return false;
    }

    //Consulta todos componentes quimicos cadastrados
    public void ListaComponentes() {
        for (int i = 0; i < componentesQuimicos.size(); i++) {
            auxiliar = componentesQuimicos.get(i);
            registrador.leComponentes();
        }
    }

    //Remove componente ja cadastrado
    public void removeComponente(String componenteRemovido) {
        for (int i = 0; i < componentesQuimicos.size(); i++) {
            if (componentesQuimicos.get(i).getId() == componenteRemovido) {
                //precisa implementar parte de produtos para finalizar o método
            }
        }

    }


}
