public class ComparadorProgramador {
    public int comparar(Programador p1, Programador p2, String nomeLinguagem){

        int experiencia1 = p1.getExperiencia(nomeLinguagem);
        int experiencia2 = p2.getExperiencia(nomeLinguagem);

        if(experiencia1 > experiencia2){
            return 1;
        } else if (experiencia1 < experiencia2){
            return -1;
        } else {
            return 0;
        }
    }
}
