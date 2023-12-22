package MapGestion;

import java.util.TreeMap;

public abstract class SocieteTreeMap implements InterfaceSociete {
    private TreeMap<Employe, Departement> employeDepartementMap;

    public SocieteTreeMap() {
        employeDepartementMap = new TreeMap<>();
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

