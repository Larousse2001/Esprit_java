package Faculte;

import java.util.Objects;

public abstract class Etudiant {
    protected int identifiant;
    protected String nom;
    protected String prenom;
    protected float moyenne;
    
    // TODO 1 : Créer un constructeur paramétré pour la classe Etudiant
    public Etudiant(int identifiant, String nom, String prenom, float moyenne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public float getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	
	// TODO 2 : Redéfinir la méthode equals() pour la classe Etudiant selon l’identifiant et le nom
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    
	    Etudiant etudiant = (Etudiant) obj;
	    return identifiant == etudiant.identifiant && nom.equals(etudiant.nom);
	}
	
	// TODO 3 : Redéfinir la méthode toString() pour la classe Etudiant
	@Override
	public String toString() {
	    return "Etudiant{" +
	           "identifiant=" + identifiant +
	           ", nom='" + nom + '\'' +
	           ", prenom='" + prenom + '\'' +
	           ", moyenne=" + moyenne +
	           '}';
	}
	
	// TODO 4 : Apporter les modifications nécessaires dans la classe Etudiant pour les classes filles
	public abstract void ajouterUneAbsence();

}
