public class App {
    public static void main(String[] args){
         Funcionario funcionario1 = new Funcionario(
        "Carlos",
         102, 
         3000);

        Programador programador1 = new Programador(
        "João", 
        101, 
        5000);

        Linguagem java = new Linguagem("Java", 3, 1);
        Linguagem python = new Linguagem("Python", 2, 2);
        Linguagem javascript = new Linguagem("JavaScript", 1, 3);

        programador1.adicionarLinguagem(java);
        programador1.adicionarLinguagem(python);
        programador1.adicionarLinguagem(javascript);

        System.out.println("=== Funcionario ===");
        funcionario1.mostrarDados();

        System.out.println();

        System.out.println("=== Programador ===");
        programador1.mostrarDados();
    }

       


}
