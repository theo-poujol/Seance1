package fr.univ_amu.iut.exo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vendeur extends Commerciaux {
    public Vendeur(int num_em, String num_sec, String nom_employe, String prenom_employe, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures) {
        super(num_em, num_sec, nom_employe, prenom_employe, echelon, date_naissance, date_embauche, base, nbHeures);
    }

    @Override
    public double getSalaireBrut() {
     Commerciaux commercial = new Commerciaux(super.getNum_em(),super.getNum_sec(),super.getNom_employe(), super.getPrenom_employe(),super.getEchelon(), super.getDate_naissance(), super.getDate_embauche(),super.getBase(),super.getNbHeures());
     return commercial.getSalaireBrut();

    }


    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String date_naissanceFormattee = this.getDate_naissance().format(formatter);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String date_embaucheFormattee = this.getDate_embauche().format(formatter2);

        return "Vendeur " +

                "  Numéro employé : " + super.getNum_em() + '\n' +
                "  Numéro sécurité sociale :"  + super.getNum_sec() + '\n' +
                "  Nom : " + super.getNom_employe() + '\n' +
                "  Prenom : " + super.getPrenom_employe() + '\n' +
                "  Echelon : " + super.getEchelon() + '\n' +
                "  Date de naissance : " + date_naissanceFormattee + '\n' +
                "  Date d'embauche : " + date_embaucheFormattee    + '\n' +
                "  Base : " + super.getBase() + '\n' +
                "  Nombres d'heures : " + super.getNbHeures()     + '\n' +
                "  Salaire brut : " + super.getSalaireBrut() + '€' + '\n' +
                "  Salaire net  : " + super.getSalaireNet()  + '€' + '\n' +
                "  Role : Commercial // vendeur " + '\n' +
                "  Tâches : Vendre " +
                "  Chiffre d'affaires : " + super.getChiffreAffaires() +
                "  Taux de commission : " + super.getTauxCommission() +
                "---------------------" + '\n';

    }
}
