package University;

import java.util.Objects;

class Etudiant {
	private int id;
	private String nom;
	private String prenom;

	// Constructeurs
	public Etudiant() {
	}

	public Etudiant(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	// Accesseurs et mutateurs
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	// Redéfinition de equals
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Etudiant etudiant = (Etudiant) o;
		return id == etudiant.id;
	}

	// Redéfinition de toString
	@Override
	public String toString() {
		return "Etudiant{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
	}
}
