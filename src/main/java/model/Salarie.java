package model;

import java.time.LocalDate;

public class Salarie {
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

    public Salarie(LocalDate dtEmbauche, int echelon) {
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }
}
