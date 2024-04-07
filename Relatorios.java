import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Relatorios {

    public static long contarCategorias(List<Produto> produtos) {
        return produtos.stream()
                .map(Produto::getCategoria)
                .distinct()
                .count();
    }

    public static Map<String, Long> contarProdutosPorCategoria(List<Produto> produtos) {
        return produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
    }

    public static double valorMedioProdutos(List<Produto> produtos) {
        return produtos.stream()
                .mapToDouble(Produto::getPreco)
                .average()
                .orElse(0.0);
    }

    public static List<Produto> produtosEstoqueBaixo(List<Produto> produtos) {
        return produtos.stream()
                .filter(p -> p.getQuantidade() < 3)
                .collect(Collectors.toList());
    }
}
