package powermock;

import java.util.ArrayList;
import java.util.List;

interface Dipendenza {
    List<Integer> recuperaTuttiGliStati();
}

public class SystemUnderTest {
    private Dipendenza dipendenza;

    public int metodoCheUtilizzaCostruttoreDiUnArrayList() {
        ArrayList list = new ArrayList();
        return list.size();
    }

    public int metodoCheChiamaUnAltroMetodoStatico() {
        //privateMethodUnderTest chiama il metodo statico ClasseUtility.metodoStatico()
        List<Integer> stati = dipendenza.recuperaTuttiGliStati();
        long somma = 0;
        for (int stato : stati)
            somma += stato;
        return ClasseUtility.metodoStatico(somma);
    }

    private long privateMethodUnderTest() {
        List<Integer> stati = dipendenza.recuperaTuttiGliStati();
        long somma = 0;
        for (int stato : stati)
            somma += stato;
        return somma;
    }
}
