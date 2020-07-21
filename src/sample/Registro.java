package sample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Registro {

    //private CadastroComponentes dadoComponentes;
    //private CadastroProdutos dadoProdutos;
    private ComponenteQuimico lendoComponente;
    private ProdutoQuimico lendoProduto;

    Registro() {

        lendoComponente = new ComponenteQuimico();

    }


    //Grava o novo componente cadastrado
    public void gravaComponentes(ComponenteQuimico novoComponente) {
        Path arq1 = Paths.get("Componentes.txt");
        try (ObjectOutputStream oarq = new ObjectOutputStream(Files.newOutputStream(arq1))) {
            oarq.writeObject(novoComponente);
        } catch (IOException e) {
            System.out.println("Problemas na gravacao do arquivo: " + e.getMessage());
        }
    }

    //Grava o novo produto cadastrado
    public void gravaProdutos(ProdutoQuimico novoProduto) {
        Path arq1 = Paths.get("Componentes.txt");
        try (ObjectOutputStream oarq = new ObjectOutputStream(Files.newOutputStream(arq1))) {
            oarq.writeObject(novoProduto);
        } catch (IOException e) {
            System.out.println("Problemas na gravacao do arquivo: " + e.getMessage());
        }
    }

    //Le os produtos cadastrados
    public void leProdutos() {
        Path arq1 = Paths.get("Componentes.txt");
        lendoProduto = null;
        try (ObjectInputStream iarq = new ObjectInputStream(Files.newInputStream(arq1))) {
            lendoProduto = (ProdutoQuimico) iarq.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("Problema na leitura do arquivo (cast): " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problema na leitura do arquivo: " + e.getMessage());
        }
        System.out.println("ID: " + lendoProduto.getId() + " Nome: " + lendoProduto.getNome() + " Validade: " + lendoProduto.getDataValidade()
                + " Componentes: " + lendoProduto.getComponentes());

    }

    //Le os componentes cadastrados
    public void leComponentes() {
        Path arq1 = Paths.get("Componentes.txt");
        lendoComponente = null;
        try (ObjectInputStream iarq = new ObjectInputStream(Files.newInputStream(arq1))) {
            lendoComponente = (ComponenteQuimico) iarq.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("Problema na leitura do arquivo (cast): " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problema na leitura do arquivo: " + e.getMessage());
        }
        System.out.println("ID: " + lendoComponente.getId() + " Nome: " + lendoComponente.getNome() + " Descricao: " + lendoComponente.getDescricaoComponente()
                + " Estoque: " + lendoComponente.getQuantEstoque());

    }


    public void RegistraComponente(ComponenteQuimico registro) throws IOException {
        //Cria arquivo txt
        Path path1 = Paths.get("src/Componentes.txt");

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path1, Charset.defaultCharset()))) {
            writer.format("%d;%s;%d;%s", registro.getId(), registro.getNome(), registro.getQuantEstoque()
                    , registro.getDescricaoComponente());

        } catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }


}


