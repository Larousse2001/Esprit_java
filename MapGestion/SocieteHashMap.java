package MapGestion;

import java.util.HashMap;

public abstract class SocieteHashMap implements InterfaceSociete {
    private HashMap<Employe, Departement> employeDepartementMap;

    public SocieteHashMap() {
        employeDepartementMap = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employeDepartementMap.remove(e);
    }

    // Implement other InterfaceSociete methods similarly...

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Employe e : employeDepartementMap.keySet()) {
            System.out.println("Employe: " + e.toString() + " - Departement: " + employeDepartementMap.get(e).toString());
        }
    }

    // Implement other InterfaceSociete methods similarly...

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employeDepartementMap.containsValue(d);
    }
}

