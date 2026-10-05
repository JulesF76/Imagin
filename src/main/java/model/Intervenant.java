package model;

import java.util.ArrayList;
import java.util.List;

public class Intervenant {
    private int id;
    private String nom;
    private String prenom;

    // Relations
    private List<Affectation> affectations = new ArrayList<>();
    private List<Projet> projetsResponsable = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Intervenant(int id, String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    public List<Projet> getProjetsResponsable() {
        return projetsResponsable;
    }

    public void setProjetsResponsable(List<Projet> projetsResponsable) {
        this.projetsResponsable = projetsResponsable;
    }

    public Intervenant(int id, String nom, String prenom, List<Affectation> affectations, List<Projet> projetsResponsable) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.affectations = affectations;
        this.projetsResponsable = projetsResponsable;
    }
}
