package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {


        Commerciaux commercial = new Commerciaux(2,"789456","Howells","Sam",30, LocalDate.of(1971, Month.JUNE,28),
                LocalDate.of(2002,Month.MAY,6),60,40);
        EmployesOrdinaires ordinaire = new EmployesOrdinaires(3,"7894787","Ribes","Axel",90, LocalDate.of(1971, Month.JUNE,28),
                LocalDate.of(2002,Month.MAY,6),60,40);;
        Representant representant = new Representant(10,"10000","Poujol","Théo",100, LocalDate.of(1971, Month.JUNE,28),
                LocalDate.of(2002,Month.MAY,6),60,40);
        Techniciens technicien = new Techniciens(2,"789456","Vignal","Nathan",30, LocalDate.of(1971, Month.JUNE,28),
                LocalDate.of(2002,Month.MAY,6),60,40);

        commercial.setTauxCommission(0.5);
        commercial.setChiffreAffaires(999999999);

        representant.setChiffreAffaires(999999999);
        representant.setTauxCommission(1);

        technicien.setNbUnitesProduites(400);
        technicien.setTauxCommissionUnite(0.3);

        Entreprise maBoiteInfo = new Entreprise("Space X", new ArrayList<Employe>());
        maBoiteInfo.embaucherEmploye(commercial);
        maBoiteInfo.embaucherEmploye(representant);
        maBoiteInfo.embaucherEmploye(technicien);
        maBoiteInfo.embaucherEmploye(ordinaire);

        System.out.println(maBoiteInfo);


    }





}