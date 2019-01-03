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
public class NoDatabaseMain {
    private static ArtikelVerwaltung verwaltung;
    private static ArrayList<Bestellung> bestellungen;
    
    public NoDatabaseMain() {
        
    }
    
    public static void main(String[] args) {
        new LagerUbersichtGUI().setVisible(true);
        ArrayList<Artikel> artikel = new ArrayList<>();
        artikel = doSomeArtikel();
        verwaltung = new ArtikelVerwaltung(artikel);
        System.out.println(verwaltung.anzahlArtikel());
    }
    
    private static ArrayList<Artikel> doSomeArtikel() {
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
            System.out.println(nummer);
        }
        
        for (int i = 0; i < 6; i++) {
            ArrayList<Artikel> art = new ArrayList<Artikel>();
            ArrayList<Integer> anz = new ArrayList<Integer>();
            for (int j = 5 * i; j < (i + 1) * 4; j++) {
                art.add(verwaltung.getArtikelListenNummer(j));
                anz.add(j);
            }
            bestellungen.add(new Bestellung(art, anz, "B" + i * 57));
        }
        return liste;
    }
    
}
