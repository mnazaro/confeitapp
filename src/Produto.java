public class Produto {
    
    private double custo;
    private String tamanho;
    private String nome;
    private String modoPreparo;
    private String sabor;
    private Estoque estoque;

    public Produto(double custo, String tamanho, String nome, String modoPreparo, String sabor) {
        this.custo = custo;
        this.tamanho = tamanho;
        this.nome = nome;
        this.modoPreparo = modoPreparo;
        this.sabor = sabor;
    }

    public void reservarIngredientes(int quantidade, String nome){

    }
}
