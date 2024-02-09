package lucafavaretto.GestionePrenotazioni.entities;

import com.github.javafaker.Faker;
import jakarta.persistence.*;
import lombok.*;

import java.util.Locale;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @Setter(AccessLevel.NONE)
    private Long id;private String nome;
    private String indirizzo;
    private String citta;

    @OneToOne(mappedBy = "edificio",cascade = {CascadeType.ALL})
    private Postazione postazione;

    public Edificio(Postazione postazione) {
        Faker faker = new Faker(Locale.ITALIAN);
        this.nome = faker.name().title();
        this.indirizzo = faker.address().fullAddress();
        this.citta = faker.address().city();
        this.postazione = postazione;
    }
}
