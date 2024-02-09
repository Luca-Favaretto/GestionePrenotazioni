package lucafavaretto.GestionePrenotazioni.dao;

import lombok.extern.slf4j.Slf4j;
import lucafavaretto.GestionePrenotazioni.entities.Edificio;
import lucafavaretto.GestionePrenotazioni.entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UtenteService {
    @Autowired
    UtenteDao utenteDao;

    public void save(Utente e) {
        utenteDao.save(e);
        log.info("Utente " + e + "add with success!");
    }
}
