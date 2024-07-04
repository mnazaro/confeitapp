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
        
    }

    public String atualizarStatus(String status) {
        this.status = status;
        return this.status;
    }

    public void comparaValor(double valor, double valorRecebido){

    }
}
