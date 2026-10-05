package test;


import model.Prestataire;
import model.Salarie;
import model.Societe;

import java.time.LocalDate;

public class TestIntervenant {
    public static void main(String[] args) {

        Societe TestSociete = new Societe(1, "TestRaisonSociale", "TestAdresse", "TestCP", "TestVille", 600.0 );

        Salarie TestSalarie = new Salarie(1, "Fossey", "Jules", LocalDate.of(2006, 7, 27),1);
        Prestataire TestPrestataireForfait = new Prestataire(2, "Elie", "Nathan", 500.0, true, TestSociete);
        Prestataire TestPrestataire = new Prestataire(3, "Cunningham", "Cade", 700.0, false, TestSociete);
    }
}