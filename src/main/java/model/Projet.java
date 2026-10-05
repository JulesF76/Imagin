package model;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private int id;
    private String nom;
    private double budgetPrevu;
    private int nbJoursHPrevu;

    // Relations
    private Intervenant intervenantResponsable;
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

    public Intervenant getIntervenantResponsable() {
        return intervenantResponsable;
    }

    public void setIntervenantResponsable(Intervenant intervenant) {
        this.intervenantResponsable = intervenant;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    public Projet(int id, String nom, double budgetPrevu, int nbJoursHPrevu, Intervenant intervenantResponsable, List<Affectation> affectations) {
        this.id = id;
        this.nom = nom;
        this.budgetPrevu = budgetPrevu;
        this.nbJoursHPrevu = nbJoursHPrevu;
        this.intervenantResponsable = intervenantResponsable;
        this.affectations = affectations;
    }
}
