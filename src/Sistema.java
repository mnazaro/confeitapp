import java.util.Date;

public class Sistema {
    private Estoque estoque;
    private Catalogo catalogo;
    private Pedido[] pedidos;

    public void novoPedido() {
    
    }

    public void entrarProduto(String nome, double custo, int quantitade){
        
    }

    public void selecionarProduto(String nome){

    }

    public String cadastrarProduto(String nome, double custo, String tamanho, String modoPreparo, String sabor){

    }

    public void receberPagamento(double valorRecebido, Pedido pedido){

    }

    public void registrarPedidoConcluido(Pedido pedido){

    }

    // Verifica se o produto existe no estoque, caso não exista, cria um novo
    public void reporEstoque(int quantidade, String nome, double preco, Date validade){

    }

    public void finalizarReposicao(){

    }

    public Pedido[] gerarRelatorio(Date inicio, Date fim){

    }

    public Pedido[] filtrarIntervalo(Date inicio, Date fim){

    }

    public Pedido[] listarPedidos(){;
    }

    public Pedido escolherPedido(Pedido pedido){

    }

    public void atualizarStatusPedido(String status, Pedido pedido){
        pedido.atualizarStatus(status);
    }
}