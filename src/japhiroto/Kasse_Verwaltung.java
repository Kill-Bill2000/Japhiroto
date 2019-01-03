/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.sql.*;
import java.util.ArrayList;

    

/**
 *
 * @author Jan
 */
public class Kasse_Verwaltung {
    
    private DB_Verbindung dieDB_Verbindung;

    public Kasse_Verwaltung(DB_Verbindung dieDB_Verbindung) throws SQLException{
        this.dieDB_Verbindung = dieDB_Verbindung;
        dieDB_Verbindung.verbindungAufbauen();
    }
    
    
    
    
    
    
    
    
    
    
    public Artikel artikelSuchen(String artikelNr) throws SQLException{
        
        Artikel rArtikel;
        rArtikel = dieDB_Verbindung.getArtikel(artikelNr);
        return rArtikel;
    }
    public Artikel artikelSuchenMitAnzahl(String artikelNr,int anz) throws SQLException{
        
        Artikel rArtikel;
        rArtikel = dieDB_Verbindung.getArtikelMitAnzahl(artikelNr,anz);
        return rArtikel;
    }
    public double gesamtbetragBerechnen(ArrayList<Artikel> artikelliste){
        double gesamtBetrag=0;
        for (int i = 0; i <= artikelliste.size(); i++) {
            
            gesamtBetrag = gesamtBetrag + (artikelliste.get(i).getPreis()*artikelliste.get(i).getAnzahl());
        }
        return gesamtBetrag;
    }
    
    
}