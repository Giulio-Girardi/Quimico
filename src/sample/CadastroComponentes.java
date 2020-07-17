package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class CadastroComponentes {

    private ArrayList<ComponenteQuimico> componentesQuimicos;


    CadastroComponentes() {
        componentesQuimicos = new ArrayList<ComponenteQuimico>();
    }

    public void CadastraComponente(ComponenteQuimico novoComponente) {
            componentesQuimicos.add(novoComponente);
            System.out.println("Cadastro efetuado! ");
    }

    public boolean ConsultaComponente(ComponenteQuimico novoComponente) {

        for (int i = 0; i < componentesQuimicos.size(); i++) {
            if (componentesQuimicos.get(i).getId() == novoComponente.getId()) {
                System.out.println("Componente ja esta cadastrado no sistema!");
                return true;
            }
        }
        return false;
    }
}
