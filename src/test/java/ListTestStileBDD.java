import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class ListTestStileBDD {

    @Test
    public void testMockDelMetodoSizeDiList_DimensioneListaMaggioreDi0(){

        /* Given - Configurazione scenario */
        List<String> listMock = mock(List.class);
        /* when(listMock.size()).thenReturn(2);
        * lo sostituisco con la seguente sintassi: */
        given(listMock.size()).willReturn(2);

        /* When - Azione da eseguire */
        int dimensioneListMock = listMock.size();

        /* Then - Verifica Azione */
        /* assertEquals(2,dimensioneListMock);
        * lo sostituisco con la seguente sintassi: */
        assertThat(dimensioneListMock, is(2));

    }// Success

    @Test
    public void testMockDelMetodoSizeDiList_RitornaValoriMultipli(){

        /* Given - Configurazione scenario */
        List<String> listMock = mock(List.class);
        /* when(listMock.size()).thenReturn(2).thenReturn(3);
         * lo sostituisco con la seguente sintassi: */
        given(listMock.size()).willReturn(2).willReturn(3);

        /* When - Azione da eseguire */
        int dimensioneListMock1 = listMock.size();
        int dimensioneListMock2 = listMock.size();

        /* Then - Verifica Azione */
        /* assertEquals(2,dimensioneListMock1);
         * lo sostituisco con la seguente sintassi: */
        assertThat(dimensioneListMock1, is(2));

        /* assertEquals(3,dimensioneListMock2);
         * lo sostituisco con la seguente sintassi: */
        assertThat(dimensioneListMock2, is(3));

    }// Success

    @Test
    public void testMockDelMetodoGetDiList_DimensioneListaMaggioreDi0(){

        /* Given - Configurazione scenario */
        List<String> listMock = mock(List.class);
        /* when(listMock.get(0)).thenReturn("Corso Mockito");
         * lo sostituisco con la seguente sintassi: */
        given(listMock.get(0)).willReturn("Corso Mockito");

        /* When - Azione da eseguire */
        String primoElementoListMock = listMock.get(0);
        String secondoElementoListMock = listMock.get(1);

        /* Then - Verifica Azione */
        /* assertEquals("Corso Mockito", primoElementoListMock);
         * lo sostituisco con la seguente sintassi: */
        assertThat(primoElementoListMock, is("Corso Mockito"));

        /* assertEquals(null, secondoElementoListMock);
         * lo sostituisco con la seguente sintassi: */
        assertThat(secondoElementoListMock, is(nullValue()));

    }// Success

    @Test
    public void testMockDelMetodoGetDiList_ArgumentMatcher(){

        /* Given - Configurazione scenario */
        List<String> listMock = mock(List.class);
        /* when(listMock.get(anyInt())).thenReturn("Corso Mockito");
         * lo sostituisco con la seguente sintassi: */
        given(listMock.get(anyInt())).willReturn("Corso Mockito");

        /* When - Azione da eseguire */
        String primoElementoListMock = listMock.get(0);
        String secondoElementoListMock = listMock.get(1);

        /* Then - Verifica Azione */
        /* assertEquals("Corso Mockito", primoElementoListMock);
         * lo sostituisco con la seguente sintassi: */
        assertThat(primoElementoListMock, is("Corso Mockito"));

        /* assertEquals(null, secondoElementoListMock);
         * lo sostituisco con la seguente sintassi: */
        assertThat(secondoElementoListMock, is("Corso Mockito"));

    }// Success

    @Test(expected = RuntimeException.class)
    public void testMockDelMetodoGetDiList_GeneroEccezione(){

        /* Given - Configurazione scenario */
        List<String> listMock = mock(List.class);
        /* when(listMock.get(anyInt())).thenThrow(new RuntimeException());;
         * lo sostituisco con la seguente sintassi: */
        given(listMock.get(anyInt())).willThrow(new RuntimeException());

        /* When - Azione da eseguire */
        String primoElementoListMock = listMock.get(0);

        /* Then - Verifica Azione */
        /* assertEquals("Corso Mockito", primoElementoListMock);
         * lo sostituisco con la seguente sintassi: */
        assertThat(primoElementoListMock, is("Corso Mockito"));

    }// Success

}