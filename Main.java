import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String arquivoCsv = "caminho/para/o/arquivo.csv";
        GerenciamentoEstoque.lerCsvEGravarNoBanco(arquivoCsv);

        // Simulação: Suponha que você já leu os dados e os tem disponíveis em uma lista
        // Esta parte é apenas um placeholder para representar a operação com os dados
        List<Produto> produtos = List.of(); // Substitua por uma operação real de leitura de banco de dados ou similar

        System.out.println("Total de categorias: " + Relatorios.contarCategorias(produtos));
        System.out.println("Produtos por categoria: " + Relatorios.contarProdutosPorCategoria(produtos));
        System.out.println("Valor médio dos produtos: R$ " + Relatorios.valorMedioProdutos(produtos));
        System.out.println("Produtos com estoque baixo: " + Relatorios.produtosEstoqueBaixo(produtos).size());
    }
}
