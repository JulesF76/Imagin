package model;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private int id;
    private String nom;

    // Relations
    private Intervenant intervenant;
    private List<Affectation> affectations = new ArrayList<>();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    public Intervenant getResponsable() {
        return intervenant;
    }

    public void setResponsable(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public Categorie(int id, String nom, Intervenant intervenant, List<Affectation> affectations) {
        this.id = id;
        this.nom = nom;
        this.intervenant = intervenant;
        this.affectations = affectations;
    }
}