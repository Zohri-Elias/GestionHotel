package hotel;

public class Hotel {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    public Hotel(int id, String name, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Hotel(String s, String avenueDesRennes, String laponie) {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void ajouterChambre(Chambre chambre1) {
    }

    public void afficherChambresDisponibles() {
    }

    public void reserverChambre(Client client1, Chambre chambre1, String dateDebut, String dateFin) {
    }

    public void afficherReservations() {
    }

    public void changerAffectation(Client client1, Chambre chambre1, Chambre chambre2) {
    }

    public void supressionReservation(Client client1, Chambre chambre2) {
    }
}
