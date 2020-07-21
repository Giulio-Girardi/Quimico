package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CadProdutoInterface extends Application {

    private Inorganicos novoInorganico;
    private Organicos novoOrganico;
    private CadastroProdutos cadastroProdutos;
    private ListView<ComponenteQuimico> componentes;

    public CadProdutoInterface(){
        super();
        novoInorganico = new Inorganicos();
        novoOrganico = new Organicos();
        cadastroProdutos = new CadastroProdutos();
        componentes = new ListView<ComponenteQuimico>();
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


        //Label Checkbox
        Label componenteOrg = new Label("Organico: ");
        painel2.add(componenteOrg, 0, 1);
        Label componenteIno = new Label("Inorganico: ");
        painel2.add(componenteIno, 0, 2);

        //Checkbox tipo de componente
        CheckBox organico = new CheckBox();
        CheckBox inorganico = new CheckBox();
        painel2.add(organico,1,1);
        painel2.add(inorganico,1,2);


        //Label nome
        Label nome = new Label("Nome:");
        painel2.add(nome, 0, 3);

        //Campo nome
        TextField nomeComponente = new TextField();
        painel2.add(nomeComponente, 1, 3);

        //Label descricao produto
        Label descricao = new Label("Descricao:");
        painel2.add(descricao, 0, 4);

        //Campo descricao produto
        TextField descricaoProduto = new TextField();
        painel2.add(descricaoProduto, 1, 4);

        //Label data de validade
        Label validade = new Label("Data de validade:");
        painel2.add(validade, 0, 5);

        //Campo data de validade
        TextField dataValidade = new TextField();
        painel2.add(dataValidade, 1, 5);

        //Label carbono
        Label carbono = new Label("Percentual de carbono:");
        painel2.add(carbono, 0, 6);

        //Campo carbono
        TextField percenCarbono = new TextField();
        painel2.add(percenCarbono, 1, 6);

        //Label componentes
        Label componentesList = new Label("Percentual de carbono:");
        painel2.add(componentesList, 0, 7);

        //Lista de componentes

        Button btnCadComp = new Button("Cadastrar ");
        painel2.add(btnCadComp,1,7);

        //tratamento de evento checkbox
        btnCadComp.setOnAction(e-> {

        });


        Scene scene2 = new Scene(painel2, 400, 600);

        primaryStage.setTitle("Cadastro Componentes");
        primaryStage.setScene(scene2);
        primaryStage.show();
    }
}
