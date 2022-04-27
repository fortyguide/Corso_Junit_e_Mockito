import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimoUnitTestTest{

    PrimoUnitTest primoUnitTest = new PrimoUnitTest();

    @Test
    public void testTroncoLetteraANellePrimeDuePosizioni_TroncaturaDaEseguireStringaAACD() {

        /*assertEquals( valore atteso, valore attuale )*/
        assertEquals("CD",primoUnitTest.troncoLetteraANellePrimeDuePosizioni("AACD"));

    }

    @Test
    public void testTroncoLetteraANellePrimeDuePosizioni_TroncaturaDaNonEseguireStringaCDAA() {

        assertEquals("CDAA",primoUnitTest.troncoLetteraANellePrimeDuePosizioni("CDAA"));

    }

    @Test
    public void testTroncoLetteraANellePrimeDuePosizioni_TroncaturaDaNonEseguireStringaACDB() {

        assertEquals("ACDB",primoUnitTest.troncoLetteraANellePrimeDuePosizioni("ACDB"));

    }
}