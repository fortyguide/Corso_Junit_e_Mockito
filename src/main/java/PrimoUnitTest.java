public class PrimoUnitTest{

    /* AACD => CD  CDAA => CDAA  ACDB => CDB */
    public String troncoLetteraANellePrimeDuePosizioni(String str){
        if (str.length() <= 2){
            return str.replaceAll("A", " ");
        }

        String primi2Caratteri = str.substring(0, 2);
        String stringaSenzaIPrimiDueCaratteri = str.substring(2);

        return primi2Caratteri.replaceAll("A","") + stringaSenzaIPrimiDueCaratteri;
    }
}


