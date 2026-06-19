
import java.time.Duration;

public class Receita {
    // atributos
    private String nome;
    private String descricao;
    private Ingrediente[] listaIngredientes;
    private String modoPreparo;
    private int rendimento;
    private Duration tempoPreparo;
    private String nivel;
    private Chef autor;
    private int TOTAL_INGREDIENTES = 10;

    // Construtores
    public Receita(){
        this.nome = "";
        this.descricao = "";
        this.listaIngredientes = null;
        this.modoPreparo = "";
        this.rendimento = 0;
        this.tempoPreparo = Duration.ZERO; // 0
        this.nivel = "";
        this.autor = null;
    }

    public Receita(
        String nome,
        String descricao,
        Ingrediente[] listaIngredientes,
        String modoPreparo,
        int rendimento,
        Duration tempoPreparo,
        String nivel,
        Chef autor
    ){
        this.nome = nome;
        this.descricao = descricao;
        this.listaIngredientes = new Ingrediente[TOTAL_INGREDIENTES];
        this.modoPreparo = modoPreparo;
        this.rendimento = rendimento;
        this.tempoPreparo = Duration.ofMinutes(10);
        this.nivel = nivel;
        this.autor = new Chef(autor);
    }

// fim classe
}
