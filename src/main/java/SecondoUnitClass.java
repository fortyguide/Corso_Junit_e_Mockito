public class SecondoUnitClass {

    /*ABCD => false
    * ABAB => true
    * AB => true, perchè avendo la stringa solo due caratteri,
    * essi sono considerati sia come primi 2 che ultimi 2,
    * per cui è come se i primi 2 caratteri fossero uguali agli
    * ultimi 2
    * A => false, perchè la stringa ha meno di 2 caratteri*/

    public boolean verificoCheIPrimiEGliUltimiDueCaratteriSonoGliStessi(String str){

        if (str.length() <= 1) { return false; }
        if (str.length() == 2) { return true; }

        String primi2Caratteri = str.substring(0, 2);

        String ultimi2Caratteri = str.substring(str.length() - 2);

        return primi2Caratteri.equals(ultimi2Caratteri);
    }
}
