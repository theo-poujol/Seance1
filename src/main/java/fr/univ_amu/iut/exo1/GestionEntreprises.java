package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {


        Entreprise maBoiteInfo = new Entreprise("Space X", new ArrayList<Employe>());

        Employe ElonMusk = new Employe(1,"123456", "Elon","Musk",
                                       100, LocalDate.of(1971, Month.JUNE,28),
                                       LocalDate.of(2002,Month.MAY,6),
                                       150,60);


        Employe JulienMartin = new Employe(2,"654321", "Julien","Martin",
                100, LocalDate.of(1999, Month.JUNE,12),
                LocalDate.of(2023,Month.MAY,4),
                60,40);

        maBoiteInfo.embaucherEmploye(ElonMusk);
        maBoiteInfo.embaucherEmploye(JulienMartin);

        System.out.println(maBoiteInfo);

    }
}