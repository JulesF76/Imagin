package model;

public class Prestataire {
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

    public Prestataire(double coutJournalier, boolean forfait, Societe societe) {
        this.coutJournalier = coutJournalier;
        this.forfait = forfait;
        this.societe = societe;
    }
}
