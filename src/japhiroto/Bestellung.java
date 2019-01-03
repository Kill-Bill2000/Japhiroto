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
    private String lieferant;
    
    public Bestellung(ArrayList<Artikel> art, ArrayList<Integer> anz, String bestellNr, String lief) {
        anzahl = anz;
        artikel = art;
        bestellNummer = bestellNr;
        lieferant = lief;
    }
    
    public void artikelAngekommen(int art, int anz) {
        if (anz == anzahl.get(art)) {
            artikel.remove(art);
            anzahl.remove(art);
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
    public String getLieferant() {
        return lieferant;
    }
    public int anzahlArtikelNr(String nr) {
        int a = 0;
        for (int i = 0; i < artikel.size(); i++) {
            if (artikel.get(i).getArtikelNummer() == nr) {
                a = i;
                i = artikel.size();
            }
        }
        return a;
    }
}
