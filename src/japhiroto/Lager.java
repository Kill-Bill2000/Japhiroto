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
 * Lager DB: Spalte mit LagerNr, die in einem Lager sind (z.B. Lager, Verkaufsraum);
 * im gleichen Lager kommen in gleiche Klasse
 */
public class Lager {
    private String lager;
    private ArrayList<Artikel> artikel;
    private ArrayList<Integer> anzahl;
    
    public Lager(ArrayList<Artikel> art, ArrayList<Integer> anz, String na) {
        artikel = new ArrayList<>();
        anzahl = new ArrayList<>();
        artikel = art;
        anzahl = anz;
        lager = na;
    }
    
    public int getAnzahlArtikel() {
        return artikel.size();
    }
    public String getLagerName() {
        return lager;
    }
}
