import java.util.Date;

public class Sistema {
    private Estoque estoque;
    private Catalogo catalogo;
    private Pedido[] pedidos;

    public void novoPedido(String cliente, String endereco, Date dataEntrega) {
    
    }

    public void registrarNovoPedido(){

    }

    public Produto personalizarProduto(String nome){

    }
    
    public String cadastrarProduto(String nome, float custo, String ingredientes, String modoPreparo){

    }

    public void receberPagamento(float valorRecebido, Pedido pedido){

    }

    public void registrarPedidoConcluido(Pedido pedido){

    }

    // Verifica se o produto existe no estoque, caso não exista, cria um novo
    public void reporEstoque(int quantidade, String nome, float preco, Date validade){

    }

    public void finalizarReposicao(){

    }

    public Pedido[] exibirRelatorio(Date inicio, Date fim){

    }

    public Pedido[] filtrarIntervalo(Date inicio, Date fim){

    }

    public void atualizarStatusPedido(String status, Pedido pedido){
        pedido.atualizarStatus(status);
    }
}