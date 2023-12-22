package MapGestion;

public class Employe {
    private String cin;
    private String matricule;
    private String nom;
    private String prenom;

    // Constructeurs
    public Employe() {
    }

    public Employe(String cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    // Getters
    public String getCin() {
        return cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    // Setters
    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "Employe{" +
                "cin='" + cin + '\'' +
                ", matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    // Méthode equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return cin.equals(employe.cin);
    }
}

