package powermock;

public class ClasseUtility {
    static int metodoStatico(long valore) {
        // Qui si fa un po' di logica complessa...
        throw new RuntimeException(
                "Non voglio essere eseguito. Sarò comunque mockato.");
    }
}