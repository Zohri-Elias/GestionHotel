package hotel;

public class Chambre {
    private boolean disponibilite;
    private int numero;
    private String type;

    public Chambre(int numero, String type) {
        this.numero = numero;
        this.type = type;

    }
    public boolean getDisponibilite(){
        return disponibilite;
    }

    public boolean setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
