package model;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private int id;
    private String nom;
    private double budgetPrevu;
    private int nbJoursHPrevu;

    // Relations
    private Intervenant intervenants;
    private List<Affectation> affectations = new ArrayList<>();

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

    public int getNbJoursHPrevu() {
        return nbJoursHPrevu;
    }

    public void setNbJoursHPrevu(int nbJoursHPrevu) {
        this.nbJoursHPrevu = nbJoursHPrevu;
    }

    public double getBudgetPrevu() {
        return budgetPrevu;
    }

    public void setBudgetPrevu(double budgetPrevu) {
        this.budgetPrevu = budgetPrevu;
    }

    public Projet(int id, String nom, double budgetPrevu, int nbJoursHPrevu) {
        this.id = id;
        this.nom = nom;
        this.budgetPrevu = budgetPrevu;
        this.nbJoursHPrevu = nbJoursHPrevu;
    }

    public Intervenant getIntervenant() {
        return intervenants;
    }

    public void setIntervenants(Intervenant intervenant) {
        this.intervenants = intervenants;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    public Projet(int id, String nom, double budgetPrevu, int nbJoursHPrevu, Intervenant intervenants, List<Affectation> affectations) {
        this.id = id;
        this.nom = nom;
        this.budgetPrevu = budgetPrevu;
        this.nbJoursHPrevu = nbJoursHPrevu;
        this.intervenants = intervenants;
        this.affectations = affectations;
    }
}
