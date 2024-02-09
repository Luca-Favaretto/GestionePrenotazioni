package lucafavaretto.GestionePrenotazioni.dao;

import lombok.extern.slf4j.Slf4j;
import lucafavaretto.GestionePrenotazioni.entities.Edificio;
import lucafavaretto.GestionePrenotazioni.entities.Postazione;
import lucafavaretto.GestionePrenotazioni.entities.Utente;
import lucafavaretto.GestionePrenotazioni.enums.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UtenteService {
    @Autowired
    UtenteDao utenteDao;

    public void save(Utente e) {
        utenteDao.save(e);
        log.info("Utente " + e + "add with success!");
    }

    public List<Postazione> findPostazioneByCittaETipo(String citta, Tipo tipo) {
        return utenteDao.findPostazioneByCittaETipo(citta, tipo);
    }
}
