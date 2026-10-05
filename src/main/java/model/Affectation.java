package model;

public class Affectation {
    private int annee;
    private int semaine;
    private int tempsPasse;

    // Relations
    private Intervenant intervenant;
    private Projet projet;

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getSemaine() {
        return semaine;
    }

    public void setSemaine(int semain) {
        this.semaine = semain;
    }

    public int getTempsPasse() {
        return tempsPasse;
    }

    public void setTempsPasse(int tempsPasse) {
        this.tempsPasse = tempsPasse;
    }

    public Affectation(int annee, int semaine, int tempsPasse) {
        this.annee = annee;
        this.semaine = semaine;
        this.tempsPasse = tempsPasse;
    }

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(Intervenant intervenant) {
        this.intervenant = intervenant;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
}
