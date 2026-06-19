public class Chef {
    // Atributos
    private String nome;
    private String especialidade;
    private int anosExperiencia;

    // Construtores
    public Chef(){
        this.nome = "";
        this.especialidade = "";
        this.anosExperiencia = 0;
    }

    public Chef(int anosExperiencia, String especialidade, String nome){
        this.anosExperiencia = anosExperiencia;
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public Chef(String nome){
        this.nome = nome;
    }

    // Getters | Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

}
