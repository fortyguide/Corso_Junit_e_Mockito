import org.junit.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest {

    @Test
    public void testOrdinamentoArray_arrayRandomInIngresso(){

        int[] numbers = {12, 3, 4, 1};
        int[] aspettativa = {1, 3, 4, 12};

        Arrays.sort(numbers);

        assertArrayEquals(aspettativa, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testOrdinamentoArray_arrayInizializzatoANull(){

        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout = 100)
    public void testPrestazioniOrdinamento_arrayRandomInIngresso(){

        int array[] = {12, 23, 4};
        for(int i = 1; i <= 1000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
