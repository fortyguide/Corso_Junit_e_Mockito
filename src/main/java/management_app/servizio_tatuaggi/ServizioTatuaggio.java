package management_app.servizio_tatuaggi;

import java.util.List;

public interface ServizioTatuaggio {

    public List<String> recuperoTatuaggi(String utente);

    public void cancellaTatuaggio(String tatuaggio);
}
