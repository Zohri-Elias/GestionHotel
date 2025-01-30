package hotel;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Chambre> chambre;
    private ArrayList<Reservation> reservations;
    private String nom;
    private String prenom;
    private String adresse;

    public Hotel(String nom, String adresse, String pays) {
        this.nom = nom;
        this.adresse = adresse;
        this.prenom = pays;
        this.chambre = new ArrayList<Chambre>();
        this.reservations = new ArrayList<Reservation>();
    }

    public void ajouterChambre(Chambre chambre1) {
        this.chambre.add(chambre1);
    }

    public void afficherChambresDisponibles() {
        System.out.println("Les chambres disponibles :");
        for (Chambre chambre : this.chambre) {
            if (chambre.getDisponibilite()) {
                System.out.println("Chambre numéro: " + chambre.getNumero());
            }
        }
    }

    public void reserverChambre(Client client1, Chambre chambre1, String dateDebut, String dateFin) {
        if (chambre1.getDisponibilite()){
            Reservation newreservation = new Reservation(client1,chambre1,dateDebut,dateFin);
            this.reservations.add(newreservation);
        }else {
            System.out.println("Chambre pas disponible");
        }
    }

    public void afficherReservations() {
        for (Reservation reservation : reservations){
            System.out.println("Voici votre reservation :");
        }
    }

    public void changerAffectation(Client client1, Chambre chambre1, Chambre chambre2) {

    }

    public void supressionReservation(Client client1, Chambre chambre2) {

    }
}

//    public void reserverChambre(Client client1, Chambre chambre1, String dateDebut, String dateFin) {
//        if (chambre1.disponibilite.equals("Libre")) {
//            chambre1.disponibilite = "Occupée";
//            Reservation nouvelleReservation = new Reservation(client1, chambre1, dateDebut, dateFin);
//            this.reservations.add(nouvelleReservation);
//            System.out.println("Réservation réussie pour le client " + client1.nom +
//                    " dans la chambre numéro " + chambre1.numero);
//        } else {
//            System.out.println("La chambre numéro " + chambre1.numero + " n'est pas disponible.");
//        }
//    }
//
//    public void afficherReservations() {
//        System.out.println("Liste des réservations :");
//        for (Reservation reservation : reservations) {
//            System.out.println("Client : " + reservation.client.nom +
//                    ", Chambre : " + reservation.chambre.numero +
//                    ", Du : " + reservation.dateDebut +
//                    ", Au : " + reservation.dateFin);
//        }
//    }
//
//    public void changerAffectation(Client client1, Chambre chambre1, Chambre chambre2) {
//        if (chambre2.disponibilite.equals("Libre")) {
//            for (Reservation reservation : reservations) {
//                if (reservation.client.equals(client1) && reservation.chambre.equals(chambre1)) {
//                    chambre1.disponibilite = "Libre";
//                    chambre2.disponibilite = "Occupée";
//                    reservation.chambre = chambre2;
//                    System.out.println("Affectation changée pour le client " + client1.nom);
//                    return;
//                }
//            }
//            System.out.println("Aucune réservation trouvée pour le client.");
//        } else {
//            System.out.println("La nouvelle chambre n'est pas disponible.");
//        }
//    }
//
//    public void supressionReservation(Client client1, Chambre chambre2) {
//        for (Reservation reservation : reservations) {
//            if (reservation.client.equals(client1) && reservation.chambre.equals(chambre2)) {
//                reservations.remove(reservation);
//                chambre2.disponibilite = "Libre";
//                System.out.println("La réservation pour le client " + client1.nom + " a été supprimée.");
//                return;
//            }
//        }
//        System.out.println("Aucune réservation trouvée pour le client.");
//    }
//}