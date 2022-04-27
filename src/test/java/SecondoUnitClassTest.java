import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondoUnitClassTest {

    SecondoUnitClass secondoUnitClass = new SecondoUnitClass();

    @Test
    public void testVerificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi_Primi2CaratteriEUltimi2CaratteriSonoDiversi() {
        assertFalse(secondoUnitClass.verificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi("ABCD"));
    }

    @Test
    public void testVerificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi_Primi2CaratteriEUltimi2CaratteriSonoUguali() {
        assertTrue(secondoUnitClass.verificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi("ABAB"));
    }

    @Test
    public void testVerificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi_Primi2CaratteriSonoAncheGliUltimi2() {
        assertTrue(secondoUnitClass.verificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi("AB"));
    }

    @Test
    public void testVerificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi_UnSoloCarattere() {
        assertFalse(secondoUnitClass.verificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi("A"));
    }
}