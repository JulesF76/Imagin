package model;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private int id;
    private String nom;

    // Relations
    private Intervenant responsable;
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
        return responsable;
    }

    public void setResponsable(Intervenant responsable) {
        this.responsable = responsable;
    }
}