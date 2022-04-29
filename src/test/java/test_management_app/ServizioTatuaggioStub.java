package test_management_app;

import management_app.servizio_tatuaggi.ServizioTatuaggio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServizioTatuaggioStub implements ServizioTatuaggio {

    /* Implementazione di esempio del servizio esterno ServizioTatuaggio */
    @Override
    public List<String> recuperoTatuaggi(String utente) {
        return Arrays.asList("Imparare di primavera in paese",
                             "Maledetta primavera",
                             "Il mare d'estate");
    }

    @Override
    public void cancellaTatuaggio(String tatuaggio) {

    }


}

