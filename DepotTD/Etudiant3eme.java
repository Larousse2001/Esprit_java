package Faculte;

public class Etudiant3eme extends Etudiant {
	//TODO 5 : Compléter la déclaration de la classe Etudiant3eme
	private String branche;
	
	// TODO 6 : Créer le constructeur paramétré de Etudiant3eme
	public Etudiant3eme(int identifiant, String nom, String prenom, float moyenne, String branche) {
		super(identifiant, nom, prenom, moyenne);
		this.branche = branche;
	}
	
	// TODO 7 : Écrire la méthode «void ajouterUneAbsence () » pour Etudiant3eme
	@Override
	public void ajouterUneAbsence() {
		moyenne -= 0.5;
	}

	public String getBranche() {
		return branche;
	}

	public void setBranche(String branche) {
		this.branche = branche;
	}
}
