public class App {
    public static void main(String[] args){
         Funcionario funcionario1 = new Funcionario(
        "Carlos",
         102, 
         3000);

        Programador programador1 = new Programador(
        "João", 
        101, 
        5000, 
        "Java");

        System.out.println("=== Funcionario ===");
        funcionario1.mostrarDados();

        System.out.println();

        System.out.println("=== Programador ===");
        programador1.mostrarDados();
    }

       


}
