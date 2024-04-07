public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private String categoria;
    private double preco;

    public Produto(int id, String nome, int quantidade, String categoria, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }
}
