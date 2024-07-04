public class Estoque {
    private Ingrediente[] ingredientes;

    public void atualizarEstoque(String nome, int quantidadeDisponivel) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNome().equals(nome)) {
                ingrediente.setQuantidadeDisponivel(quantidadeDisponivel);
            }
        }
    }

    // Caso o ingrediente já exista, atualiza a quantidade disponível
    public void adicionarIngrediente(Ingrediente ingrediente) {
        for (Ingrediente i : ingredientes) {
            if (i.getNome().equals(ingrediente.getNome())) {
                i.setQuantidadeDisponivel(i.getQuantidadeDisponivel() + ingrediente.getQuantidadeDisponivel());
                return;
            }
        }
        // Caso o ingrediente não exista, adiciona um novo
        Ingrediente[] novoArray = new Ingrediente[ingredientes.length + 1];
        for (int i = 0; i < ingredientes.length; i++) {
            novoArray[i] = ingredientes[i];
        }
        novoArray[novoArray.length - 1] = ingrediente;
        ingredientes = novoArray;
    }
}
