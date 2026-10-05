package test;


import model.Prestataire;
import model.Salarie;
import model.Societe;

import java.time.LocalDate;

public class TestIntervenant {
    public static void main(String[] args) {

        Societe TestSociete = new Societe(1, "TestRaisonSociale", "TestAdresse", "TestCP", "TestVille", 600.0 );

        Salarie TestSalarie = new Salarie(1, "Fossey", "Jules", LocalDate.of(2026, 10, 5),1);
        Prestataire TestPrestataireForfait = new Prestataire(2, "Elie", "Nathan", 500.0, true, TestSociete);
        Prestataire TestPrestataire = new Prestataire(3, "Cunningham", "Cade", 700.0, false, TestSociete);

        // Pour chaque intervenant, vous afficherez le nom, prénom de l’intervenant ainsi que le résultat de la méthode calculCoutProjet pour 100 jours :
        int nbJours = 100;

        // affichage pour le salarié :
        System.out.println(TestSalarie.getNom() + " " + TestSalarie.getPrenom() + " Salarié : " + TestSalarie.calculCoutProjet(nbJours) + " €");

        //affichage pour le prestataire avec forfait
        System.out.println(TestPrestataireForfait.getNom() + " " + TestPrestataireForfait.getPrenom() + " Prestataire Au Forfait : " + TestPrestataireForfait.calculCoutProjet(nbJours) + " €");

        //affichage pour le prestataire hors forfait
        System.out.println(TestPrestataire.getNom() + " " + TestPrestataire.getPrenom() + " Prestataire Hors Forfait : " + TestPrestataire.calculCoutProjet(nbJours) + " €");
    }
}