class Produto {
    String nome;
    double preco;
    int quantidade;
 
    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
 
    double calcularValorTotal() {
        return preco * quantidade;
    }
 
    void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    }
}
 
class Produto01 {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3500.00, 10);
        p.exibirInformacoes();
    }
}