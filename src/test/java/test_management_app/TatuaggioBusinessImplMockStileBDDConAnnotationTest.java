package test_management_app;

import management_app.servizio_tatuaggi.ServizioTatuaggio;
import management_app.tatuaggio_business_implementazione.TatuaggioBusinessImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

/* Indispensabile per poter utilizzare @Mock @InjectMocks e @Captor */
@RunWith(MockitoJUnitRunner.class)
public class TatuaggioBusinessImplMockStileBDDConAnnotationTest {

    /* Corrisponde a:
    ServizioTatuaggio servizioTatuaggioMock = mock(ServizioTatuaggio.class); */
    @Mock
    ServizioTatuaggio servizioTatuaggioMock;

    /* Corrisponde a:
    TatuaggioBusinessImpl tatuaggioBusinessImpl = new TatuaggioBusinessImpl(servizioTatuaggioMock); */
    @InjectMocks
    TatuaggioBusinessImpl tatuaggioBusinessImpl;

    /* Corrisponde a:
    ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class); */
    @Captor
    ArgumentCaptor<String> stringArgumentCaptor;

    @Test
    public void testRecuperoTatuaggiRelativiAllaPrimavera_utilizzoMockEListaNonVuota(){

        /* Given - Configurazione scenario */
        List<String> tatuaggi = Arrays.asList("Imparare di primavera in paese",
                "Maledetta primavera",
                "Il mare d'estate");

        /* when(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).thenReturn(tatuaggi);
         * lo sostituisco con la seguente sintassi: */
        given(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).willReturn(tatuaggi);

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
        List<String> tatuaggi = Arrays.asList();

        /* when(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).thenReturn(tatuaggi);
         * lo sostituisco con la seguente sintassi: */
        given(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).willReturn(tatuaggi);

        /* When - Azione da eseguire */
        List<String> tatuaggiFiltrati = tatuaggioBusinessImpl.recuperoTatuaggiRelativiAllaPrimavera("Paolo");

        /* Then - Verifica Azione */
        /*assertEquals(0, tatuaggiFiltrati.size());
         * lo sostituisco con la seguente sintassi: */
        assertThat(tatuaggiFiltrati.size(), is(0));
    }

    @Test
    public void testRecuperoTatuaggiNonRelativiAllaPrimavera_StileBDD(){

        /* Given - Configurazione scenario */
        List<String> tatuaggi = Arrays.asList("Imparare di primavera in paese",
                "Maledetta primavera",
                "Il mare d'estate");

        given(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).willReturn(tatuaggi);

        /* When - Azione da eseguire */
        tatuaggioBusinessImpl.recuperoTatuaggiNonRelativiAllaPrimavera("Paolo");;

        /* Then - Verifica Azione */

        /* Verifico che il parametro d'ingresso di cancellaTatuaggio() sia
         * una stringa senza la sottostringa "primavera" */
        verify(servizioTatuaggioMock).cancellaTatuaggio("Il mare d'estate");

        /* Aggiungendo never() a verify(), verifichiamo che quelle chiamate
         * al metodo cancellaTatuaggio(), che presentano la sottostringa "primavera",
         * non avvengano mai*/
        verify(servizioTatuaggioMock, never()).cancellaTatuaggio("Imparare di primavera in paese");
        verify(servizioTatuaggioMock, never()).cancellaTatuaggio("Maledetta primavera");

    }

    @Test
    public void testRecuperoTatuaggiNonRelativiAllaPrimavera_StileBDDSostituendoVerifyConThen(){

        /* Given - Configurazione scenario */
        List<String> tatuaggi = Arrays.asList("Imparare di primavera in paese",
                "Maledetta primavera",
                "Il mare d'estate");

        given(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).willReturn(tatuaggi);

        /* When - Azione da eseguire */
        tatuaggioBusinessImpl.recuperoTatuaggiNonRelativiAllaPrimavera("Paolo");;

        /* Then - Verifica Azione */

        /* Verifico che il parametro d'ingresso di cancellaTatuaggio() sia
         * una stringa senza la sottostringa "primavera" */
        then(servizioTatuaggioMock).should().cancellaTatuaggio("Il mare d'estate");

        /* Aggiungendo never() a verify(), verifichiamo che quelle chiamate
         * al metodo cancellaTatuaggio(), che presentano la sottostringa "primavera",
         * non avvengano mai*/
        then(servizioTatuaggioMock).should(never()).cancellaTatuaggio("Imparare di primavera in paese");
        then(servizioTatuaggioMock).should(never()).cancellaTatuaggio("Maledetta primavera");

    }

    @Test
    public void testRecuperoTatuaggiNonRelativiAllaPrimavera_StileBDDConArgumentCaptor(){

        /* Given - Configurazione scenario */
        List<String> tatuaggi = Arrays.asList("Imparare di primavera in paese",
                "Maledetta primavera",
                "Il mare d'estate");

        given(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).willReturn(tatuaggi);

        /* When - Azione da eseguire */
        tatuaggioBusinessImpl.recuperoTatuaggiNonRelativiAllaPrimavera("Paolo");;

        /* Then - Verifica Azione */

        /* Verifico che il parametro d'ingresso di cancellaTatuaggio() assuma
         * prima o poi il valore "il mare d'estate" */
        then(servizioTatuaggioMock).should().cancellaTatuaggio(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getValue(), is("Il mare d'estate"));

    }

    @Test
    public void testRecuperoTatuaggiNonRelativiAllaPrimavera_StileBDDConArgumentCaptorEGetValueAll(){

        /* Given - Configurazione scenario */
        List<String> tatuaggi = Arrays.asList("Imparare di primavera in paese",
                "Maledetta primavera",
                "Il mare d'estate");

        given(servizioTatuaggioMock.recuperoTatuaggi("Paolo")).willReturn(tatuaggi);

        /* When - Azione da eseguire */
        tatuaggioBusinessImpl.recuperoTatuaggiNonRelativiAllaPrimavera("Paolo");;

        /* Then - Verifica Azione */

        /* Conto il totale dei valori passati a cancellaTatuaggio che
         * non contengono la sottostringa "primavera" */
        then(servizioTatuaggioMock).should().cancellaTatuaggio(stringArgumentCaptor.capture());
        assertThat(stringArgumentCaptor.getAllValues().size(), is(1));

    }

}

