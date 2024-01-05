package Agence;

public class Main {
    public static void main(String[] args) {
        try {
            Agence agence = new Agence("Ma Belle Agence");

            Voiture voiture1 = new Voiture(123, "Toyota", 100);
            Voiture voiture2 = new Voiture(789, "Honda", 120);

            agence.ajoutVoiture(voiture1);
            agence.ajoutVoiture(voiture2);

            Client client1 = new Client(1, "Arous", "Achref");
            Client client2 = new Client(2, "Kouki", "Iheb");

            agence.loueClientVoiture(client1, voiture1);
            agence.loueClientVoiture(client2, voiture2);

            Critere criterePrix = new CriterePrix(110);
            System.out.println("Cars with price less than or equal to 110:");
            agence.selectVoitureSelonCritere(criterePrix).forEach(System.out::println);

            System.out.println("Clients and their rented cars:");
            agence.afficheLesClientsEtLeursListesVoitures();

            agence.retourClientVoiture(client1, voiture1);

            System.out.println("\nUpdated clients and their rented cars:");
            agence.afficheLesClientsEtLeursListesVoitures();
        } catch (VoitureException e) {
            System.err.println("VoitureException: " + e.getMessage());
        }
    }
}

