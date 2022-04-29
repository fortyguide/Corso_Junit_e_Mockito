package management_app.tatuaggio_business_implementazione;

import management_app.servizio_tatuaggi.ServizioTatuaggio;

import java.util.ArrayList;
import java.util.List;

public class TatuaggioBusinessImpl {

    private ServizioTatuaggio servizioTatuaggio;

    /* Costruttore della classe TatuaggioBusinessImpl*/
    public TatuaggioBusinessImpl(ServizioTatuaggio servizioTatuaggio) {
        this.servizioTatuaggio = servizioTatuaggio;
    }

    public List<String> recuperoTatuaggiRelativiAllaPrimavera(String utente){

        List<String> tatuaggiFiltrati = new ArrayList<String>();
        List<String> tatuaggi = servizioTatuaggio.recuperoTatuaggi(utente);

        for(String tatuaggio : tatuaggi){
            if(tatuaggio.contains("primavera")){
                tatuaggiFiltrati.add(tatuaggio);
            }
        }

        return tatuaggiFiltrati;
    }

    public void recuperoTatuaggiNonRelativiAllaPrimavera (String utente){

        List<String> tatuaggi = servizioTatuaggio.recuperoTatuaggi(utente);

        for(String tatuaggio : tatuaggi){
            if(!tatuaggio.contains("primavera")){
                servizioTatuaggio.cancellaTatuaggio(tatuaggio);
            }
        }
    }

}
