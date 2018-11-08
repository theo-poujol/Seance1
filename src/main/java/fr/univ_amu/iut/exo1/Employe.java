package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Employe {

    private  int    num_em;
    private  String num_sec;
    private  String nom_employe;
    private  String prenom_employe;
    private  int    echelon;

    private LocalDate date_naissance;
    private LocalDate date_embauche;

    private double base;
    private double nbHeures;

    public Employe(int num_em, String num_sec, String nom_employe, String prenom_employe, int echelon, LocalDate date_naissance, LocalDate date_embauche, double base, double nbHeures) {
        this.num_em = num_em;
        this.num_sec = num_sec;
        this.nom_employe = nom_employe;
        this.prenom_employe = prenom_employe;
        this.echelon = echelon;
        this.date_naissance = date_naissance;
        this.date_embauche = date_embauche;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    public int getNum_em() {
        return num_em;
    }

    public String getNum_sec() {
        return num_sec;
    }

    public String getNom_employe() {
        return nom_employe;
    }

    public String getPrenom_employe() {
        return prenom_employe;
    }

    public int getEchelon() {
        return echelon;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public LocalDate getDate_embauche() {
        return date_embauche;
    }

    public double getBase() {
        return base;
    }

    public double getNbHeures() {
        return nbHeures;
    }

    public double getSalaireBrut() {
        return this.getBase() * this.getNbHeures();
    }

    public double getSalaireNet() {
        return 0.8 * this.getSalaireBrut();
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String date_naissanceFormattee = date_naissance.format(formatter);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String date_embaucheFormattee = date_embauche.format(formatter2);


        return

                "------ EMPLOYE ------" + '\n' +
                "  Numéro employé : " + num_em + '\n' +
                "  Numéro sécurité sociale :"  + num_sec + '\n' +
                "  Nom : " + nom_employe + '\n' +
                "  Prenom : " + prenom_employe + '\n' +
                "  Echelon : " + echelon + '\n' +
                "  Date de naissance : " + date_naissanceFormattee + '\n' +
                "  Date d'embauche : " + date_embaucheFormattee    + '\n' +
                "  Base : " + base + '\n' +
                "  Nombres d'heures : " + nbHeures + '\n' +
                "  Salaire brut : " + this.getSalaireBrut() + '€' + '\n' +
                "  Salaire net  : " + this.getSalaireNet()  + '€' + '\n' +
                "---------------------" + '\n';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return num_em == employe.num_em &&
                echelon == employe.echelon &&
                Double.compare(employe.base, base) == 0 &&
                Double.compare(employe.nbHeures, nbHeures) == 0 &&
                Objects.equals(num_sec, employe.num_sec) &&
                Objects.equals(nom_employe, employe.nom_employe) &&
                Objects.equals(prenom_employe, employe.prenom_employe) &&
                Objects.equals(date_naissance, employe.date_naissance) &&
                Objects.equals(date_embauche, employe.date_embauche);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num_em, num_sec, nom_employe, prenom_employe, echelon, date_naissance, date_embauche, base, nbHeures);
    }
}
