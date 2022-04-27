package test_management_app;

import management_app.servizio_tatuaggi.ServizioTatuaggio;
import management_app.tatuaggio_business_implementazione.TatuaggioBusinessImpl;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

public class TatuaggioBusinessImplMockTest {

    @Test
    public void testRecuperoTatuaggiRelativiAllaPrimavera_utilizzoMockEListaNonVuota(){

        ServizioTatuaggio servizioTatuaggioMock = mock(ServizioTatuaggio.class);

        List<String> tatuaggi = Arrays.asList("Imparare di primavera in paese",
                                              "Maledetta primavera",
                                              "Il mare d'estate");

        when(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).thenReturn(tatuaggi);

        TatuaggioBusinessImpl tatuaggioBusinessImpl = new TatuaggioBusinessImpl(servizioTatuaggioMock);

        List<String> tatuaggiFiltrati = tatuaggioBusinessImpl.recuperoTatuaggiRelativiAllaPrimavera("Paolo");

        assertEquals(2, tatuaggiFiltrati.size());
    }

    @Test
    public void testRecuperoTatuaggiRelativiAllaPrimavera_utilizzoMockEListaVuota(){

        ServizioTatuaggio servizioTatuaggioMock = mock(ServizioTatuaggio.class);

        List<String> tatuaggi = Arrays.asList();

        when(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).thenReturn(tatuaggi);

        TatuaggioBusinessImpl tatuaggioBusinessImpl = new TatuaggioBusinessImpl(servizioTatuaggioMock);

        List<String> tatuaggiFiltrati = tatuaggioBusinessImpl.recuperoTatuaggiRelativiAllaPrimavera("Paolo");

        assertEquals(0, tatuaggiFiltrati.size());
    }

}
