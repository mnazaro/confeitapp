public class Produto {
    
    private float preco;
    private String nome;
    private String modoPreparo;
    private Estoque estoque;

    public Produto(float preco, String ingredientes, String nome, String modoPreparo) {
        this.preco = preco;
        this.nome = nome;
        this.modoPreparo = modoPreparo;
    }

    public void reservarIngredientes(int quantidade, String nome){

    }
}
