import static  org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/*Istruzione che indica che questa classe ha al suo interno un test parametrizzato*/
@RunWith(Parameterized.class)
public class TestParametrizzati {

    /*Variabili da passare al costruttore della classe TestParametrizzati
    che dobbiamo generare*/
    private String inputTestato;
    private String outputAtteso;

    /*Definiamo il costruttore della classe TestParametrizzati*/
    public TestParametrizzati(String outputAttuale, String outputAtteso) {
        this.inputTestato = outputAttuale;
        this.outputAtteso = outputAtteso;
    }

    /*Definiamo la raccolta di parametri*/
    @Parameterized.Parameters
    public static Collection<Object[]> condizioniTest() {
        return Arrays.asList(new Object[][] {
            /* { input testato, output atteso } */
                {"AACD", "CD"},
                {"CDAA", "CDAA"},
                {"ACDB", "ACDB"}
        });
    }

    @Test
    public void testTroncoLetteraANellePrimeDuePosizioni_Parametri() {
        PrimoUnitTest primoUnitTest = new PrimoUnitTest();

        System.out.println("Eseguo il test con il numero " + inputTestato);

        assertEquals(outputAtteso, primoUnitTest.troncoLetteraANellePrimeDuePosizioni(inputTestato));
    }
}
