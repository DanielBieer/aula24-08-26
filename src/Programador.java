public class Programador extends Funcionario {
    private String linguagemPreferida;

    public Programador(String nome, int matricula, double salario, String linguagemPreferida){
        super(nome, matricula, salario);
        this.linguagemPreferida = linguagemPreferida;
    }

    public String getLinguagemPreferida(){
        return linguagemPreferida;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Linguagem Preferida: " + linguagemPreferida);
    }
}
