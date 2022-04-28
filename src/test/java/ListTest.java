import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void testMockDelMetodoSizeDiList_DimensioneListaMaggioreDi0(){

        List<String> listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);

        assertEquals(2,listMock.size());
    }// Success

    @Test
    public void testMockDelMetodoSizeDiList_RitornaValoriMultipli(){

        List<String> listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);

        assertEquals(2,listMock.size());
        assertEquals(3,listMock.size());
    }// Success

    @Test
    public void testMockDelMetodoGetDiList_DimensioneListaMaggioreDi0(){

        List<String> listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Corso Mockito");

        assertEquals("Corso Mockito",listMock.get(0));
        assertEquals(null, listMock.get(1));
    }// Success

    @Test
    public void testMockDelMetodoGetDiList_ArgumentMatcher(){

        List<String> listMock = mock(List.class);

        /* Argument matcher*/
        when(listMock.get(anyInt())).thenReturn("Corso Mockito");

        assertEquals("Corso Mockito", listMock.get(0));
        assertEquals("Corso Mockito", listMock.get(1));
    }// Success

    @Test(expected = RuntimeException.class)
    public void testMockDelMetodoGetDiList_GeneroEccezione(){

        List<String> listMock = mock(List.class);

        /* Argument matcher*/
        when(listMock.get(anyInt())).thenThrow(new RuntimeException());

        String primoElemento = listMock.get(0);
    }// Success

}
