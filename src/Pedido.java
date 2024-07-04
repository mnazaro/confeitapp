import java.util.Date;

public class Pedido {
    private String status;
    private Date data;
    private String cliente;
    private double valor;
    private Produto[] produtos;
    private Pagamento pagamento;

    public Pedido(String status, Date data, String cliente, double valor, Produto[] produtos) {
        this.status = status;
        this.data = data;
        this.cliente = cliente;
        this.valor = valor;
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        Produto[] novoArray = new Produto[produtos.length + 1];
        for (int i = 0; i < produtos.length; i++) {
            novoArray[i] = produtos[i];
        }
        novoArray[novoArray.length - 1] = produto;
        produtos = novoArray;
    }

    public String atualizarStatus(String status) {
        this.status = status;
        return this.status;
    }

    public void comparaValor(double valor, double valorRecebido){

    }
}
