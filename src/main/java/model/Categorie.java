package model;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private int id;
    private String nom;

    // Association 1 -> * vers Intervenant
    private List<Intervenant> intervenants = new ArrayList<>();

    public Categorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Categorie(int id, String nom, List<Intervenant> intervenants) {
        this.id = id;
        this.nom = nom;
        this.intervenants = intervenants;
    }

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

    public List<Intervenant> getIntervenants() {
        return intervenants;
    }

    public void setIntervenants(List<Intervenant> intervenants) {
        this.intervenants = intervenants;
    }
}