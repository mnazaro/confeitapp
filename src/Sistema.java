import java.util.Date;

public class Sistema {
    private Estoque estoque;
    private Catalogo catalogo;
    private Pedido[] pedidos;

    public void novoPedido() {
        pedidos = new Pedido[pedidos.length + 1];
    
    }

    public void entrarProduto(String nome, double custo, int quantitade){
        pedidos[pedidos.length - 1].adicionarProduto(new Produto(custo, "grande", nome, "modo de preparo", "sabor"));
    }

    public void selecionarProduto(String nome){

    }

    public void cadastrarProduto(String nome, double custo, String tamanho, String modoPreparo, String sabor){
        catalogo.adicionarProduto(new Produto(custo, tamanho, nome, modoPreparo, sabor));
    }

    public void receberPagamento(double valorRecebido, Pedido pedido){
        pedido.comparaValor(pedido.getValor(), valorRecebido);
    }

    public void registrarPedidoConcluido(Pedido pedido){
        pedidos[pedidos.length - 1] = pedido;
    }


    public void reporEstoque(int quantidade, String nome, double preco, Date validade){

    }

    public void finalizarReposicao(){

    }

    public Pedidos[] gerarRelatorio(Date inicio, Date fim){

    }

    public Pedidos[] filtrarIntervalo(Date inicio, Date fim){

    }

    public Pedidos[] listarPedidos(){

    }

    public Pedido escolherPedido(Pedido pedido){

    }

    public void atualizarStatusPedido(String status, Pedido pedido){
        pedido.atualizarStatus(status);
    }
}