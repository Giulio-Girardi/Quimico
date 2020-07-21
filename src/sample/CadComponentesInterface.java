package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CadComponentesInterface extends Application {

    private CadastroComponentes cadastroComponentes;
    private ComponenteQuimico componentes;

    CadComponentesInterface(){
        super();
        cadastroComponentes = new CadastroComponentes();
        componentes = new ComponenteQuimico();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage thestage = primaryStage;

        GridPane painel2 = new GridPane();

        painel2.setAlignment(Pos.CENTER);
        painel2.setHgap(10);
        painel2.setVgap(10);
        painel2.setPadding(new Insets(25, 25, 25, 25));
        painel2.setGridLinesVisible(false);

        Text scenetitle = new Text("Cadastro de Componente");
        scenetitle.setId("welcome-text");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        painel2.add(scenetitle, 0, 0, 2, 1);


        //Label nome
        Label nome = new Label("Nome:");
        painel2.add(nome, 0, 3);

        //Campo nome
        TextField nomeComponente = new TextField();
        painel2.add(nomeComponente, 1, 3);

        //Label descricao componente
        Label descricao = new Label("Descricao:");
        painel2.add(descricao, 0, 4);

        //Campo descricao componente
        TextField descricaoComponente = new TextField();
        painel2.add(descricaoComponente, 1, 4);

        //Label ID
        Label id = new Label("Codigo:");
        painel2.add(id, 0, 5);

        //Campo ID
        TextField idComponente = new TextField();
        painel2.add(idComponente, 1, 5);


        Button btnCadComp = new Button("Cadastrar ");
        painel2.add(btnCadComp,1,7);


        btnCadComp.setOnAction(e-> {
            {
                componentes.setId(idComponente.getText());
                if (cadastroComponentes.ConsultaComponente(componentes)==true){
                    System.out.println("Componente ja esta cadastrado no sistema! ");
                }else{
                    componentes.setNome(nomeComponente.getText());
                    componentes.setDescricaoComponente(descricaoComponente.getText());
                    cadastroComponentes.CadastraComponente(componentes);
                }
            }
        });



        Scene scene2 = new Scene(painel2, 400, 600);

        primaryStage.setTitle("Cadastro Componentes");
        primaryStage.setScene(scene2);
        primaryStage.show();
    }
}
