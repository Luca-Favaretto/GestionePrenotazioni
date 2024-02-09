package lucafavaretto.GestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Utente {
    @Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@Column(name = "id", nullable = false)
@Setter(AccessLevel.NONE)
private Long id;

}
