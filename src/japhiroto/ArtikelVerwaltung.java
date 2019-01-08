/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author philip
 */
public class ArtikelVerwaltung {
    private ArrayList<Artikel> artikelListe;
    private DB_Verbindung db;
    
    public ArtikelVerwaltung() throws IOException, SQLException {
        this.db = new DB_Verbindung();
        db.verbindungAufbauen();
        ArrayList<Artikel> artList = db.getArtikelListe();
        artikelListe = artList;
    }
    
    public Artikel getArtikel(String artikelNummer) throws SQLException {
        return db.getArtikel(artikelNummer);
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

    private boolean checkName(String artName, String vergleich) {
        boolean ret;
        if (artName.contains(vergleich) || artName.startsWith(vergleich) || artName.endsWith(vergleich) || artName.equals(vergleich)) {
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
    private int getListenPlatz(String artNr) {
        int ret = -1;
        
        for (int i = 0; i < artikelListe.size(); i++) {
            String artiNr = artikelListe.get(i).getArtikelNummer();
            if (artiNr.equals(artNr)) {
                ret = i;
                i = artikelListe.size();
            }
        }
        
        return ret;
    }
    public int getBestandArtikel(String artNr) throws SQLException {
        return db.getArtikel(artNr).getAnzahl();
    }
    public Artikel getArtikelListenNummer(int nr) {
        return artikelListe.get(nr);
    }
    public void artikelVerkaufen(String artNr, int anz) throws SQLException, IOException {
        int a = 0;
        for (int i = 0; i < artikelListe.size(); i++) {
            String artiNr = artikelListe.get(i).getArtikelNummer();
            if (artiNr.equals(artNr)) {
                a = i;
                i = artikelListe.size();
            }
        }
        db.verkaufeArtikel(artNr, anz);
    }
    public void verbindungSchliessen() throws SQLException {
        db.verbindungSchliessen();
    }
    public ArrayList<Artikel> sucheArtikel(String gesuchteArtNr) throws SQLException {
        return db.getArtikelFromNr(gesuchteArtNr);
    }
}

