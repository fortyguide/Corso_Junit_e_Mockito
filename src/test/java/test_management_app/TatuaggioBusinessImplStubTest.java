package test_management_app;

import management_app.servizio_tatuaggi.ServizioTatuaggio;
import management_app.tatuaggio_business_implementazione.TatuaggioBusinessImpl;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class TatuaggioBusinessImplStubTest {

    @Test
    public void testRecuperoTatuaggiRelativiAllaPrimavera_utilizzoStub(){

        ServizioTatuaggio servizioTatuaggio = new ServizioTatuaggioStub();
        TatuaggioBusinessImpl tatuaggioBusinessImpl = new TatuaggioBusinessImpl(servizioTatuaggio);

        List<String> tatuaggiFiltrati = tatuaggioBusinessImpl.recuperoTatuaggiRelativiAllaPrimavera("Paolo");

        assertEquals(2, tatuaggiFiltrati.size());
    }

}
