public class Catalogo {
    private Produto[] produtos;

    public void adicionarProduto(Produto produto) {
        Produto[] novoArray = new Produto[produtos.length + 1];
        for (int i = 0; i < produtos.length; i++) {
            novoArray[i] = produtos[i];
        }
        novoArray[novoArray.length - 1] = produto;
        produtos = novoArray;
    }

    public void atualizarProduto(String modoPreparo){

    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
}
