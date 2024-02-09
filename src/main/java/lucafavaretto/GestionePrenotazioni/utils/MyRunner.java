package lucafavaretto.GestionePrenotazioni.utils;

import lombok.extern.slf4j.Slf4j;
import lucafavaretto.GestionePrenotazioni.dao.EdificioService;
import lucafavaretto.GestionePrenotazioni.dao.PostazioneService;
import lucafavaretto.GestionePrenotazioni.dao.PrenotazioneService;
import lucafavaretto.GestionePrenotazioni.dao.UtenteService;
import lucafavaretto.GestionePrenotazioni.entities.Edificio;
import lucafavaretto.GestionePrenotazioni.entities.Postazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRunner implements CommandLineRunner {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("GestionePrenotazioniApplication");

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


        System.out.println(edA);
        System.out.println(edB);
        System.out.println(poA);
        System.out.println(poB);
        System.out.println(poC);

    }
}
