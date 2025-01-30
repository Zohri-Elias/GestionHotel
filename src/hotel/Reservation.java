package hotel;

public class Reservation {
    private Client client;
    private Chambre chambre;
    private String dateDebut;
    private String dateFin;

    public Reservation(Client client,Chambre chambre, String dateDebut, String dateFin) {
        this.client = client;
        this.chambre = chambre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

}
