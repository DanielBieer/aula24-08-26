public class Programador extends Funcionario {
    private Linguagem[] linguagens;
    private int quantLing;

    public Programador(String nome, int matricula, double salario){
        super(nome, matricula, salario);
        
        linguagens = new Linguagem[3];
        quantLing = 0;
    }

    public void adicionarLinguagem (Linguagem linguagem){
        if(quantLing < 3){
            linguagens[quantLing] = linguagem;
            quantLing++;
        } else {
            System.out.println("O programador já possui 3 linguagens");
        }
    }

    public void mostrarDados(){
        super.mostrarDados();
        
        System.out.println("Linguagens: ");
        for (int i = 0; i < quantLing; i++) {
            linguagens[i].mostrarDados();
            System.out.println();
        }
    }
}
