package model;

public class Prestataire extends Intervenant {
    private boolean forfait;
    private double coutJournalier;
    private Societe societe;

    public boolean isForfait() {
        return forfait;
    }

    public void setForfait(boolean forfait) {
        this.forfait = forfait;
    }

    public double getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    public Societe getSociete() {
        return societe;
    }

    public void setSociete(Societe societe) {
        this.societe = societe;
    }

    public Prestataire(int id, String nom, String prenom, double coutJournalier, boolean forfait, Societe societe) {
        super(id, nom, prenom);
        this.coutJournalier = coutJournalier;
        this.forfait = forfait;
        this.societe = societe;
    }

    @Override
    public double calculCoutProjet(int nbJours) {
        return nbJours * this.coutJournalier;
    }
}
