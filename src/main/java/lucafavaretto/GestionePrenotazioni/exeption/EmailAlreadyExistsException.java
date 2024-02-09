package lucafavaretto.GestionePrenotazioni.exeption;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException() {
        super("L'email già esistente");
    }
}
