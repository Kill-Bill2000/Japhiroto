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
public class Bestellung {
    private ArrayList<Artikel> artikel;
    private ArrayList<Integer> anzahl;
    private String bestellNummer;
    
    public Bestellung(ArrayList<Artikel> art, ArrayList<Integer> anz, String bestellNr) {
        anzahl = anz;
        artikel = art;
        bestellNummer = bestellNr;
    }
    
    public void artikelAngekommen(int art, int anz) {
        if (anz == anzahl.get(art)) {
            artikel.remove(anz);
            anzahl.remove(anz);
        }
        else {
            int alt, neu;
            alt = anzahl.get(art);
            neu = alt - anz;
            anzahl.set(art, neu);
        }
    }
    public String getBestellNr() {
        return bestellNummer;
    }
    public int getAnzahlArtikel() {
        return artikel.size();
    }
    public Artikel bestellterArtikel(int nr) {
        return artikel.get(nr);
    }
    public int anzahlArtikel(int nr) {
        return anzahl.get(nr);
    }
}
