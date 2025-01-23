package hotel;

public class Reservation {
    private Client client;
    private Hotel hotel;
    private String dateDebut;
    private String dateFin;

    public Reservation(Client client, Hotel hotel, String dateDebut, String dateFin) {
        this.client = client;
        this.hotel = hotel;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
}
