package lucafavaretto.GestionePrenotazioni.utils;

import lombok.extern.slf4j.Slf4j;
import lucafavaretto.GestionePrenotazioni.dao.EdificioService;
import lucafavaretto.GestionePrenotazioni.dao.PostazioneService;
import lucafavaretto.GestionePrenotazioni.dao.PrenotazioneService;
import lucafavaretto.GestionePrenotazioni.dao.UtenteService;
import lucafavaretto.GestionePrenotazioni.entities.Edificio;
import lucafavaretto.GestionePrenotazioni.entities.Postazione;
import lucafavaretto.GestionePrenotazioni.entities.Prenotazione;
import lucafavaretto.GestionePrenotazioni.entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
@Slf4j
public class MyRunner implements CommandLineRunner {
    @Autowired
    EdificioService eS;
    @Autowired
    PostazioneService pS;
    @Autowired
    PrenotazioneService prS;
    @Autowired
    UtenteService uS;

    @Override
    public void run(String... args) throws Exception {

        Edificio edA = new Edificio();
        Edificio edB = new Edificio();
        Postazione poA = new Postazione(edA);
        Postazione poB = new Postazione(edB);
        Postazione poC = new Postazione(edB);

        eS.save(edA);
        eS.save(edB);
        pS.save(poA);
        pS.save(poB);
        pS.save(poC);

        Utente uA = new Utente();
        Utente uB = new Utente();

        uS.save(uA);
        uS.save(uB);

        Prenotazione prA = new Prenotazione(LocalDate.parse("2024-02-12"), uA, poA);
        Prenotazione prB = new Prenotazione(LocalDate.parse("2024-02-12"), uB, poB);
        Prenotazione prC = new Prenotazione(LocalDate.parse("2024-02-13"), uB, poC);

        prS.save(prA);
        prS.save(prB);
        prS.save(prC);


        log.info("MyRunnerLog:" + edA);
        log.info("MyRunnerLog:" + edB);
        log.info("MyRunnerLog:" + poA);
        log.info("MyRunnerLog:" + poB);
        log.info("MyRunnerLog:" + poC);
        log.info("MyRunnerLog:" + uA);
        log.info("MyRunnerLog:" + uB);
        log.info("MyRunnerLog:" + prA);
        log.info("MyRunnerLog:" + prB);
        log.info("MyRunnerLog:" + prC);

    }
}
