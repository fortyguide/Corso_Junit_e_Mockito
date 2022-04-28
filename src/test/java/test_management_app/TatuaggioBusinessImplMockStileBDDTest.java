package test_management_app;

import management_app.servizio_tatuaggi.ServizioTatuaggio;
import management_app.tatuaggio_business_implementazione.TatuaggioBusinessImpl;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

public class TatuaggioBusinessImplMockStileBDDTest {

    @Test
    public void testRecuperoTatuaggiRelativiAllaPrimavera_utilizzoMockEListaNonVuota(){

        /* Given - Configurazione scenario */
        ServizioTatuaggio servizioTatuaggioMock = mock(ServizioTatuaggio.class);

        List<String> tatuaggi = Arrays.asList("Imparare di primavera in paese",
                "Maledetta primavera",
                "Il mare d'estate");

        /* when(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).thenReturn(tatuaggi);
        * lo sostituisco con la seguente sintassi: */
        given(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).willReturn(tatuaggi);

        TatuaggioBusinessImpl tatuaggioBusinessImpl = new TatuaggioBusinessImpl(servizioTatuaggioMock);

        /* When - Azione da eseguire */
        List<String> tatuaggiFiltrati = tatuaggioBusinessImpl.recuperoTatuaggiRelativiAllaPrimavera("Paolo");

        /* Then - Verifica Azione */
        /*assertEquals(2, tatuaggiFiltrati.size());
        * lo sostituisco con la seguente sintassi: */
        assertThat(tatuaggiFiltrati.size(), is(2));
    }

    @Test
    public void testRecuperoTatuaggiRelativiAllaPrimavera_utilizzoMockEListaVuota(){

        /* Given - Configurazione scenario */
        ServizioTatuaggio servizioTatuaggioMock = mock(ServizioTatuaggio.class);

        List<String> tatuaggi = Arrays.asList();

        /* when(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).thenReturn(tatuaggi);
         * lo sostituisco con la seguente sintassi: */
        given(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).willReturn(tatuaggi);

        TatuaggioBusinessImpl tatuaggioBusinessImpl = new TatuaggioBusinessImpl(servizioTatuaggioMock);

        /* When - Azione da eseguire */
        List<String> tatuaggiFiltrati = tatuaggioBusinessImpl.recuperoTatuaggiRelativiAllaPrimavera("Paolo");

        /* Then - Verifica Azione */
        /*assertEquals(0, tatuaggiFiltrati.size());
         * lo sostituisco con la seguente sintassi: */
        assertThat(tatuaggiFiltrati.size(), is(0));
    }

}

