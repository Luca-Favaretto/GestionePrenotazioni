package lucafavaretto.GestionePrenotazioni.dao;

import lucafavaretto.GestionePrenotazioni.entities.Edificio;
import lucafavaretto.GestionePrenotazioni.entities.Postazione;
import lucafavaretto.GestionePrenotazioni.entities.Utente;
import lucafavaretto.GestionePrenotazioni.enums.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtenteDao extends JpaRepository<Utente, Long> {

    @Query("SELECT p FROM Postazione p JOIN p.edificio e WHERE e.citta = :citta AND p.tipo = :tipo")
    List<Postazione> findPostazioneByCittaETipo(String citta, Tipo tipo);
}
