package fr.univ_amu.iut.exo1;

import java.util.ArrayList;

public class Entreprise {

    private String nom_entreprise;
    private ArrayList<Employe> liste_employe = new ArrayList<Employe>();

    public Entreprise(String nom_entreprise, ArrayList<Employe> liste_employe) {
        this.nom_entreprise = nom_entreprise;
        this.liste_employe = liste_employe;
    }


    public String getNom_entreprise() {
        return nom_entreprise;
    }

    public void setNom_entreprise(String nom_entreprise) {
        this.nom_entreprise = nom_entreprise;
    }

    public void embaucherEmploye(Employe e) {

        // Si l'employé ne vaut pas null
        if ( !(e == null) ) {
            liste_employe.add(e);
        }
    }

    public void licencierEmploye(Employe e) {
        liste_employe.remove(e);
    }


    @Override
    public String toString() {
        return "Entreprise " +
                nom_entreprise + '\n' +
                "A pour employés" + liste_employe
                ;
    }
}
