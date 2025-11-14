public class Ingredientes {
    private String nomeIngrediente;
    private int quantidadeingredientes;
    private Boolean perecivel;


public Ingredientes(String nomeIngrediente, int quantidadeingredientes, boolean perecivel){
    this.nomeIngrediente = nomeIngrediente;
    this.quantidadeingredientes = quantidadeingredientes;
    this.perecivel = perecivel;
}

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public int getQuantidadeingredientes() {
        return quantidadeingredientes;
    }

    public void setQuantidadeingredientes(int quantidadeingredientes) {
        this.quantidadeingredientes = quantidadeingredientes;
    }

    public Boolean getPerecivel() {
        return perecivel;
    }

    public void setPerecivel(Boolean perecivel) {
        this.perecivel = perecivel;
    } 

    @Override
    public String toString() {
        return "Ingredientes [nomeIngrediente=" + nomeIngrediente + ", quantidadeingredientes=" + quantidadeingredientes
                + ", perecivel=" + perecivel + "]";
    }
}