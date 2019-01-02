/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.util.ArrayList;

/**
 *
 * @author philip
 */
public class NoDatabase {
    private static ArtikelVerwaltung verwaltung;
    private static ArrayList<Bestellung> bestellungen;
    
    public NoDatabase() {
        verwaltung = new ArtikelVerwaltung(doSomeArtikel(), doSomeBestand());
        bestellungen = new ArrayList<Bestellung>();
        doSomeBestellung();
    }
    
    private ArrayList<Artikel> doSomeArtikel() {
        ArrayList<Artikel> liste = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Artikel neu;
            String name, nummer;
            double preis;
            name = "Testartikel " + i;
            nummer = String.valueOf((i + 1) * 948524);
            preis = i * 8 + 0.99;
            neu = new Artikel(name, preis, nummer);
            liste.add(neu);
        }
        return liste;
    }
    private void doSomeBestellung() {
//        Bestellung retu;
//        ArrayList<Artikel> artikel = new ArrayList<Artikel>();
//        ArrayList<Integer> anzahl = new ArrayList<Integer>();
//        for (int i = 0; i < verwaltung.anzahlArtikel(); i++) {
//            artikel.add(verwaltung.getArtikelListenNummer(i));
//            anzahl.add(i * 10 + 5 - (i / 23));
//            System.out.println("Testbestellung " + i);
//        }
//        
        for (int i = 0; i < 6; i++) {
            ArrayList<Artikel> art = new ArrayList<Artikel>();
            ArrayList<Integer> anz = new ArrayList<Integer>();
            for (int j = 5 * i; j < (i + 1) * 4; j++) {
                art.add(verwaltung.getArtikelListenNummer(j));
                anz.add(j);
            }
            bestellungen.add(new Bestellung(art, anz, "B" + i * 57, "z.Z. kein Lieferant vorhanden"));
        }
//        
//        retu = new Bestellung(artikel, anzahl, "B" + String.valueOf(this.hashCode()));
//        return retu;
    }
    
    public int getAnzahlBestellungen() {
        return bestellungen.size();
    }
    public Bestellung getBestellungListenNummer(int i) {
        return bestellungen.get(i);
    }
    
    public void checkLeereBestellungen() {
        for (int i = 0; i < bestellungen.size(); i++) {
            Bestellung best = getBestellungListenNummer(i);
            int leereArtikel = 0;
            for (int j = 0; j < best.getAnzahlArtikel(); j++) {
                if (best.anzahlArtikel(j) == 0) {
                    leereArtikel = leereArtikel + 1;
                }
            }
            if (leereArtikel == best.getAnzahlArtikel()) {
                bestellungen.remove(i);
            }
        }
    }
    public ArtikelVerwaltung getVerwaltung() {
        return verwaltung;
    }
    private ArrayList<Integer> doSomeBestand() {
        ArrayList<Integer> bestand = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            bestand.add(i * 2);
        }
        return bestand;
    }
    public void warenEingang(int artListenNr, int anz) {
        int alteAnzahl = 5; // verwaltung.getBestandArtikel(artListenNr); //SQL Abfrage aktuelle Anzahl
        String sql = "UPDATE artikel SET bestand = "+ (alteAnzahl + anz) + " WHERE artikelNummer = " + verwaltung.getArtikelListenNummer(artListenNr).getArtikelNummer();//hier kommt eingetlich eine SQL Abfrage, die die Anzahl zum Eintrag hinzufügt
    }
    public ArrayList<Bestellung> getBestellungen() {
        String sql = "SELECT * FROM bestellung WHERE abgeschlossen = 0"; //SQL Abfrage in Objekt umwandeln
        return bestellungen;
    }
}
