import java.util.Date;

public class Pedido {
    private String status;
    private Date data;
    private String cliente;
    private float valor;
    private Date dataEntrega;
    private String endereco;
    private float valorPago;
    private Produto[] produtos;

    public Pedido(String cliente, String endereco, Date dataEntrega) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.dataEntrega = dataEntrega;
    }

    public void entrarProduto(String nome, int quantidade) {
        
    }

    public String atualizarStatus(String status) {
        this.status = status;
        return this.status;
    }

    public void comparaValor(float valor, float valorRecebido){

    }

    public float calcularTotal(){
        return float;
    }
}
