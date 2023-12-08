package University;

public class Main {
	public static void main(String[] args) {
		// Tester les m�thodes des classes EspritArrayList et EspritVector
		University universityArrayList = new EspritArrayList();
		testUniversity(universityArrayList);

		University universityVector = new EspritVector();
		testUniversity(universityVector);
	}

	private static void testUniversity(University university) {
		Etudiant etudiant1 = new Etudiant(1, "Nom1", "Prenom1");
		Etudiant etudiant2 = new Etudiant(2, "Nom2", "Prenom2");
		Etudiant etudiant3 = new Etudiant(3, "Nom3", "Prenom3");

		university.ajouterEtudiant(etudiant1);
		university.ajouterEtudiant(etudiant2);
		university.ajouterEtudiant(etudiant3);

		System.out.println("Liste des �tudiants :");
		university.displayEtudiants();

		System.out.println("\nRechercher �tudiant par objet : " + university.rechercherEtudiant(etudiant2));
		System.out.println("Rechercher �tudiant par nom : " + university.rechercherEtudiant("Nom1"));

		System.out.println("\nSupprimer un �tudiant :");
		university.supprimerEtudiant(etudiant1);
		university.displayEtudiants();

		System.out.println("\nTrier les �tudiants par ID :");
		university.trierEtudiantsParId();
		university.displayEtudiants();

		System.out.println("\nTrier les �tudiants par nom :");
		university.trierEtudiantsParNom();
		university.displayEtudiants();
	}
}
