package lucafavaretto.GestionePrenotazioni;

import lombok.extern.slf4j.Slf4j;
import lucafavaretto.GestionePrenotazioni.dao.UtenteService;
import lucafavaretto.GestionePrenotazioni.entities.Utente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class UserTest {
    @Autowired
    UtenteService utenteService;

    @Test
    public void testSaveUtente() {
        Utente utente = new Utente("Cosmin", "3run", "email@tipo");
        try {
            utenteService.save(utente);
        } catch (Exception er) {
            log.error("errore di tipo" + er);
        }
        assertNotNull(utenteService.findByUsername("Cosmin"));
    }

    @Test
    public void testSaveUtente_EmailGiaEsistente() {
        Utente utente = new Utente("Marta", "Rossi", "email@tipo");
        try {
            utenteService.save(utente);
        } catch (Exception er) {
            log.error("errore di tipo" + er);
        }
        assertNull(utenteService.findByUsername("Marta"));
    }


}
