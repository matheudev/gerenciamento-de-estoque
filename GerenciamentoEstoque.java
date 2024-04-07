import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciamentoEstoque {

    public static void lerCsvEGravarNoBanco(String arquivoCsv) {
        try {
            List<Produto> produtos = Files.lines(Paths.get(arquivoCsv))
                    .skip(1) // Pula a linha de cabeçalho
                    .map(linha -> linha.split(","))
                    .map(dados -> new Produto(
                            Integer.parseInt(dados[0]),
                            dados[1],
                            Integer.parseInt(dados[2]),
                            dados[3],
                            Double.parseDouble(dados[4])
                    )).collect(Collectors.toList());

            gravarProdutosNoBanco(produtos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void gravarProdutosNoBanco(List<Produto> produtos) {
        // Implementação da gravação no banco de dados
    }
}
