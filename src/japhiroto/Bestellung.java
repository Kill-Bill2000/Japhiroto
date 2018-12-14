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
    
    public void artikelAngekommen(Artikel art, int anz) {
        for (int i = 0; i < artikel.size(); i++) {
            if (artikel.get(i) == art) {
                if (anzahl.get(i) == anz) {
                    artikel.remove(i);
                    anzahl.remove(i);
                }
                else {
                    int neu;
                    neu = anzahl.get(i) - anz;
                    anzahl.set(i, neu);
                }
            }
        }
    }
    public String getBestellNr() {
        return bestellNummer;
    }
}
