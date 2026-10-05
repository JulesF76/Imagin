package model;

import java.time.LocalDate;

public class Salarie extends Intervenant {
    private LocalDate dtEmbauche;
    private int echelon;

    public LocalDate getDtEmbauche() {
        return dtEmbauche;
    }

    public void setDtEmbauche(LocalDate dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public Salarie(int id, String nom, String prenom, LocalDate dtEmbauche, int echelon) {
        super(id, nom, prenom);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }
}
