import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersTest {

    @Test
    public void test() {

        /*######### Esempi sulle liste ############################*/
        List<Integer> punteggi = Arrays.asList(99, 100, 101, 105);

        /* "punteggi" ha 4 item */
        assertThat(punteggi, hasSize(4));

        /* "punteggi" contiene gli item 99 e 100 */
        assertThat(punteggi, hasItems(99, 100));

        /* tutti gli elementi di "punteggi" sono > 90*/
        assertThat(punteggi, everyItem(greaterThan(90)));

        /* tutti gli elementi di "punteggi" sono < 190*/
        assertThat(punteggi, everyItem(lessThan(190)));

        /*#########################################################*/


        /*######### Esempi sulle stringhe #########################*/
        String stringa1 = "";
        String stringa2 = null;

        /* "stringa1" è vuota */
        assertThat(stringa1, isEmptyString());

        /* "stringa2" è vuota o null*/
        assertThat(stringa2, isEmptyOrNullString());

        /*#########################################################*/


        /*######### Esempi sugli array ############################*/
        Integer[] numeri = {1, 2, 3};

        /* "numeri" ha dimensione n */
        assertThat(numeri, arrayWithSize(3));

        /* "numeri" ha gli elementi 1,2 e 3 al suo interno, nell'ordine in cui
        sono scritti*/
        assertThat(numeri, arrayContaining(1, 2, 3));

        /* "numeri" ha gli elementi 1,2 e 3 al suo interno, trascurando l'ordine in cui
        sono scritti*/
        assertThat(numeri, arrayContainingInAnyOrder(2, 1, 3));

        /*#########################################################*/

    }

}
