public class Linguagem {
    private String nome;
    private int anosExperiencia;
    private int ranking;

    public Linguagem(String nome, int anosExperiencia, int ranking){
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.ranking = ranking;

    }

    public String getNome() {
        return nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public int getRanking() {
        return ranking;
    }

    public void mostrarDados(){
        System.out.println("Linguagem: " + nome);
        System.out.println("Experiência: " + anosExperiencia);
        System.out.println("Ranking: " + ranking);
    }
    
}
