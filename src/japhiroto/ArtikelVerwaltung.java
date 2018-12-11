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
public class ArtikelVerwaltung {
    private static ArrayList<Artikel> artikelListe;
    
    public ArtikelVerwaltung(ArrayList<Artikel> artikel) {
        artikelListe = artikel; //kommentar
    }
    public ArtikelVerwaltung() {
    }
    
    public Artikel getArtikelFromNummer(String artikelNummer) {
        Artikel gesuchterArtikel = null;
        for (int i = 0; i < artikelListe.size(); i++) {
            if (checkName(artikelListe.get(i).getArtikelNummer(), artikelNummer)) {
                artikelListe.get(i);
                i = artikelListe.size();
            }
        }
        return gesuchterArtikel;
    }
    public ArrayList<Artikel> getArtikelListeFromNummer(String artNr) {
        ArrayList<Artikel> gesuchteArtikel = null;
        for (int i = 0; i < artikelListe.size(); i++) {
            if (checkName(artikelListe.get(i).getArtikelNummer(), artNr)) {
                gesuchteArtikel.add(artikelListe.get(i));
            }
        }
        return gesuchteArtikel;
    }
//    public Artikel getArtikelFromName(String name) {
//        Artikel gesuchterArtikel = null;
//        for (int i = 0; i < artikelListe.size(); i++) {
//            String artName = artikelListe.get(i).getName();
//            if (artName.contains(name) || artName.startsWith(name) || artName.endsWith(name)) {
//                gesuchterArtikel = artikelListe.get(i);
//                i = artikelListe.size();
//            }
//        }
//        return gesuchterArtikel;
//    }
    private boolean checkName(String artName, String vergleich) {
        boolean ret;
        if (artName.contains(vergleich) || artName.startsWith(vergleich) || artName.endsWith(vergleich)) {
            ret = true;
        }
        else {
            ret = false;
        }
        return ret;
    }
    
    public int anzahlArtikel() {
        return artikelListe.size();
    }
    public Artikel getArtikelListenNummer(int nr) {
        return artikelListe.get(nr);
    }
}