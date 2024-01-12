package lastTp;

import java.util.*;
import java.util.stream.Collectors;

public class Hopital {
	public Map<Medecin, ListPatients> medecinPatiens;

	public Hopital() {
		medecinPatiens = new TreeMap<>(Comparator.comparing(Medecin::getNom));
	}

	public void ajouterMedecin(Medecin m) {
		medecinPatiens.put(m, new ListPatients());
	}

	public void ajouterPatient(Medecin m, Patient p) {
		if (medecinPatiens.containsKey(m)) {
			ListPatients listPatients = medecinPatiens.get(m);
			listPatients.ajouterPatient(p);
		} else {
			ListPatients newList = new ListPatients();
			newList.ajouterPatient(p);
			medecinPatiens.put(m, newList);
		}
	}

	public void afficherMap() {
		medecinPatiens.forEach((medecin, patients) -> {
			System.out.println("Médecin : " + medecin);
			patients.afficherPatients();
			System.out.println("-------------------------");
		});
	}

	public void afficherMedcinPatients(Medecin m) {
		if (medecinPatiens.containsKey(m)) {
			ListPatients patients = medecinPatiens.get(m);
			patients.afficherPatients();
		} else {
			System.out.println("Médecin non trouvé.");
		}
	}

	public List<String> RetournerNomPatients() {
	    return medecinPatiens.values()
				             .stream()
				             .flatMap(patients -> patients.getListP().stream())
				             .map(Patient::getNom)
				             .collect(Collectors.toList());
	}
}
