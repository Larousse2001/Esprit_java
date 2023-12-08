package University;

import java.util.Vector;

class EspritVector implements University {
	private Vector<Etudiant> etudiants = new Vector<>();

	@Override
	public void ajouterEtudiant(Etudiant e) {
		etudiants.add(e);
	}

	@Override
	public boolean rechercherEtudiant(Etudiant e) {
		return etudiants.contains(e);
	}

	@Override
	public boolean rechercherEtudiant(String nom) {
		for (Etudiant e : etudiants) {
			if (e.getNom().equals(nom)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void supprimerEtudiant(Etudiant e) {
		etudiants.remove(e);
	}

	@Override
	public void displayEtudiants() {
		for (Etudiant e : etudiants) {
			System.out.println(e);
		}
	}

	@Override
	public void trierEtudiantsParId() {
		etudiants.sort((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
	}

	@Override
	public void trierEtudiantsParNom() {
		etudiants.sort((e1, e2) -> e1.getNom().compareTo(e2.getNom()));
	}
}
