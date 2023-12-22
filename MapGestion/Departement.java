package MapGestion;

public class Departement {
    private int identifiant;
    private String nom;

    // Constructeurs
    public Departement() {
    }

    public Departement(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }

    // Getters et Setters
    // Getters
    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    // Setters
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "Departement{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                '}';
    }

    // Méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return identifiant == that.identifiant;
    }
}
