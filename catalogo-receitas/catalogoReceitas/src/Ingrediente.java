public class Ingrediente {
    // Atributos
    private String nome;
    private Double quantidade;
    private String unidadeMedida;

    // Construtor
    public Ingrediente(){
        this.nome = "";
        this.quantidade = 0.0;
        this.unidadeMedida = "";
    }

    public Ingrediente(String nome, Double quantidade, String unidadeMedida){
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

    // Getters | Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

// fim classe
}
