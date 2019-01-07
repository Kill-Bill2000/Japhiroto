/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

/**
 *
 * @author robin
 */
public class Umsatz {
    
    private int umsatzNr;
    private String zeitstempel;
    private double umsatz;

    public Umsatz(int umsatzNr, String zeitstempel, double umsatz) {
        //initialisiert die Variablen mit den übergebenen Werten
        this.umsatzNr = umsatzNr;
        this.zeitstempel = zeitstempel;
        this.umsatz = umsatz;
    }

    public Umsatz() {
        //Standardkonstruktor
    }

    public int getUmsatzNr() {
        //gibt die gespeicherte Mitarbeiter-ID aus
        return umsatzNr;
    }

    public void setUmsatzNr(int umsatzNr) {
        //speichert die übergebene Mitarbeiter-ID in die Variable
        this.umsatzNr = umsatzNr;
    }

    public String getZeitstempel() {
        //gibt die gespeicherte Anrede aus
        return zeitstempel;
    }

    public void setZeitstempel(String zeitstempel) {
        //speichert die übergebene Anrede in die Variable
        this.zeitstempel = zeitstempel;
    }

    public double getUmsatz() {
        //gibt den gespeicherten Stundenlohn aus
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        //speichert den übergebenen Stundenlohn in die Variable
        this.umsatz = umsatz;
    }
    
    
    
    
    
    
}
