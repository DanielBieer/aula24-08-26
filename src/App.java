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

        Programador programador2 = new Programador(
            "Pedro", 
            103, 
            5000);

        programador1.adicionarLinguagem(new Linguagem("java", 5, 1));
        programador1.adicionarLinguagem(new Linguagem("python", 4, 2));
        programador1.adicionarLinguagem(new Linguagem("javascript", 3, 3));
        programador2.adicionarLinguagem(new Linguagem("java", 7, 1));
        programador2.adicionarLinguagem(new Linguagem("javascript", 2, 2));
        programador2.adicionarLinguagem(new Linguagem("python", 1, 3));

        ComparadorProgramador comparador = new ComparadorProgramador();
        int resultado = comparador.comparar(programador1, programador2, "Java");

        if (resultado == 1) {
            System.out.println(programador1.getNome() + " tem mais experiencia em Java");
        } else if(resultado == -1) {
            System.out.println(programador2.getNome() + " tem mais experiencia em Java");
        } else {
            System.out.println("Os dois possuem a mesma experiencia");
        }



        System.out.println("=== Funcionario ===");
        funcionario1.mostrarDados();

        System.out.println();

        System.out.println("=== Programador ===");
        programador1.mostrarDados();
    }

       


}
