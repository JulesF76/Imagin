package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Intervenant {
    private int id;
    private String nom;
    private String prenom;

    // Relations
    private Categorie categorie;
    private List<Affectation> affectations = new ArrayList<>();
    private List<Projet> projetsResponsables = new ArrayList<>();

    public Intervenant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Intervenant(int id, String nom, String prenom, Categorie categorie, List<Affectation> affectations, List<Projet> projetsResponsables) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.categorie = categorie;
        this.affectations = affectations;
        this.projetsResponsables = projetsResponsables;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Getters / Setters Categorie (Ajoutés)
    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    public List<Projet> getProjetsResponsables() {
        return projetsResponsables;
    }

    public void setProjetsResponsables(List<Projet> projets) {
        this.projetsResponsables = projets; // Corrigé
    }

    public abstract double calculCoutProjet(int nbJours);
}