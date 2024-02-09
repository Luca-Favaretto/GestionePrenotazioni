package lucafavaretto.GestionePrenotazioni.dao;

import lombok.extern.slf4j.Slf4j;
import lucafavaretto.GestionePrenotazioni.entities.Edificio;
import lucafavaretto.GestionePrenotazioni.entities.Postazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PostazioneService {
    @Autowired
    PostazioneDao postazioneDao;

    public void save(Postazione p) {
        postazioneDao.save(p);
        log.info("Postazione " + p + "add with success!");
    }
}
