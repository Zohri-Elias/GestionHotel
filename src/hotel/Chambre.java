package hotel;

public class Chambre {
    private int numero;
    private String type;
    private String disponibilite;

    public Chambre(int numero, String type) {
        this.numero = numero;
        this.type = type;
        this.disponibilite = "Libre";
    }

}
