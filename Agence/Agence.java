package Agence;

import java.util.*;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client, ListVoitures> ClientVoitureLoue;

    public Agence(String nom) {
        this.setNom(nom);
        this.vs = new ListVoitures();
        this.ClientVoitureLoue = new HashMap<>();
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

    public void ajoutVoiture(Voiture v) throws VoitureException {
        vs.ajoutVoiture(v);
    }

    public void suppVoiture(Voiture v) throws VoitureException {
        vs.supprimeVoiture(v);
    }

    public void loueClientVoiture(Client cl, Voiture v) throws VoitureException {
        if (!ClientVoitureLoue.containsKey(cl)) {
            ClientVoitureLoue.put(cl, new ListVoitures());
        }
        ClientVoitureLoue.get(cl).ajoutVoiture(v);
    }

    public void retourClientVoiture(Client cl, Voiture v) throws VoitureException {
        if (ClientVoitureLoue.containsKey(cl)) {
            ClientVoitureLoue.get(cl).supprimeVoiture(v);
        } else {
            throw new VoitureException("Le client n'a pas de voiture à retourner.");
        }
    }

    public List<Voiture> selectVoitureSelonCritere(Critere c) {
        List<Voiture> voituresSelonCritere = new ArrayList<>();

        for (Voiture voiture : vs.getVoitures()) {
            if (c.estSatisfaitPar(voiture)) {
                voituresSelonCritere.add(voiture);
            }
        }

        return voituresSelonCritere;
    }

    public Set<Client> ensembleClientsLoueurs() {
        return ClientVoitureLoue.keySet();
    }

    public Collection<ListVoitures> collectionVoituresLouees() {
        return ClientVoitureLoue.values();
    }

    public void afficheLesClientsEtLeursListesVoitures() {
        for (Map.Entry<Client, ListVoitures> e : ClientVoitureLoue.entrySet()) {
            System.out.println("Client: " + e.getKey());
            e.getValue().affiche();
        }
    }

    public Map<Client, ListVoitures> triCodeCroissant() {
        TreeMap<Client, ListVoitures> sortedMap = new TreeMap<>();
        sortedMap.putAll(ClientVoitureLoue);
        return sortedMap;
    }

    public Map<Client, ListVoitures> triNomCroissant() {
        TreeMap<Client, ListVoitures> sortedMap = new TreeMap<>();
        sortedMap.putAll(ClientVoitureLoue);
        return sortedMap;
    }
}

