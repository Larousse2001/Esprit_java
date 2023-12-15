package Gestion_Enseignents;

public class Main {
	public static void main(String[] args) {
		Enseignant enseignant1 = new Enseignant(1, "Doe", "John");
		Enseignant enseignant2 = new Enseignant(2, "Smith", "Alice");

		EspritHashSet espritHashSet = new EspritHashSet();
		espritHashSet.ajouterEnseignant(enseignant1);
		espritHashSet.ajouterEnseignant(enseignant2);
		espritHashSet.displayEnseignants();

		System.out.println("Recherche de l'enseignant 1 : " + espritHashSet.rechercherEnseignant(1));
		System.out.println("Suppression de l'enseignant 1...");
		espritHashSet.supprimerEnseignant(enseignant1);
		espritHashSet.displayEnseignants();

		EspritTreeSet espritTreeSet = new EspritTreeSet();
		espritTreeSet.ajouterEnseignant(enseignant2);
		espritTreeSet.displayEnseignants();
	}
}
