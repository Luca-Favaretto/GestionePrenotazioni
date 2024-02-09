package lucafavaretto.GestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Prenotazione {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name = "id", nullable = false)
@Setter(AccessLevel.NONE)
private Long id;
private Date day;
@ManyToOne
@JoinColumn(name = "id_utente")
private Utente utente;
@ManyToOne
@JoinColumn(name = "id_postazione")
private Postazione postazione;

}
