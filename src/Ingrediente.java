import java.util.Date;

public class Ingrediente {
    private String nome;
    private float preco;
    private int quantidade;
    private Date validade;
    private int quantidadeDisponivel;

    public Ingrediente(String nome, float preco, int quantidade, Date validade, int quantidadeDisponivel) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    
}
