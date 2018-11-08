package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Commerciaux extends Employe{

    protected double ChiffreAffaires;
    protected double tauxCommission;


    public Commerciaux(int num_em, String num_sec, String nom_employe, String prenom_employe, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures) {
        super(num_em, num_sec, nom_employe, prenom_employe, echelon, date_naissance, date_embauche, base, nbHeures);
    }

    public double getChiffreAffaires() {
        return ChiffreAffaires;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }


    @Override
    public double getSalaireBrut() { return (super.getBase() + getChiffreAffaires() * getTauxCommission() ) + 100 ; }


    public String negocierTransaction() {
        return "Je négocie une transaction";
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String date_naissanceFormattee = this.getDate_naissance().format(formatter);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String date_embaucheFormattee = this.getDate_embauche().format(formatter2);


        return

                "------ EMPLOYE ------" + '\n' +
                        "  Numéro employé : " + this.getNum_em() + '\n' +
                        "  Numéro sécurité sociale :"  + this.getNum_sec() + '\n' +
                        "  Nom : " + this.getNom_employe() + '\n' +
                        "  Prenom : " + this.getPrenom_employe() + '\n' +
                        "  Echelon : " + this.getEchelon() + '\n' +
                        "  Date de naissance : " + date_naissanceFormattee + '\n' +
                        "  Date d'embauche : " + date_embaucheFormattee    + '\n' +
                        "  Base : " + this.getBase() + '\n' +
                        "  Nombres d'heures : " + this.getNbHeures()     + '\n' +
                        "  Salaire brut : " + this.getSalaireBrut() + '€' + '\n' +
                        "  Salaire net  : " + this.getSalaireNet()  + '€' + '\n' +
                        "  Role : Commercial " + '\n' +
                        "  Tâches : " + this.negocierTransaction() +
                        "---------------------" + '\n';

    }


    public void setChiffreAffaires(double chiffreAffaires) {
        ChiffreAffaires = chiffreAffaires;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }
}
