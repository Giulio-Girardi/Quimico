package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    private CadComponentesInterface cadastroComponente;
    private CadProdutoInterface cadastroProdutos;
    public Main() {
        super();
        cadastroComponente = new CadComponentesInterface();
        cadastroProdutos = new CadProdutoInterface();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage thestage = primaryStage;

        GridPane painel1;
        painel1 = new GridPane();
        painel1.setAlignment(Pos.TOP_CENTER);
        painel1.setHgap(10);
        painel1.setVgap(10);
        painel1.setPadding(new Insets(25, 25, 25, 25));
        painel1.setGridLinesVisible(false);


        Text scenetitle = new Text("Funcoes do sistema: ");
        scenetitle.setId("welcome-text");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        painel1.add(scenetitle, 0, 0, 2, 1);

        //Botoes de funcionalidades do sistema

        Button btnCadComp = new Button("Cadastrar um novo componente quimico ");
        Button btnCadProd = new Button("Cadastrar um novo produto quimico ");
        Button btnremove = new Button("Remover componente quimico ");
        Button btnConsComp = new Button("Consultar todos os componentes quimicos cadastrados ");
        Button btnConsProd = new Button("Consultar todos os produtos quimicos cadastrados ");
        Button btnCarr = new Button("Carregar dados ");

        //Torna botoes visiveis

        painel1.add(btnCadComp, 0, 3, 2, 1);
        painel1.add(btnCadProd, 0, 4, 2, 1);
        painel1.add(btnremove, 0, 5, 2, 1);
        painel1.add(btnConsComp, 0, 6, 2, 1);
        painel1.add(btnConsProd, 0, 7, 2, 1);
        painel1.add(btnCarr, 0, 8, 2, 1);

        //Tratamento de eventos
        btnCadComp.setOnAction(e -> {
            try {
                cadastroComponente.start(thestage);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        btnCadProd.setOnAction(e -> {
            try {
                cadastroProdutos.start(thestage);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });



        Scene scene1 = new Scene(painel1, 500, 400);
        primaryStage.setTitle("Quimicos ");
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}