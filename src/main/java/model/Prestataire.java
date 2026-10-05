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

    /* Première méthode de calcul
    @Override
    public double calculCoutProjet(int nbJours) {
        return nbJours * this.coutJournalier;
    }
    */


    /* c) La méthode de calcul du prestataire est erronée. Pour le prestataire, il y a deux façons de calculer le coût du projet :
       - Si le prestataire est au forfait, le coût journalier à appliquer est celui de sa société.
       - Sinon, on applique le coût journalier du prestataire lui même.
    */


    @Override
    public double calculCoutProjet(int nbJours) {
        if (this.forfait && this.societe != null) { // Si le prestataire est au forfait, on applique le coût journalier de sa société
            return nbJours * this.societe.getCoutJournalier();
        } else { // Sinon, on applique le coût journalier propre du prestataire
            return nbJours * this.coutJournalier;
        }
    }
    // grâce a cette nouvelle méthode de calcul je passe pour un prestataire ayant un forfait a la valeur de la societe et non plus la valeur que lui possède au journalier 

}
